package com.iopts.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.skyun.app.util.config.AppConfig;
import com.skyun.app.util.database.ibatis.SqlMapInstanceBATCH;
import com.skyun.app.util.database.ibatis.vo.EmailItemVo;
import com.skyun.app.util.database.ibatis.vo.EmailVo;
import com.skyun.app.util.database.ibatis.vo.MailForm;
import com.skyun.app.util.database.ibatis.vo.PersonalVo;
import com.skyun.app.util.database.ibatis.vo.eMasterVo;
import com.skyun.app.util.database.ibatis.vo.pi_topcompVo;
import com.skyun.app.util.database.ibatis.vo.pifindVo;

public class DaemonThread implements Runnable {
	private static SqlMapClient sqlMapPIC = null;
	List<pi_topcompVo> predata = new ArrayList<pi_topcompVo>();

	private String tgt_zip = "";
	private String tgt = "";
	private MailForm M = new MailForm();
	private static Logger logger = LoggerFactory.getLogger(DaemonThread.class);

	public DaemonThread() {
		//int seq = getFileNo(AppConfig.getProperty("config.email.path"));
		
		// tgt = AppConfig.getProperty("config.email.path") + "/" +
		// String.format("%s_%s_%s_%06d.txt",
		// AppConfig.getProperty("config.email.init"), getCDate(),
		// AppConfig.getProperty("config.email.division"), seq);
		/*tgt = AppConfig.getProperty("config.email.path") + "/" + String.format("BODY.mail");
		tgt_zip = AppConfig.getProperty("config.email.path") + "/"
				+ String.format("%s_%s_%s_%06d.zip", AppConfig.getProperty("config.email.init"), getCDate(), AppConfig.getProperty("config.email.division"), seq);*/

		this.sqlMapPIC = SqlMapInstanceBATCH.getSqlMapInstance();
		System.out.println("Batch work of information in the ti_topcomp table");
		System.out.println("Agent connection failure send to mail ");
	}

	@Override
	public void run() {

		try {
			predata = this.sqlMapPIC.openSession().queryForList("query.getPreCount");
			getNowData();
//			UpdateDelDate();
//			sendMail();

//			for (int i = 1; i < 8; i++) {
//				sendMailLoop(i);
//			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getLocalizedMessage());
		}

	}

	private void sendMail() {
		String strDisconnect = "\n\nAGENT_NAME AGENT_CONNECTED_IP AGENT_CONNECTED\n";
		try {
			List<EmailItemVo> email = this.sqlMapPIC.openSession().queryForList("query.getAgentDisconnectList");
			

			EmailVo emailobj = new EmailVo();

			emailobj.setTitle2();

			String originalStr = AppConfig.getProperty("config.security.chargename");
			String nmae = new String(originalStr.getBytes("iso-8859-1"), "utf-8");

			String imsi = M.get_header(8).replaceAll("_rname_", nmae).replaceAll("_sabun_", AppConfig.getProperty("config.security.charge"));
			
			

			for (EmailItemVo evo : email) {
				imsi = imsi + "<tr> \n";
				imsi = imsi + "<td class=\"tg-fymr\">" + evo.getAgent_name() + "</td>\n";
				imsi = imsi + "<td class=\"tg-fymr\">" + evo.getAgent_connected_ip() + "</td>\n";
				imsi = imsi + "</tr>\n";

			}

			imsi = imsi + M.get_end(8);
			emailobj.setContents(imsi);

			emailobj.setSender(AppConfig.getProperty("config.email.senderid"));
			emailobj.setReceiver(AppConfig.getProperty("config.email.receiverid"));

			String tmp = jsonfile(emailobj);
			ZipFile(tmp);

			File deletefile = new File(tmp);
			if (deletefile.exists()) {
				if (deletefile.delete()) {
					System.out.println("임시 메일 파일삭제 성공");
				} else {
					System.out.println("임시 메일 파일삭제 실패");
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getLocalizedMessage());
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getLocalizedMessage());
		}

	}

	// HTML Tag 문서 임다.
	private void sendMailLoop(int i) {
		try {
			List<eMasterVo> master = this.sqlMapPIC.openSession().queryForList("query.getEmailMaster" + i);
			for (eMasterVo evo : master) {
				RealSendMail(evo, i);
			}

		} catch (SQLException e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

	private void RealSendMail(eMasterVo evo, int i) {
		int seq = getFileNo(AppConfig.getProperty("config.email.path"));

		// tgt = AppConfig.getProperty("config.email.path") + "/"+
		// String.format("%s_%s_%s_%06d.txt",
		// AppConfig.getProperty("config.email.init"), getCDate(),
		// AppConfig.getProperty("config.email.division"), seq);
		tgt = AppConfig.getProperty("config.email.path") + "/" + String.format("BODY.mail");

		tgt_zip = AppConfig.getProperty("config.email.path") + "/"
				+ String.format("%s_%s_%s_%06d.zip", AppConfig.getProperty("config.email.init"), getCDate(), AppConfig.getProperty("config.email.division"), seq);

		try {
			List<?> detail = this.sqlMapPIC.openSession().queryForList("query.getEmailDetail" + i, evo);

			if (detail.size() > 0) {
				EmailVo emailobj = new EmailVo();

				// 보안 담당자

				// 1 승인 대기
				// 2 승인 반려
				// 3 승인 완료
				// 4 담당자 변경요청
				// 5 담당자 변경반려
				// 6 담당자 변경완료

				if (i == 1 || i == 4 || i == 5 || i == 6) {
					emailobj.setSender(evo.getSender());
				} else {
					emailobj.setSender(AppConfig.getProperty("config.security.charge"));
				}
				
				emailobj.setTitle_(i, String.format("%s_%s_%s_%06d.txt", AppConfig.getProperty("config.email.init"), getCDate(), AppConfig.getProperty("config.email.division"), seq));
				System.out.println(">>>" +i +"  :::: "+emailobj.getTitle_arg().get(0));


				String tmp = "";
				if (i == 7) {
					emailobj.setReceiver(evo.getSender());
					
					if (emailobj.setContents(i, detail, M, evo.getSender_name(), evo.getSender()) == true) {
						tmp = jsonfile(emailobj);
						ZipFile(tmp);

					}

				} else {
					emailobj.setReceiver(evo.getReceiver());
					if (emailobj.setContents(i, detail, M, evo.getReceiver_name(), evo.getReceiver()) == true) {
						tmp = jsonfile(emailobj);
						ZipFile(tmp);

					}

				}



				File deletefile = new File(tmp);
				if (deletefile.exists()) {
					if (deletefile.delete()) {
						System.out.println("임시 메일 파일삭제 성공 :" + i + " 번째 멜폼작성");
					} else {
						System.out.println("임시 메일 파일삭제 실패 :" + i + " 번째 멜폼작성");
					}
				}

				if (i == 9) {
					System.out.println(emailobj.getSender());
					System.out.println(emailobj.getReceiver());
					System.out.println(emailobj.getTitle_arg());
					System.out.println(emailobj.getContents());
				}

			}

		} catch (SQLException e) {
			System.out.println(e.getLocalizedMessage());
		}

	}

	private int getFileNo(String path) {
		int ret = 1;

		File dir = new File(path);
		ret = dir.list().length + 1;

		return ret;
	}

	private String jsonfile(EmailVo v) {

		String fname = tgt;


		Gson g = new Gson();
		String json = "["+g.toJson(v)  +"]";

		try {
			FileWriter fw = new FileWriter(fname);
			fw.write(json);
			fw.close();
		} catch (IOException e) {
			System.out.println(e.getLocalizedMessage() );
		}

		return fname;

	}

	private void ZipFile(String src) {

		try {
			FileOutputStream fos = new FileOutputStream(tgt_zip);
			ZipOutputStream zipOut = new ZipOutputStream(fos);

			File fileToZip = new File(src);
			FileInputStream fis = new FileInputStream(fileToZip);
			ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
			zipOut.putNextEntry(zipEntry);

			byte[] bytes = new byte[1024];
			int length;
			while ((length = fis.read(bytes)) >= 0) {
				zipOut.write(bytes, 0, length);
			}

			fis.close();
			zipOut.close();
			fos.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("ZipFile FileNotFoundException Error :" + e.getLocalizedMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("ZipFile IOException Error :" + e.getLocalizedMessage());
		}

	}

	private String getCDate() {

		SimpleDateFormat format1 = new SimpleDateFormat(AppConfig.getProperty("config.email.dateformat"));

		Date time = new Date();
		String time1 = format1.format(time);

		return time1;
	}

	private void getNowData() {

		try {

			// 오늘의 전체 내역역을 가져온다.
			List<PersonalVo> acct = this.sqlMapPIC.openSession().queryForList("query.getPersonCount");
			System.out.println("오늘 데이타 Size :" + acct.size());

			for (PersonalVo v : acct) {

				pi_topcompVo p = new pi_topcompVo();
				p.setPersol(v);

				// 어제 데이타를 sum 한다.
				pi_topcompVo r = predataSum(p);
				System.out.println(r.toString());
				this.sqlMapPIC.openSession().insert("insert.settopcomp", r);
				logger.info(">>> DB pi_topcomp Data Insert :" + v.getTarget_id() + " ,," + r.getTotal());

			}
		} catch (SQLException e) {
			System.err.println("File readError: " + e.getLocalizedMessage());
			System.exit(1);
		}

	}

	private void UpdateDelDate() {
		System.out.println(">>> Deldate Update ____________________________getDelDataList");
		List<pifindVo> del = null;
		try {
			del = this.sqlMapPIC.openSession().queryForList("query.getDelDataList");
			System.out.println("Deldate Update Size :" + del.size());
		} catch (SQLException e) {
			System.err.println("SQLException setUpdatedelDate: " + e.getLocalizedMessage());
		}

		for (pifindVo v : del) {
			try {
				this.sqlMapPIC.openSession().insert("insert.setDelUpdate", v);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.err.println("SQLException setDelUpdate: " + e.getLocalizedMessage());
			}
		}

	}

	private pi_topcompVo predataSum(pi_topcompVo p) {

		pi_topcompVo r = p;

		for (int i = 0; i < predata.size(); i++) {

			if (predata.get(i).getTarget_id().equals(p.getTarget_id())) {
				System.out.println("Target ID :" + predata.get(i).getTarget_id());
				r.setRrn_pre(predata.get(i).getRrn());
				r.setForeigner_pre(predata.get(i).getForeigner());
				r.setDriver_pre(predata.get(i).getDriver());
				r.setPassport_pre(predata.get(i).getForeigner());
				r.setAccount_num_pre(predata.get(i).getAccount_num());
				r.setCard_num_pre(predata.get(i).getCard_num());
				r.setPhone_pre(predata.get(i).getPhone_num());
				r.setPhone_num_pre(predata.get(i).getPhone_num_pre());
				r.setMobile_phone_pre(predata.get(i).getMobile_phone());
				r.setNew_rrn_pre(predata.get(i).getNew_rrn());
				r.setEmail_pre(predata.get(i).getEmail());
				r.setCarnum_pre(predata.get(i).getCarnum());
				r.setVehicleid_pre(predata.get(i).getVehicleid());
				r.setTotal_pre(predata.get(i).getTotal1());
				r.setTotal_gap(r.getTotal() - predata.get(i).getTotal());
			}
		}

		return r;
	}

	public static String escape(String input) {
		StringBuilder output = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int chx = (int) ch;

			// let's not put any nulls in our strings
			assert (chx != 0);

			if (ch == '\n') {
				output.append("\\n");
			} else if (ch == '\t') {
				output.append("\\t");
			} else if (ch == '\r') {
				output.append("\\r");
			} else if (ch == '\\') {
				output.append("\\\\");
			} else if (ch == '"') {
				output.append("\\\"");
			} else if (ch == '\b') {
				output.append("\\b");
			} else if (ch == '\f') {
				output.append("\\f");
			} else if (chx >= 0x10000) {
				assert false : "Java stores as u16, so it should never give us a character that's bigger than 2 bytes. It literally can't.";
			} else if (chx > 127) {
				output.append(String.format("\\u%04x", chx));
			} else {
				output.append(ch);
			}
		}

		return output.toString();
	}

	public static String unescape(String input) {
		StringBuilder builder = new StringBuilder();

		int i = 0;
		while (i < input.length()) {
			char delimiter = input.charAt(i);
			i++; // consume letter or backslash

			if (delimiter == '\\' && i < input.length()) {

				// consume first after backslash
				char ch = input.charAt(i);
				i++;

				if (ch == '\\' || ch == '/' || ch == '"' || ch == '\'') {
					builder.append(ch);
				} else if (ch == 'n')
					builder.append('\n');
				else if (ch == 'r')
					builder.append('\r');
				else if (ch == 't')
					builder.append('\t');
				else if (ch == 'b')
					builder.append('\b');
				else if (ch == 'f')
					builder.append('\f');
				else if (ch == 'u') {

					StringBuilder hex = new StringBuilder();

					// expect 4 digits
					if (i + 4 > input.length()) {
						throw new RuntimeException("Not enough unicode digits! ");
					}
					for (char x : input.substring(i, i + 4).toCharArray()) {
						if (!Character.isLetterOrDigit(x)) {
							throw new RuntimeException("Bad character in unicode escape.");
						}
						hex.append(Character.toLowerCase(x));
					}
					i += 4; // consume those four digits.

					int code = Integer.parseInt(hex.toString(), 16);
					builder.append((char) code);
				} else {
					throw new RuntimeException("Illegal escape sequence: \\" + ch);
				}
			} else { // it's not a backslash, or it's the last character.
				builder.append(delimiter);
			}
		}

		return builder.toString();
	}

}
