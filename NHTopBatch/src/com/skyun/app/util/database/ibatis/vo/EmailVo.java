package com.skyun.app.util.database.ibatis.vo;

import java.util.ArrayList;
import java.util.List;

import com.skyun.app.util.config.AppConfig;

public class EmailVo {
	private String sender = AppConfig.getProperty("config.email.senderid");
	private List<String> receiver;
	private List<String> title_arg;
	private String contents = "";

	public EmailVo() {
		receiver = new ArrayList<String>();
		title_arg = new ArrayList<String>();
		;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public List<String> getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver.add(receiver);
	}

	public List<String> getTitle_arg() {
		return title_arg;
	}

	public void setTitle_arg(List<String> title_arg) {
		this.title_arg = title_arg;
	}

	public void setReceiver(List<String> receiver) {
		this.receiver = receiver;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {

		this.contents = this.contents + contents;
	}

	public void setTitle(int mail_id) {
		String title_init = "";

		title_init = "[PIMC] ";

		if (mail_id == 1) { // 결재 완료 안내
			title_init = title_init + "개인정보 조치계획 승인결과 알림";
		} else if (mail_id == 2) { // 담당자 변경내역 알림
			title_init = title_init + "시스템 담당자 변경내역 알림";
		} else if (mail_id == 3) { // 검출결과 알림
			title_init = title_init + "개인정보 검출결과 확인 요청";
		}

		title_arg.add(title_init);
	}

	public void setContents(int i, List<?> detail, MailForm m, updateUserVo userVo) {

		contents = m.get_header();
		StringBuffer sb = new StringBuffer();
		
		String menu = "";
		String link = "";
		
		String detailCon = "";
		
		if (i == 1) {
			/*contents += m.get_body(i);*/
			
			if(userVo.getAPPROVAL_STATUS().equals("E")) {
				menu = "[결과 관리 > 결재 진행현황] 메뉴를 활용하여 결재 내역을 확인 바랍니다.";
				link = "<a href=\"https://pimc.sktelecom.com/approval/pi_search_approval_list_skt\">";
			}else {
				menu = "[결과 관리 > 결과조회/조치계획] 메뉴를 활용하여 결재 내역을 확인 바랍니다.";
				link = "<a href=\"https://pimc.sktelecom.com/manage/pi_detection_list_skt\">";
			}
			
			contents += m.get_body(i).replaceAll("REQUEST_DATE", userVo.getREQUEST_DATE())
						.replaceAll("STATUS", (userVo.getAPPROVAL_STATUS().equals("E") ? "승인" : "반려")).replaceAll("MENU", menu).replaceAll("LINK", link);
			
			//contents += m.get_receiver(i).replaceAll("SKT_USER", userVo.getUPDATE_USER_NM()).replaceAll("SKT_SOSOK", userVo.getSOSOK());
			/*for (Object v : detail) {
				eDetail1Vo re = (eDetail1Vo) v;
				
				sb.append("<tr>");
				sb.append("<td style='font-size: 13px; color: #222; font-weight: bold;' width='575'>");
				sb.append(re.getDOC_NAME()+ "을 "+re.getUSER_NAME()+"("+re.getTEAM_NAME()+") 님이 " + (re.getAPPROVAL_STATUS().equals("E") ? "승인완료" : "승인반려") + " 하였습니다.");
				sb.append("</td>");
				sb.append("</tr>");
			}*/
			
			contents += sb.toString();
			
			contents += m.get_end();
		} else if (i == 2) {
			contents += m.get_body(i).replaceAll("SKT_USER", userVo.getUPDATE_USER_NM()).replaceAll("SKT_SOSOK", userVo.getSOSOK());
			
			for (Object v : detail) {
				eDetail2Vo re = (eDetail2Vo) v;
				receiver.add(re.getMAIL());
				detailCon += "<tr>" + 
							"<td style=\"width: 30%; border: 1px solid #cccccc;\">"+re.getNAME()+"</td>" + 
							"<td style=\"width: 30%; border: 1px solid #cccccc;\">"+
							(re.getSERVICE_NM().equals("") ? "없음" : re.getSERVICE_NM() == null ? "없음" : re.getSERVICE_NM())+"</td>" + 
							"<td style=\"width: 30%; border: 1px solid #cccccc;\">"+
							(re.getTYPE() == 1 ? "인프라 담당자" : re.getTYPE() == 2 ? "서비스 담당자" : "서비스 관리자")+"</td> " + 
							"</tr>";
			}
			contents += m.get_receiver(i).replace("REGDATE", userVo.getREGDATE()).replace("DETAILCON", detailCon);
			
/*			contents += m.get_receiver(i).replaceAll("SKT_USER", userVo.getUPDATE_USER_NM()).replaceAll("SKT_SOSOK", userVo.getSOSOK());
			
			for (Object v : detail) {
				eDetail2Vo re = (eDetail2Vo) v;
				receiver.add(re.getMAIL());
				contents += "<tr>\r\n" + 
						"<td style=\"font-size: 13px; color: #222; font-weight: bold;\" width=\"575\">"+re.getNAME()+" : " + 
						(re.getTYPE() == 1 ? "인프라 담당자" : re.getTYPE() == 2 ? "서비스 담당자" : "서비스 관리자") +
						"</td></tr>";
			}
*/
			contents += m.get_end();
			
		} else if (i == 3) {
			contents += m.get_body(i).replaceAll("SKT_USER", userVo.getUPDATE_USER_NM()).replaceAll("SKT_SOSOK", userVo.getSOSOK());
			
			for (Object v : detail) {
				eDetail3Vo re = (eDetail3Vo)v;
				receiver.add(userVo.getEMAIL());
				detailCon += "<tr>" + 
							"<td style=\"width: 30%; border: 1px solid #cccccc;\">"+re.getNAME()+"</td>" + 
							"<td style=\"width: 25%; border: 1px solid #cccccc;\">"+(re.getSERVICE_NM().equals("") ? "없음" : re.getSERVICE_NM() == null ? "없음" : re.getSERVICE_NM())+"</td>" + 
							"<td style=\"width: 20%; border: 1px solid #cccccc;\">"+re.getPATH_CNT()+"</td>" + 
							"<td style=\"width: 25%; border: 1px solid #cccccc;\">"+re.getFILE()+"</td> " + 
							"</tr>";
			}
			
			
			contents += m.get_receiver(i).replaceAll("ACTION_DATE", userVo.getACTION_DATE()).replace("DETAILCON", detailCon);;
			/*contents += m.get_body(i).replaceAll("SKT_REGDATE", userVo.getREGDATE()).replaceAll("SKT_USER_NO", userVo.getUPDATE_USER_NO()).replaceAll("SKT_USER", userVo.getUPDATE_USER_NM());
			contents += m.get_receiver(i).replaceAll("SKT_USER", userVo.getUPDATE_USER_NM()).replaceAll("SKT_SOSOK", userVo.getSOSOK());
			
			for (Object v : detail) {
				eDetail3Vo re = (eDetail3Vo)v;
				receiver.add(userVo.getEMAIL());
				contents+="<tr>\r\n" + 
						"<td style=\"font-size: 13px; color: #222; font-weight: bold;\" width=\"575\">"+re.getNAME()+" : "+re.getPATH_CNT()+"개 파일 검출</td>\r\n" + 
						"</tr>";
			}	*/	
			
			contents += m.get_end();

		} else if (i == 4) {
			for (Object v : detail) {
				eDetail4Vo re = (eDetail4Vo) v;

				contents = contents + "<tr> \n";
				contents = contents + "<td class=\"tg-fymr center\">" + re.getHOST() + "</td>\n";
				contents = contents + "<td class=\"tg-fymr\">" + re.getPATH() + "</td>\n";
				contents = contents + "<td class=\"tg-fymr center\">" + re.getREG_USER_NAME() + "</td>\n";
				contents = contents + "<td class=\"tg-fymr center\">" + re.getOK_USER_NAME() + "</td>\n";
				contents = contents + "<td class=\"tg-fymr center\">" + re.getREGDATE() + "</td>\n";
				contents = contents + "<td class=\"tg-fymr center\">" + re.getOKDATE() + "</td>\n";
				contents = contents + "<td class=\"tg-fymr center\">" + re.getSTATUS_NAME() + "</td>\n";
				contents = contents + "<td class=\"tg-fymr\">" + re.getREASON() + "</td>\n";
			}

		} else if (i == 5) {
			for (Object v : detail) {
				eDetail5Vo re = (eDetail5Vo) v;

				contents = contents + "<tr> \n";
				contents = contents + "<td class=\"tg-fymr center\">" + re.getHOST() + "</td>\n";
				contents = contents + "<td class=\"tg-fymr\">" + re.getPATH() + "</td>\n";
				contents = contents + "<td class=\"tg-fymr center\">" + re.getREG_USER_NAME() + "</td>\n";
				contents = contents + "<td class=\"tg-fymr center\">" + re.getOK_USER_NAME() + "</td>\n";
				contents = contents + "<td class=\"tg-fymr center\">" + re.getREGDATE() + "</td>\n";
				contents = contents + "<td class=\"tg-fymr center\">" + re.getOKDATE() + "</td>\n";
				contents = contents + "<td class=\"tg-fymr center\">" + re.getSTATUS_NAME() + "</td>\n";
				contents = contents + "<td class=\"tg-fymr\">" + re.getREASON() + "</td>\n";
			}

		} else if (i == 6) {
			for (Object v : detail) {
				eDetail6Vo re = (eDetail6Vo) v;

				contents = contents + "<tr> \n";
				contents = contents + "<td class=\"tg-fymr center\">" + re.getHOST() + "</td>\n";
				contents = contents + "<td class=\"tg-fymr\">" + re.getPATH() + "</td>\n";
				contents = contents + "<td class=\"tg-fymr center\">" + re.getREG_USER_NAME() + "</td>\n";
				contents = contents + "<td class=\"tg-fymr center\">" + re.getOK_USER_NAME() + "</td>\n";
				contents = contents + "<td class=\"tg-fymr center\">" + re.getREGDATE() + "</td>\n";
				contents = contents + "<td class=\"tg-fymr center\">" + re.getOKDATE() + "</td>\n";
				contents = contents + "<td class=\"tg-fymr center\">" + re.getSTATUS_NAME() + "</td>\n";
				contents = contents + "<td class=\"tg-fymr\">" + re.getREASON() + "</td>\n";
			}

		} else if (i == 7) {

			for (Object v : detail) {
				eDetail7Vo re = (eDetail7Vo) v;

				contents = contents + "<tr> \n";
				contents = contents + "<td class=\"tg-fymr center\">" + re.getHOST() + "</td>\n";
				contents = contents + "<td class=\"tg-fymr\">" + re.getSHORTNAME() + "</td>\n";
				contents = contents + "<td class=\"tg-fymr center\">" + re.getOWNER() + "</td>\n";
				contents = contents + "<td class=\"tg-fymr right\">" + re.getTYPE1() + "</td>\n";
				contents = contents + "<td class=\"tg-fymr right\">" + re.getTYPE2() + "</td>\n";
				contents = contents + "<td class=\"tg-fymr right\">" + re.getTYPE3() + "</td>\n";
				contents = contents + "<td class=\"tg-fymr right\">" + re.getTYPE4() + "</td>\n";
				contents = contents + "<td class=\"tg-fymr right\">" + re.getTYPE5() + "</td>\n";
				contents = contents + "<td class=\"tg-fymr right\">" + re.getTYPE6() + "</td>\n";
				contents = contents + "<td class=\"tg-fymr right\">" + re.getTYPE() + "</td>\n";
				contents = contents + "<td class=\"tg-fymr center\">" + re.getAPPROVAL_STATUS_PRINT_NAME() + "</td>\n";
			}

		}

		/*
		 * if(i==7) { if(ret) System.out.println(contents); }
		 */

	}

}
