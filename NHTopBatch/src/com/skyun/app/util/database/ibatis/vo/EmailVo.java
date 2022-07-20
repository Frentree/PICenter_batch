package com.skyun.app.util.database.ibatis.vo;

import java.util.ArrayList;
import java.util.List;

import com.skyun.app.util.config.AppConfig;

public class EmailVo {
	private String sender = AppConfig.getProperty("config.email.senderid");
	private List<String>  receiver;
	private List<String>  title_arg;
	private String contents = "";
	
	public EmailVo()  {
		receiver=new ArrayList<String>();
		title_arg =new ArrayList<String>();;
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
	
	public void setTitle2() {
		String title_init="";
		
		if(AppConfig.getProperty("config.email.title").equals("bank"))
			title_init="["+ "은행" + " - 서버내 개인정보 검색] ";
		else
			title_init="["+ "중앙회" + " - 서버내 개인정보 검색] ";

		title_arg.add(title_init+"미접속 에이전트 알림");

	}
	

	public void setTitle_(int mail_id, String doc) {
		String title_init="";
		
		if(AppConfig.getProperty("config.email.title").equals("bank")) {
			title_init="["+ "은행" + " - 서버내 개인정보 검색] ";
		}else {
			title_init="["+ "중앙회" + " - 서버내 개인정보 검색] ";
		}


		if (mail_id == 1) {
			title_init = title_init+"검색 결과 조치 예정 결재 요청 알림";
		} else if (mail_id == 2) {
			title_init = title_init+"검색 결과 조치 예정 결재 반려 알림";
		} else if (mail_id == 3) {
			title_init = title_init+"검색 결과 조치 예정 결재 완료 알림";
		} else if (mail_id == 4) {
			title_init = title_init+"담당자 변경 요청 알림 ";
		} else if (mail_id == 5) {
			title_init = title_init+"담당자 변경 반려 알림";
		} else if (mail_id == 6) {
			title_init = title_init+"담당자 변경 완료 알림 ";
		} else if (mail_id == 7) {
			title_init = title_init+"담당 계정 개인정보 검출 알림";
		} else if (mail_id == 8) {
			title_init = title_init+"검색 결과 장기 미조치 알림";
		} else if (mail_id == 9) {
			title_init = title_init+"미접속 에이전트 알림";
		}

		title_arg.add(title_init);

	}

	public boolean setContents(int i, List<?> detail, MailForm m, String rname,String rid, int pathCnt) {
		
		boolean ret=false;
		
		contents = m.get_header(i).replaceAll("_rname_", rname).replaceAll("_sabun_",rid);

		if (i == 1) {
			for (Object v : detail) {
				eDetail1Vo re = (eDetail1Vo)v;

				contents=contents+"<tr> \n";
				contents=contents+"<td class=\"tg-fymr\" style=\"white-space: nowrap; overflow: hidden; text-overflow: ellipsis;\">"+re.getPATH()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr center\">"+re.getREQ_USER_NAME()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr center\">"+re.getOK_USER_NAME()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr center\">"+re.getREGDATE() +"</td>\n";
				contents=contents+"<td class=\"tg-fymr center\">"+re.getOKDATE()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr center\">"+re.getSTATUS_NAME()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr\">"+re.getREASON()+"</td>\n";
				ret=true;
			}			

		} else if (i == 2) {
			for (Object v : detail) {
				eDetail2Vo re = (eDetail2Vo)v;

				contents=contents+"<tr> \n";
				contents=contents+"<td class=\"tg-fymr\" style=\"white-space: nowrap; overflow: hidden; text-overflow: ellipsis;\">"+re.getPATH()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr center\">"+re.getREQ_USER_NAME()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr center\">"+re.getOK_USER_NAME()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr center\">"+re.getREGDATE() +"</td>\n";
				contents=contents+"<td class=\"tg-fymr center\">"+re.getOKDATE()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr center\">"+re.getSTATUS_NAME()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr center\">"+re.getREASON()+"</td>\n";
				ret=true;
			}			

		} else if (i == 3) {
			for (Object v : detail) {
				eDetail3Vo re = (eDetail3Vo)v;

				contents=contents+"<tr> \n";
				contents=contents+"<td class=\"tg-fymr\" style=\"white-space: nowrap; overflow: hidden; text-overflow: ellipsis;\">"+re.getPATH()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr center\">"+re.getREQ_USER_NAME()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr center\">"+re.getOK_USER_NAME()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr center\">"+re.getREGDATE() +"</td>\n";
				contents=contents+"<td class=\"tg-fymr center\">"+re.getOKDATE()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr center\">"+re.getSTATUS_NAME()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr\">"+re.getREASON()+"</td>\n";
				ret=true;
			}			

		} else if (i == 4) {
			for (Object v : detail) {
				eDetail4Vo re = (eDetail4Vo)v;

				contents=contents+"<tr> \n";
				contents=contents+"<td class=\"tg-fymr center\">"+re.getHOST()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr\" style=\"white-space: nowrap; overflow: hidden; text-overflow: ellipsis;\">"+re.getPATH()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr center\">"+re.getREG_USER_NAME()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr center\">"+re.getOK_USER_NAME()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr center\">"+re.getREGDATE()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr center\">"+re.getOKDATE()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr center\">"+re.getSTATUS_NAME()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr\">"+re.getREASON()+"</td>\n";
				ret=true;
			}						

		} else if (i == 5) {
			for (Object v : detail) {
				eDetail5Vo re = (eDetail5Vo)v;

				contents=contents+"<tr> \n";
				contents=contents+"<td class=\"tg-fymr center\">"+re.getHOST()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr\" style=\"white-space: nowrap; overflow: hidden; text-overflow: ellipsis;\">"+re.getPATH()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr center\">"+re.getREG_USER_NAME()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr center\">"+re.getOK_USER_NAME()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr center\">"+re.getREGDATE()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr center\">"+re.getOKDATE()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr center\">"+re.getSTATUS_NAME()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr\">"+re.getREASON()+"</td>\n";
				ret=true;
			}						

		} else if (i == 6) {
			
			for (Object v : detail) {

				eDetail6Vo re = (eDetail6Vo) v;
				
				contents=contents+"<tr> \n";
				contents=contents+"<td class=\"tg-fymr center\">"+re.getHOST()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr\" style=\"white-space: nowrap; overflow: hidden; text-overflow: ellipsis;\">"+re.getPATH()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr center\">"+re.getREG_USER_NAME()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr center\">"+re.getOK_USER_NAME()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr center\">"+re.getREGDATE()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr center\">"+re.getOKDATE()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr center\">"+re.getSTATUS_NAME()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr\">"+re.getREASON()+"</td>\n";
				ret=true;
			}						
			

		} else if (i == 7) {
			
			for (Object v : detail) {
				eDetail7Vo re = (eDetail7Vo)v;

				contents=contents+"<tr> \n";
				contents=contents+"<td class=\"tg-fymr center\">"+re.getHOST()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr\" style=\"white-space: nowrap; overflow: hidden; text-overflow: ellipsis;\">"+re.getSHORTNAME()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr center\">"+re.getOWNER()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr right\">"+re.getTYPE1()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr right\">"+re.getTYPE2()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr right\">"+re.getTYPE3()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr right\">"+re.getTYPE4()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr right\">"+re.getTYPE5()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr right\">"+re.getTYPE6()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr right\">"+re.getTYPE()+"</td>\n";
				contents=contents+"<td class=\"tg-fymr center\">"+re.getAPPROVAL_STATUS_PRINT_NAME()+"</td>\n";
				ret=true;
			}					

		}
		
		contents = contents.replaceAll("_pathCnt_", pathCnt + "");
		
		/*
		if(i==7) {
			if(ret)
				System.out.println(contents);
		}
		*/	
		
		return ret;
		
	}

}
