package com.iopts.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.apache.http.ParseException;
import org.jdom2.Document;
import org.jdom2.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.skyun.app.util.config.AppConfig;
import com.skyun.app.util.database.ibatis.SqlMapInstanceBATCH;
import com.skyun.app.util.database.ibatis.vo.piLockMember;

import csp.api.cbh.scbh000001.vo.GetSmsInfoVo;
import csp.comm.Config;
import csp.comm.CspUtil;
import csp.comm.vo.HeaderVo;
import csp.comm.vo.ResultVo;

public class DaemonThread implements Runnable {
	private static SqlMapClient sqlMapPIC = null;

	/*CBH ���� ����*/
	private	String URL	= Config.domain + "/rest/SCBH000001/" + Config.apiKey;
/*	private static String sendmail = AppConfig.getProperty("config.email.senderid");*/	
	private static String consumerId = "C00561";
	private static String rplyPhonNum = AppConfig.getProperty("config.sns.rplyPhonNum");
/*	private static String rplyPhonNum = "0264008842";
*/	private static String title = "";
	private static String phone = "";
	
	// private static String[][] paramLt	= {{"SENDEREMAIL",sendmail},{"RECEIVEREMAIL", receivermail},{"SUBJECT", title},{"CONTENT",content}};
	private static String[][] paramLt = {{"CONSUMER_ID",consumerId},{"RPLY_PHON_NUM",rplyPhonNum},{"TITLE",title},{"PHONE",phone}}; 

	private static Logger logger = LoggerFactory.getLogger(DaemonThread.class);

	public DaemonThread() {
		paramLt[0][0] = "CONSUMER_ID";
		paramLt[0][1] = consumerId;
		paramLt[1][0] = "RPLY_PHON_NUM";
		paramLt[1][1] = rplyPhonNum;
		paramLt[2][0] = "TITLE";
		paramLt[2][1] = title;
		paramLt[3][0] = "PHONE";
		paramLt[3][1] = phone;
		
		this.sqlMapPIC = SqlMapInstanceBATCH.getSqlMapInstance();
	}

	@Override
	public void run() {
		try {
			sendMailLoop();
			/*for (int i = 2; i < 4; i++) {
				sendMailLoop(i);
			}*/

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getLocalizedMessage());
		}

	}

	private void sendMailLoop() {
		List<piLockMember> master = null;

		try {
				master = this.sqlMapPIC.openSession().queryForList("query.getAccountLockMember");

				if(master.size() < 100) {
					for (piLockMember vo : master) {
						UpdateUserSendSNS(vo);
					}
				}else {
					logger.info("���� ���� ���� ���� ���� : �ʹ� ���� ����ڿ��� ���� ��.");
				}
				
				

		} catch (SQLException e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

	private void UpdateUserSendSNS(piLockMember vo) {
		
		try {
			// dpquery - getEmailDetail
			/*List<?> detail = this.sqlMapPIC.openSession().queryForList("query.getAccountLockMember" + i, vo);*/			
			/*EmailVo emailobj = new EmailVo();
			emailobj.setTitle(i);
			emailobj.setContents(i, detail, M, vo);
			
			title = emailobj.getTitle_arg().get(0);*/
			/*receivermail = vo.getEMAIL();*/
			/*sendsns = vo.getSNS();
			phone = emailobj.getContents();*/
			title = "[PIMC] ���� ���Ѹ��� ���� \n" + vo.getUser_name()+"���� ������ " + vo.getLoginDate()+" �� ����˴ϴ�.";
			String user_phone = vo.getUser_phone();
			String phone = user_phone.replaceAll("-", "");
			
			paramLt[1][0] = "RPLY_PHON_NUM";
			paramLt[1][1] = rplyPhonNum;
			paramLt[2][0] = "TITLE";
			paramLt[2][1] = title;
			paramLt[3][0] = "PHONE";
			paramLt[3][1] = phone;
			
			if (rplyPhonNum != null && !rplyPhonNum.equals("")) {
				logger.info("paramLt Sender : " + paramLt[0][1] + " , Rply_phon_num : " + paramLt[1][1] + ", title : " + paramLt[2][1]  );
				getVo(paramLt);
				
			}
		}catch (Exception e) {
			logger.error(e.getLocalizedMessage());
		}
		
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


	// XML ���ο��� Body ������ ��ƿ� - ���񽺺� ������
	private Object getBody(HeaderVo hvo, Element body) {
		GetSmsInfoVo vo = new GetSmsInfoVo();

		if(body==null) return vo;

		String[] contLt	= {"RETURN", "UUID"};

		for(int i=0; i<contLt.length; i++) {
			CspUtil.setData(vo, hvo, body, contLt[i]);
		}
		return vo;
	}

	public ResultVo getVoData(String URL, String[][] paramLt, String METHOD, int timeout) {
		ResultVo	vo = new ResultVo();

		Document doc = CspUtil.getDocument(URL, paramLt, METHOD, timeout);

		Element root	= doc.getRootElement();
		Element head	= root.getChild("HEADER");
		Element body	= root.getChild("BODY");

		if(head!=null) {
			vo.setHEADER(CspUtil.getHeader(head));
		}

		if(body!=null) {
			vo.setBODY(getBody(vo.getHEADER(), body));
		}

		return vo;
	}


	// XML ���ڿ� ������
//	@Test
	public void getXmlData() {
		try {
			int timeout = 5000;
			System.out.println(CspUtil.GET(URL, paramLt, timeout).getRtnText());
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Value Object�� ������
//	@Test
	public void getVo(String[][] paramLt) {
		int timeout = 5000;
		System.out.println(getVoData(URL, paramLt, "POST", timeout));
	}

	// JSON�� ������
//	@Test
	public void getJSONData() {
		Gson gson = new Gson();
		int timeout = 5000;
		System.out.println(gson.toJson(getVoData(URL, paramLt, "POST", timeout)).toString() );
	}


}
