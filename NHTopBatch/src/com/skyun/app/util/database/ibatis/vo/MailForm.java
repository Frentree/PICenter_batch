package com.skyun.app.util.database.ibatis.vo;

import com.skyun.app.util.config.AppConfig;

public class MailForm {
	private String m_header="<body style=\"font-family:'Noto Sans KR',sans-serif;padding:0;margin:0;\">\r\n" + 
			"<table style=\"border: 1px solid #ccc;\" border=\"0\" width=\"700\" cellspacing=\"0\" align=\"center\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td align=\"center\">\r\n" + 
			"<table style=\"border-bottom: 2px solid #000;\" border=\"0\" width=\"620\" cellspacing=\"0\" cellpadding=\"0\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td><img src=\"https://pimc.sktelecom.com/resources/assets/images/SKT_mail_title_1.png\" width=\"620\" height=\"91\" /></td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"<table border=\"0\" width=\"620\" cellspacing=\"0\" cellpadding=\"0\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"height: 90px;\" align=\"center\" valign=\"bottom\"><img src =\"https://pimc.sktelecom.com/resources/assets/images/SKT_mail_icon_2.png\" style=\"vertical-align: bottom;\" width=\"59\" height=\"60\" /></td>\r\n" + 
			"</tr>\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"font-size: 13px; color: #999; font-weight: bold; height: 22px; letter-spacing: -0.7px; line-height: 13px;\" align=\"center\" valign=\"bottom\">개인정보 검출관리센터(PIMC)에서 발송되는 안내 메일입니다.</td>\r\n" + 
			"</tr>\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"height: 28px;\">&nbsp;</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>";
	
	private String m1_body="<table style=\"border: 1px solid #cccccc; padding-top: 30px; height: 239px;\" border=\"0\" width=\"620\" cellspacing=\"0\" cellpadding=\"0\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr style=\"height: 84px;\">\r\n" + 
			"<td style=\"padding-left: 30px; height: 84px; width: 0px;\">&nbsp;</td>\r\n" + 
			"<td style=\"font-size: 13px; font-weight: bold; height: 84px; letter-spacing: -0.5px; width: 590px;\">\r\n" + 
			"<div style=\"line-height: 15px;\">정보보호담당 IT보안팀에서 안내 드립니다.\r\n" + 
			"<p>&nbsp;</p>\r\n" + 
			"<br>아래와 같이 2022년 01월 전사 개인정보 검출관리 대상 시스템 정보를 안내드리오니</br>\r\n" + 
			"<br>담당자께서는 아래 링크에 접속 하셔서 검출 일정 수립 및 검출 작업을 수행해 주시기</br>\r\n" + 
			"<br>바랍니다.</br>\r\n" + 
			"<p>담당자 변경 등 정보 수정이 필요하신 경우 개인정보 검출관리센터 내의 </p>\r\n" + 
			"<p>[대상 관리 > 담당자 관리] 메뉴를 활용하여 변경사항을 등록해 주시기 바랍니다.\r\n" + 
			"<p>&nbsp;</p>\r\n" + 
			"<div style=\"font-size: 14px; font-weight: bold;\"><SPAN STYLE=\"background-color:#e6e6e6;\">개인정보 검출관리센터(PIMC) 바로가기(<a href=\"https://pimc.sktelecom.com\">https://pimc.sktelecom.com</a>)</div>\r\n" + 
			"<p>&nbsp;</p>\r\n" + 
			"<p>기타 문의사항은 본 메일에 회신 또는 아래 문의처로 연락주시기 바랍니다.</p>\r\n" + 
			"<p>&nbsp;</p>\r\n" + 
			"</div>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"<tr style=\"height: 51px;\">\r\n" + 
			"<td style=\"padding-left: 30px; height: 51px; width: 0px;\">&nbsp;</td>\r\n" + 
			"<td style=\"height: 51px; width: 590px;\">\r\n" + 
			"<table style=\"height: 16px;\" border=\"0\" width=\"590\" cellspacing=\"0\" cellpadding=\"0\">\r\n" + 
			"<tbody>\r\n" + 
			"<td align=\"left\" width=\"80\" style=\"font-size:13px;color:#999;font-weight:700;line-height:15px;\">수 신 자 :</td>\r\n" + 
			"<td style=\"font-size: 13px; color: #222222; font-weight: bold; height: 16px; width: 586px;\" align=\"left\">홍길동</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"<table style=\"padding-top: 10px;\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"font-size: 13px; color: #999; font-weight: bold; line-height: 15px;\" align=\"left\" width=\"80\">소속부서 :</td>\r\n" + 
			"<td style=\"font-size: 13px; color: #222; font-weight: bold;\" width=\"575\">PIMC 사용자</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"padding-left:30;\"></td>\r\n" + 
			"<td style=\"height:40px;\"></td>\r\n" + 
			"<tr style=\"height: 42px;\">\r\n" + 
			"<td style=\"padding-left: 30px; height: 42px; width: 0px;\">&nbsp;</td>\r\n" + 
			"<td style=\"height: 42px; font-size: 13px; color: #999999; font-weight: bold; line-height: 13px; width: 590px;\">변경 내역</td>\r\n" + 
			"</tr>\r\n" + 
			"<tr style=\"height: 22px;\">\r\n" + 
			"<td style=\"padding-left: 30px; height: 22px; width: 0px;\">&nbsp;</td>\r\n" + 
			"<td style=\"height: 22px; width: 590px;\">\r\n" + 
			"<table border=\"0\" width=\"590\" cellspacing=\"0\" cellpadding=\"0\">\r\n" + 
			"<tbody>";
	
	
	private String m2_body="<table style=\"border: 1px solid #cccccc; padding-top: 30px; height: 239px;\" border=\"0\" width=\"620\" cellspacing=\"0\" cellpadding=\"0\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr style=\"height: 84px;\">\r\n" + 
			"<td style=\"padding-left: 30px; height: 84px; width: 0px;\">&nbsp;</td>\r\n" + 
			"<td style=\"font-size: 13px; font-weight: bold; height: 84px; letter-spacing: -0.5px; width: 590px;\">\r\n" + 
			"<div style=\"line-height: 15px;\">정보보호담당 IT보안팀에서 안내 드립니다.\r\n" + 
			"<p>&nbsp;</p>\r\n" + 
			"<br>아래와 같이 개인정보 검출관리 대상 시스템의 담당자 현황을 안내 드리오니</br>\r\n" + 
			"<br>업무에 참고하여 주시기 바라고, 상세 내역에 대한 확인 또는 담당자 정보의</br>\r\n" + 
			"<p>변경이 필요한 경우 아래 링크로 접속하여 조치해 주시기 바랍니다.</p>\r\n" + 
			"<p>&nbsp;</p>\r\n" + 
			"<div style=\"font-size: 14px; font-weight: bold;\"><SPAN STYLE=\"background-color:#e6e6e6;\">개인정보 검출관리센터(PIMC) 바로가기(<a href=\"https://pimc.sktelecom.com\">https://pimc.sktelecom.com</a>)</div>\r\n" + 
			"<p>&nbsp;</p>\r\n" + 
			"<p>기타 문의사항은 본 메일에 회신 또는 아래 문의처로 연락주시기 바랍니다.</p>\r\n" + 
			"<p>&nbsp;</p>\r\n" + 
			"</div>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"<tr style=\"height: 51px;\">\r\n" + 
			"<td style=\"padding-left: 30px; height: 51px; width: 0px;\">&nbsp;</td>\r\n" + 
			"<td style=\"height: 51px; width: 590px;\">\r\n" + 
			"<table style=\"height: 16px;\" border=\"0\" width=\"590\" cellspacing=\"0\" cellpadding=\"0\">\r\n" + 
			"<tbody>";
	
	private String m3_body="<table style=\"border: 1px solid #cccccc; padding-top: 30px; height: 239px;\" border=\"0\" width=\"620\" cellspacing=\"0\" cellpadding=\"0\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr style=\"height: 84px;\">\r\n" + 
			"<td style=\"padding-left: 30px; height: 84px; width: 0px;\">&nbsp;</td>\r\n" + 
			"<td style=\"font-size: 13px; font-weight: bold; height: 84px; letter-spacing: -0.5px; width: 590px;\">\r\n" + 
			"<div style=\"line-height: 15px;\">정보보호담당 IT보안팀에서 안내 드립니다.\r\n" + 
			"<p>&nbsp;</p>\r\n" + 
			"<br>SKT_REGDATE 금일 완료된 개인정보 검출 작업 결과, 아래와 같이</br>\r\n" + 
			"<br>SKT_USER(SKT_USER_NO)님 께서 담당하고 계시는 시스템에서 개인정보가</br>\r\n" + 
			"<br>검출되었음을 알내 드립니다.검출결과에 대한 상세정보는 아래 링크에</br>\r\n" + 
			"<br>접속하시어 확인해 주시고, 7 영업일 이내 조치 계획을 등록해 주시기 바랍니다.</br>\r\n" + 
			"<p>&nbsp;</p>\r\n" + 
			"<div style=\"font-size: 14px; font-weight: bold;\"><SPAN STYLE=\"background-color:#e6e6e6;\">개인정보 검출관리센터(PIMC) 바로가기(<a href=\"https://pimc.sktelecom.com\">https://pimc.sktelecom.com</a>)</div>\r\n" + 
			"<p>&nbsp;</p>\r\n" + 
			"<p>기타 문의사항은 본 메일에 회신 또는 아래 문의처로 연락주시기 바랍니다.</p>\r\n" + 
			"<p>&nbsp;</p>\r\n" + 
			"</div>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"<tr style=\"height: 51px;\">\r\n" + 
			"<td style=\"padding-left: 30px; height: 51px; width: 0px;\">&nbsp;</td>\r\n" + 
			"<td style=\"height: 51px; width: 590px;\">\r\n" + 
			"<table style=\"height: 16px;\" border=\"0\" width=\"590\" cellspacing=\"0\" cellpadding=\"0\">\r\n" + 
			"<tbody>";
	
	private String m_receiver="<td align=\"left\" width=\"80\" style=\"font-size:13px;color:#999;font-weight:700;line-height:15px;\">수 신 자 :</td>\r\n" + 
			"<td style=\"font-size: 13px; color: #222222; font-weight: bold; height: 16px; width: 586px;\" align=\"left\">SKT_USER</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"<table style=\"padding-top: 10px;\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"font-size: 13px; color: #999; font-weight: bold; line-height: 15px;\" align=\"left\" width=\"80\">소속부서 :</td>\r\n" + 
			"<td style=\"font-size: 13px; color: #222; font-weight: bold;\" width=\"575\">SKT_SOSOK</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"padding-left:30;\"></td>\r\n" + 
			"<td style=\"height:40px;\"></td>\r\n" + 
			"<tr style=\"height: 42px;\">\r\n" + 
			"<td style=\"padding-left: 30px; height: 42px; width: 0px;\">&nbsp;</td>\r\n" + 
			"<td style=\"height: 42px; font-size: 13px; color: #999999; font-weight: bold; line-height: 13px; width: 590px;\">변경 내역</td>\r\n" + 
			"</tr>\r\n" + 
			"<tr style=\"height: 22px;\">\r\n" + 
			"<td style=\"padding-left: 30px; height: 22px; width: 0px;\">&nbsp;</td>\r\n" + 
			"<td style=\"height: 22px; width: 590px;\">\r\n" + 
			"<table border=\"0\" width=\"590\" cellspacing=\"0\" cellpadding=\"0\">\r\n" + 
			"<tbody>";
	
	private String m_end="</tbody>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"<tr style=\"height: 40px;\">\r\n" + 
			"<td style=\"padding-left: 30px; height: 40px; width: 0px;\">&nbsp;</td>\r\n" + 
			"<td style=\"height: 40px; width: 590px;\">&nbsp;</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"<table border=\"0\" width=\"700\" cellspacing=\"0\" cellpadding=\"0\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"height: 80px;\">&nbsp;</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"<table style=\"border-top: 1px solid #ccc;\" border=\"0\" width=\"700\" cellspacing=\"0\" cellpadding=\"0\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td bgcolor=\"#e6e6e6\" height=\"120\">\r\n" + 
			"<table>\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"padding-left: 40px;\" width=\"110\"><img src=\"https://pimc.sktelecom.com/resources/assets/images/SKT_mail_footer%20logo.png\" width=\"82\" height=\"32\" /></td>\r\n" + 
			"<td style=\"letter-spacing: -0.2px;\">\r\n" + 
			"<div style=\"font-size: 12px; color: #999; font-weight: bold; line-height: 13px; padding-top: 0; padding-bottom: 10px;\">- 관련 문의처: IT보안 운영실 담당(02-6400-8842, kimcom96@partner.sktelecom.com) </div>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"<table border=\"0\" width=\"700\" cellspacing=\"0\" cellpadding=\"0\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"font-size: 11px; color: #aaa; font-weight: bold;\" align=\"center\" height=\"42\">Personal Information Management Center</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"</body>";
			
	
	public MailForm() {
		
	}


	public String get_header() {
		return m_header;
	}
	
	public String get_body(int i) {
		String body = "";
		
		if(i == 1) {
			
		} else if(i == 2) {
			body = m2_body;
		} else if(i == 3) {
			body = m3_body;
		}
		
		return body;
	}
	
	public String get_receiver() {
		return m_receiver;
	}

	public String get_end() {
		return m_end;
		
	}


}
