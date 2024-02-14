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
import com.skyun.app.util.database.ibatis.vo.CompletTargetVo;
import com.skyun.app.util.database.ibatis.vo.EmailItemVo;
import com.skyun.app.util.database.ibatis.vo.EmailVo;
import com.skyun.app.util.database.ibatis.vo.MailForm;
import com.skyun.app.util.database.ibatis.vo.PersonalVo;
import com.skyun.app.util.database.ibatis.vo.eMasterVo;
import com.skyun.app.util.database.ibatis.vo.piFindDataVo;
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
		System.out.println("Batch work of information in the pi_topcomp table");
		logger.info("UPDATE 2024-02-01 pi_topcomp table change");
		logger.info("pi_topcomp >>> pi_total table ");
		logger.info("column change data");
	}

	@Override
	public void run() {
		getNowNewData();
		// getNowData();
		/*try {
			//predata = this.sqlMapPIC.openSession().queryForList("query.getPreCount");
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getLocalizedMessage());
		}*/

	}

	private void getNowNewData() {
		try {
			//1. 금일 검색 완료한 서버 목록 조회
			List<CompletTargetVo> ctList = this.sqlMapPIC.queryForList("query.getEndScheduleTarget");
			
			for (CompletTargetVo cVo : ctList) {
				// 2. 검색 완료한 서버 기준 데이터 조회(관리자가 설정한 데이터 유형 기준 pi_custom_pattern table)
				piFindDataVo fVo = (piFindDataVo) this.sqlMapPIC.queryForObject("query.getFindData", cVo);
				
				if(fVo != null) {
					logger.info(fVo.toString());
					//3. 현재 날짜, target_id,ap_no, 개인정보 유형으로 pi_total 테이블 삽입
					this.sqlMapPIC.insert("insert.setTotal", fVo);
					logger.info("Target_ID :: " + fVo.getTARGET_ID() + " Insert Date Completed");
				}
				
			}
			
		} catch (Exception e) {
			logger.error(e.toString());
		}
		
		logger.info("Total Data Success ");
		
	}
	
	private void getNowData() {

		try {
			// 금일 검색 완료한 타겟을 가져온다
			List<CompletTargetVo> ctVo = this.sqlMapPIC.openSession().queryForList("query.getEndScheduleTarget");
			
			for (CompletTargetVo vo : ctVo) {
				logger.info(">>> DB pi_topcomp Data :" + vo.getTarget_id() + " , ap: " + vo.getAp_no());
				
				PersonalVo acct = (PersonalVo) this.sqlMapPIC.openSession().queryForObject("query.getPersonCount", vo);
				
				if(acct.getTarget_id() != null) {

					pi_topcompVo p = new pi_topcompVo();
					p.setPersol(acct);

					// 어제 데이타를 sum 한다.
					pi_topcompVo r = predataSum(p);
					System.out.println(r.toString());
					this.sqlMapPIC.openSession().insert("insert.settopcomp", r);
					logger.info(">>> DB pi_topcomp Data Insert :" + acct.getTarget_id() + " ,," + r.getTotal());
				} else {
					logger.info(">>> DB pi_topcomp ID :" + vo.getTarget_id() + " Data Size 0 Num");
				}
			}
			
			this.sqlMapPIC.openSession().insert("insert.insertTopcomp");
			logger.info(">>> DB pi_topcomp All Data Insert");
			
			/*// 오늘의 전체 내역역을 가져온다.
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

			}*/
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
		
		try {
			pi_topcompVo vo = (pi_topcompVo) this.sqlMapPIC.openSession().queryForObject("query.getPreCount", p);
			
			if(vo != null) {
				r.setRrn_pre(vo.getRrn());
				r.setForeigner_pre(vo.getForeigner());
				r.setDriver_pre(vo.getDriver());
				r.setPassport_pre(vo.getPassport());
				r.setAccount_num_pre(vo.getAccount_num());
				r.setCard_num_pre(vo.getCard_num());
				r.setPhone_pre(vo.getPhone_num());
				r.setPhone_num_pre(vo.getPhone_num_pre());
				r.setMobile_phone_pre(vo.getMobile_phone());
				r.setNew_rrn_pre(vo.getNew_rrn());
				r.setEmail_pre(vo.getEmail());
				r.setCarnum_pre(vo.getCarnum());
				r.setVehicleid_pre(vo.getVehicleid());
				r.setTotal_pre(vo.getTotal1());
				r.setTotal_gap(r.getTotal() - vo.getTotal());
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getLocalizedMessage());
		}
		
		
		/*
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
		}*/

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
