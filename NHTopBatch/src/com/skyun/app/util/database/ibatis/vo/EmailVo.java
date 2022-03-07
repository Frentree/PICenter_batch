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

		title_init = "[PIMC 개인정보 검출관리] ";

		if (mail_id == 1) {
			title_init = title_init + "정/오탐 결재 현황 알림";
		} else if (mail_id == 2) {
			title_init = title_init + "담당자 변경 알림";
		} else if (mail_id == 3) {
			title_init = title_init + "담당 시스템 개인정보 검출 알림";
		}

		title_arg.add(title_init);
	}

	public void setContents(int i, List<?> detail, MailForm m, updateUserVo userVo) {

		contents = m.get_header();
		StringBuffer sb = new StringBuffer();
		
		if (i == 1) {
			contents += m.get_body(i);
			contents += m.get_receiver(i).replaceAll("SKT_USER", userVo.getUPDATE_USER_NM()).replaceAll("SKT_SOSOK", userVo.getSOSOK());
			for (Object v : detail) {
				eDetail1Vo re = (eDetail1Vo) v;
				
				sb.append("<tr>");
				sb.append("<td style='font-size: 13px; color: #222; font-weight: bold;' width='575'>");
				sb.append(re.getDOC_NAME()+ "을 "+re.getUSER_NAME()+"("+re.getTEAM_NAME()+") 님이 " + (re.getAPPROVAL_STATUS().equals("E") ? "승인완료" : "승인반려") + " 하였습니다.");
				sb.append("</td");
				sb.append("</tr>");
			}
			
			contents += sb.toString();
			
			contents += m.get_end();
		} else if (i == 2) {
			contents += m.get_body(i);
			contents += m.get_receiver(i).replaceAll("SKT_USER", userVo.getUPDATE_USER_NM()).replaceAll("SKT_SOSOK", userVo.getSOSOK());
			
			for (Object v : detail) {
				eDetail2Vo re = (eDetail2Vo) v;
				receiver.add(re.getMAIL());
				contents += "<tr>\r\n" + 
						"<td style=\"font-size: 13px; color: #222; font-weight: bold;\" width=\"575\">"+re.getNAME()+" : " + 
						(re.getTYPE() == 1 ? "인프라 담당자" : re.getTYPE() == 2 ? "서비스 담당자" : "서비스 관리자") +
						"</tr>";
			}

			contents += m.get_end();
			
		} else if (i == 3) {
			contents += m.get_body(i).replaceAll("SKT_REGDATE", userVo.getREGDATE()).replaceAll("SKT_USER_NO", userVo.getUPDATE_USER_NO()).replaceAll("SKT_USER", userVo.getUPDATE_USER_NM());
			contents += m.get_receiver(i).replaceAll("SKT_USER", userVo.getUPDATE_USER_NM()).replaceAll("SKT_SOSOK", userVo.getSOSOK());
			
			for (Object v : detail) {
				eDetail3Vo re = (eDetail3Vo)v;
				receiver.add(userVo.getEMAIL());
				contents+="<tr>\r\n" + 
						"<td style=\"font-size: 13px; color: #222; font-weight: bold;\" width=\"575\">"+re.getNAME()+" : "+re.getPATH_CNT()+"개 파일 검출</td>\r\n" + 
						"</tr>";
			}		
			
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
