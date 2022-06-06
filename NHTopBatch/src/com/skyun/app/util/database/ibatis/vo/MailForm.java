package com.skyun.app.util.database.ibatis.vo;

public class MailForm {
	private String m_header="<body style=\"font-family:'Noto Sans KR',sans-serif;padding:0;margin:0;\">" + 
			"<table style=\"border: 1px solid #ccc;\" border=\"0\" width=\"700\" cellspacing=\"0\" align=\"center\">" + 
			"<tbody>" + 
			"<tr>" + 
			"<td align=\"center\">" + 
			"<table style=\"border-bottom: 2px solid #000;\" border=\"0\" width=\"620\" cellspacing=\"0\" cellpadding=\"0\">" + 
			"<tbody>" + 
			"<tr>" + 
			"<td><img src=\"https://pimc.sktelecom.com/resources/assets/images/SKT_mail_title_1.png\" width=\"620\" height=\"91\" /></td>" + 
			"</tr>" + 
			"</tbody>" + 
			"</table>" + 
			"<table border=\"0\" width=\"620\" cellspacing=\"0\" cellpadding=\"0\">" + 
			"<tbody>" + 
			"<tr>" + 
			"<td style=\"height: 90px;\" align=\"center\" valign=\"bottom\"><img src =\"https://pimc.sktelecom.com/resources/assets/images/SKT_mail_icon_2.png\" style=\"vertical-align: bottom;\" width=\"59\" height=\"60\" /></td>" + 
			"</tr>" + 
			"<tr>" + 
			"<td style=\"font-size: 13px; color: #999; font-weight: bold; height: 22px; letter-spacing: -0.7px; line-height: 13px;\" align=\"center\" valign=\"bottom\">개인정보 검출관리센터(PIMC)에서 발송되는 안내 메일입니다.</td>" + 
			"</tr>" + 
			"<tr>" + 
			"<td style=\"height: 28px;\">&nbsp;</td>" + 
			"</tr>" + 
			"</tbody>" + 
			"</table>";
	
	// 결재 완료 안내
	private String m1_body="<table style=\"border: 1px solid #cccccc; padding-top: 30px; height: 239px;\" border=\"0\" width=\"620\" cellspacing=\"0\" cellpadding=\"0\">" + 
			"<tbody>" + 
			"<tr style=\"height: 84px;\">" + 
			"<td style=\"padding-left: 30px; height: 84px; width: 0px;\">&nbsp;</td>" + 
			"<td style=\"font-size: 13px; font-weight: bold; height: 84px; letter-spacing: -0.5px; width: 590px;\">" + 
			"<div style=\"line-height: 15px;\">" + 
			"<p>REQUEST_DATE 요청하신 개인정보 검출결과 조치계획에 대한 전자 결재가  STATUS</p>" + 
			"<p>되었음을 안내 드리오니 담당자께서는 아래 링크에 접속하셔서 후속조치를 </p>" + 
			"<p>진행하여 주시기 바랍니다.</p><br>" + 
			"<p><span style=\"font-size:13px; font-weight: bold;\">-관련 문의처: IT보안 운영실 담당(02-6400-8842, pimc@sktelecom.com)</span><p>" +
			"<p>&nbsp;</p>" + 
			"<p>MENU</p>" + 
			"<p>&nbsp;</p>" + 
			"<div style=\"font-size: 14px; font-weight: bold;\">" + 
			"<span style=\"background-color: #e6e6e6;\">개인정보검출관리센터(PIMC) 바로가기(<a href=\"https://pimc.sktelecom.com\" target=\"_blank\">https://pimc.sktelecom.com</a>)</span>" + 
			"</div>" + 
			"</div>" + 
			"</td>" + 
			"</tr>" + 
			"<tr style=\"height: 22px;\">" + 
			"<td style=\"padding-left: 30px; height: 22px; width: 0px;\">&nbsp;</td>" + 
			"<td style=\"height: 22px; width: 590px;\">" + 
			"<table border=\"0\" width=\"590\" cellspacing=\"0\" cellpadding=\"0\">" + 
			"<tbody></tbody>"+
			"</table>" + 
			"</td>" + 
			"</tr>" + 
			"<tr style=\"height: 40px;\">" + 
			"<td style=\"padding-left: 30px; height: 40px; width: 0px;\">&nbsp;</td>" + 
			"<td style=\"height: 40px; width: 590px;\">&nbsp;</td>" + 
			"</tr>" + 
			"</tbody>" + 
			"</table>";
/*	private String m1_body="<table style=\"border: 1px solid #cccccc; padding-top: 30px; height: 239px;\" border=\"0\" width=\"620\" cellspacing=\"0\" cellpadding=\"0\">" + 
			"<tbody>" + 
			"<tr style=\"height: 84px;\">" + 
			"<td style=\"padding-left: 30px; height: 84px; width: 0px;\">&nbsp;</td>" + 
			"<td style=\"font-size: 13px; font-weight: bold; height: 84px; letter-spacing: -0.5px; width: 590px;\">" + 
			"<div style=\"line-height: 15px;\">정보보호담당 IT보안팀에서 안내 드립니다." + 
			"<p>&nbsp;</p>" + 
			"<br>아래와 같이 개인정보 검출관리 대상 정/오탐 결재 현황을 안내드리오니 </br>" + 
			"<br>담당자께서는 아래 링크에 접속 하셔서 결재 내역을 확인해주십시오.</br>" + 
			"<br>바랍니다.</br>" + 
			"<p>[결과 관리 > 결재 관리] 메뉴를 활용하여 결재 내역을 확인 바랍니다." + 
			"<p>&nbsp;</p>" + 
			"<div style=\"font-size: 14px; font-weight: bold;\"><span style=\"background-color:#e6e6e6;\">개인정보 검출관리센터(PIMC) 바로가기(<a href=\"https://pimc.sktelecom.com\">https://pimc.sktelecom.com</a>)</span></div>" + 
			"<p></p>" + 
			"<p>기타 문의사항은 본 메일에 회신 또는 아래 문의처로 연락주시기 바랍니다.</p>" + 
			"<p></p>" + 
			"</div>" + 
			"</td>" + 
			"</tr>" + 
			"<tr style=\"height: 22px;\">" + 
			"<td style=\"padding-left: 30px; height: 22px; width: 0px;\">&nbsp;</td>" + 
			"<td style=\"height: 22px; width: 590px;\">" + 
			"<table border=\"0\" width=\"590\" cellspacing=\"0\" cellpadding=\"0\">" + 
			"<tbody>";
*/	
	
	private String m2_body="<table style=\"border: 1px solid #cccccc; padding-top: 30px; height: 239px;\" border=\"0\" width=\"620\" cellspacing=\"0\" cellpadding=\"0\">" + 
				"<tbody>" + 
				"<tr style=\"height: 84px;\">" + 
				"<td style=\"padding-left: 30px; height: 84px; width: 0px;\">&nbsp;</td>" + 
				"<td style=\"font-size: 13px; font-weight: bold; height: 84px; letter-spacing: -0.5px; width: 590px;\">" + 
				"<table style=\"height: 16px; padding-top: 13px;\" border=\"0\" width=\"590\" cellspacing=\"0\" cellpadding=\"0\">" + 
				"<tbody>" + 
				"<tr> " + 
				"<td align=\"left\" width=\"45\" style=\"font-size:13px;color:#999;font-weight:700;line-height:15px;\">수신자</td>" + 
				"<td style=\"font-size: 13px; color: #222222; font-weight: bold; height: 16px; width: 586px;\" align=\"left\">SKT_USER</td>" + 
				"</tr>" + 
				"</tbody>" + 
				"</table>" + 
				"<table style=\"padding: 10px 0 20px 0;\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">" + 
				"<tbody>" + 
				"<tr>" + 
				"<td style=\"font-size: 13px; color: #999; font-weight: bold; line-height: 15px;\" align=\"left\" width=\"60\">소속부서</td>" + 
				"<td style=\"font-size: 13px; color: #222; font-weight: bold;\" width=\"575\">SKT_SOSOK</td>" + 
				"</tr>" + 
				"</tbody>" + 
				"</table>" + 
				"<div style=\"line-height: 15px;\">" + 
				"정보보호담당 IT보안팀에서 안내 드립니다." + 
				"<p>&nbsp;</p>" + 
				"<p>개인정보보호법 및 그룹 자경단 개인정보관리실태 점검 기준에 따라 당사 운용 서버 내 불필요하게 </p>" + 
				"<p>저장된 개인정보 파일에 대한 정기 검출 및 삭제/보호 조치 작업을 진행 중에 있습니다.</p>" + 
				"<p>&nbsp;</p>" + 
				"<p>아래와 같이 개인정보 검출관리 대상 시스템의 담당자로 지정 되었음을 안내 드리오니, </p>" + 
				"<p>상세 내역에 대한 확인 또는 담당자 정보 변경이 필요한 경우 아래 링크로 접속하여 </p>" + 
				"<p>조치해 주시기 바랍니다.</p><br>" + 
				"<p><span style=\"font-size:13px; font-weight: bold;\">기타 문의사항은 본 메일에 회신 또는 아래 문의처로 연락주시기 바랍니다. <br></span><p>" + 
				"<p><span style=\"font-size:13px; font-weight: bold;\">-관련 문의처: IT보안 운영실 담당(02-6400-8842, pimc@sktelecom.com)</span><p>" +
				"<p>&nbsp;</p>" + 
				"</div>" + 
				"</td>" + 
				"</tr>";
	
/*	private String m2_body="<table style=\"border: 1px solid #cccccc; padding-top: 30px; height: 239px;\" border=\"0\" width=\"620\" cellspacing=\"0\" cellpadding=\"0\">" + 
			"<tbody>" + 
			"<tr style=\"height: 84px;\">" + 
			"<td style=\"padding-left: 30px; height: 84px; width: 0px;\">&nbsp;</td>" + 
			"<td style=\"font-size: 13px; font-weight: bold; height: 84px; letter-spacing: -0.5px; width: 590px;\">" + 
			"<div style=\"line-height: 15px;\">정보보호담당 IT보안팀에서 안내 드립니다." + 
			"<p>&nbsp;</p>" + 
			"<br>아래와 같이 개인정보 검출관리 대상 시스템의 담당자 현황을 안내 드리오니</br>" + 
			"<br>업무에 참고하여 주시기 바라고, 상세 내역에 대한 확인 또는 담당자 정보의</br>" + 
			"<p>변경이 필요한 경우 아래 링크로 접속하여 조치해 주시기 바랍니다.</p>" + 
			"<p>&nbsp;</p>" + 
			"<SPAN STYLE=\"background-color:#e6e6e6; font-size: 14px; font-weight: bold;\">개인정보 검출관리센터(PIMC) 바로가기(<a href=\"https://pimc.sktelecom.com\">https://pimc.sktelecom.com</a>)</span>" + 
			"<p>&nbsp;</p>" + 
			"<p>기타 문의사항은 본 메일에 회신 또는 아래 문의처로 연락주시기 바랍니다.</p>" + 
			"<p>&nbsp;</p>" + 
			"</div>" + 
			"</td>" + 
			"</tr>" + 
			"<tr style=\"height: 51px;\">" + 
			"<td style=\"padding-left: 30px; height: 51px; width: 0px;\">&nbsp;</td>" + 
			"<td style=\"height: 51px; width: 590px;\">" + 
			"<table style=\"height: 16px;\" border=\"0\" width=\"590\" cellspacing=\"0\" cellpadding=\"0\">" + 
			"<tbody>";
*/	
	private String m3_body="<table style=\"border: 1px solid #cccccc; padding-top: 30px; height: 239px;\" border=\"0\" width=\"620\" cellspacing=\"0\" cellpadding=\"0\">" + 
			"<tbody>" + 
			"<tr style=\"height: 84px;\">" + 
			"<td style=\"padding-left: 30px; height: 84px; width: 0px;\">&nbsp;</td>" + 
			"<td style=\"font-size: 13px; font-weight: bold; height: 84px; letter-spacing: -0.5px; width: 590px;\">" + 
			"<table style=\"height: 16px; padding-top: 13px;\" border=\"0\" width=\"590\" cellspacing=\"0\" cellpadding=\"0\">" + 
			"<tbody>" + 
			"<tr> " + 
			"<td align=\"left\" width=\"45\" style=\"font-size:13px;color:#999;font-weight:700;line-height:15px;\">수신자</td>" + 
			"<td style=\"font-size: 13px; color: #222222; font-weight: bold; height: 16px; width: 586px;\" align=\"left\">SKT_USER</td>" + 
			"</tr>" + 
			"</tbody>" + 
			"</table>" + 
			"<table style=\"padding: 10px 0 20px 0;\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">" + 
			"<tbody>" + 
			"<tr>" + 
			"<td style=\"font-size: 13px; color: #999; font-weight: bold; line-height: 15px;\" align=\"left\" width=\"60\">소속부서</td>" + 
			"<td style=\"font-size: 13px; color: #222; font-weight: bold;\" width=\"575\">SKT_SOSOK</td>" + 
			"</tr>" + 
			"</tbody>" + 
			"</table>" + 
			"<div style=\"line-height: 15px;\">" + 
			"정보보호담당 IT보안팀에서 안내 드립니다." + 
			"<p>&nbsp;</p>" + 
			"<p>개인정보보호법 및 그룹 자경단 개인정보관리실태 점검 기준에 따라 당사 운용 서버 내 불필요하게 </p>" + 
			"<p>저장된 개인정보 파일에 대한 정기 검출 및 삭제/보호 조치 작업을 진행 중에 있습니다.</p>" + 
			"<p>&nbsp;</p>" + 
			"<p>금번 개인정보 검출 작업 결과, 아래와 같이 다당학보 계신 시스템에서 개인정보가 </p>" + 
			"<p>포함된 파일이 검출되어 안내 드리오니, 상세정보 확인 후 조치 계획을 기한 내</p>" + 
			"<p>등록 하여 주시기 바랍니다.</p><br>" + 
			"<p><span style=\"font-size:13px; font-weight: bold;\">기타 문의사항은 본 메일에 회신 또는 아래 문의처로 연락주시기 바랍니다. <br></span><p>\r\n" + 
			"<p><span style=\"font-size:13px; font-weight: bold;\">-관련 문의처: IT보안 운영실 담당(02-6400-8842, pimc@sktelecom.com)</span><p>" +
			"<p>&nbsp;</p>" + 
			"</div>" + 
			"</td>" + 
			"</tr>";
	
/*	private String m3_body="<table style=\"border: 1px solid #cccccc; padding-top: 30px; height: 239px;\" border=\"0\" width=\"620\" cellspacing=\"0\" cellpadding=\"0\">" + 
			"<tbody>" + 
			"<tr style=\"height: 84px;\">" + 
			"<td style=\"padding-left: 30px; height: 84px; width: 0px;\">&nbsp;</td>" + 
			"<td style=\"font-size: 13px; font-weight: bold; height: 84px; letter-spacing: -0.5px; width: 590px;\">" + 
			"<div style=\"line-height: 15px;\">정보보호담당 IT보안팀에서 안내 드립니다." + 
			"<p>&nbsp;</p>" + 
			"<br>SKT_REGDATE 금일 완료된 개인정보 검출 작업 결과, 아래와 같이</br>" + 
			"<br>SKT_USER(SKT_USER_NO)님 께서 담당하고 계시는 시스템에서 개인정보가</br>" + 
			"<br>검출되었음을 알내 드립니다.검출결과에 대한 상세정보는 아래 링크에</br>" + 
			"<br>접속하시어 확인해 주시고, 7 영업일 이내 조치 계획을 등록해 주시기 바랍니다.</br>" + 
			"<p>&nbsp;</p>" + 
			"<div style=\"font-size: 14px; font-weight: bold;\"><SPAN STYLE=\"background-color:#e6e6e6;\">개인정보 검출관리센터(PIMC) 바로가기(<a href=\"https://pimc.sktelecom.com\">https://pimc.sktelecom.com</a>)</span></div>" + 
			"<p>&nbsp;</p>" + 
			"<p>기타 문의사항은 본 메일에 회신 또는 아래 문의처로 연락주시기 바랍니다.</p>" + 
			"<p>&nbsp;</p>" + 
			"</div>" + 
			"</td>" + 
			"</tr>" + 
			"<tr style=\"height: 51px;\">" + 
			"<td style=\"padding-left: 30px; height: 51px; width: 0px;\">&nbsp;</td>" + 
			"<td style=\"height: 51px; width: 590px;\">" + 
			"<table style=\"height: 16px;\" border=\"0\" width=\"590\" cellspacing=\"0\" cellpadding=\"0\">" + 
			"<tbody>";
*/	
	private String m_receiver1="";
	
	/*private String m_receiver1="<td align=\"left\" width=\"80\" style=\"font-size:13px;color:#999;font-weight:700;line-height:15px;\">수 신 자 :</td>" + 
			"<td style=\"font-size: 13px; color: #222222; font-weight: bold; height: 16px; width: 586px;\" align=\"left\">SKT_USER</td>" + 
			"</tr>" + 
			"</tbody>" + 
			"</table>" + 
			"<table style=\"padding-top: 10px;\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">" + 
			"<tbody>" + 
			"<tr>" + 
			"<td style=\"font-size: 13px; color: #999; font-weight: bold; line-height: 15px;\" align=\"left\" width=\"80\">소속부서 :</td>" + 
			"<td style=\"font-size: 13px; color: #222; font-weight: bold;\" width=\"575\">SKT_SOSOK</td>" + 
			"</tr>" + 
			"</tbody>" + 
			"</table>" + 
			"</td>" + 
			"</tr>" + 
			"<tr>" + 
			"<td style=\"padding-left:30;\"></td>" + 
			"<td style=\"height:15px;\"></td>" + 
			"<tr style=\"height: 42px;\">" + 
			"<td style=\"padding-left: 30px; height: 42px; width: 0px;\">&nbsp;</td>" + 
			"<td style=\"height: 42px; font-size: 13px; color: #999999; font-weight: bold; line-height: 13px; width: 590px;\">결재 내역</td>" + 
			"</tr>" + 
			"<tr style=\"height: 22px;\">" + 
			"<td style=\"padding-left: 30px; height: 22px; width: 0px;\">&nbsp;</td>" + 
			"<td style=\"height: 22px; width: 590px;\">" + 
			"<table border=\"0\" width=\"590\" cellspacing=\"0\" cellpadding=\"0\">" + 
			"<tbody>";*/
	
	private String m_receiver="<tr>" + 
			"<tr style=\"height: 42px;\">" + 
			"<td style=\"padding-left: 30px; height: 42px; width: 0px;\">&nbsp;</td>" + 
			"<td style=\"height: 42px; font-size: 13px; color: #999999; font-weight: bold; line-height: 13px; width: 590px;\">" + 
			"변경 내역(반영 일자 : REGDATE)" + 
			"</td>" + 
			"</tr>" + 
			"<tr style=\"height: 22px;\">" + 
			"<td style=\"padding-left: 30px; height: 22px; width: 0px;\">&nbsp;</td>" + 
			"<td style=\"height: 22px; width: 590px;\">" + 
			"<table border=\"0\" width=\"550\" cellspacing=\"0\" cellpadding=\"0\" style=\"text-align: center; font-size: 12px; height: 50px; border-collapse: collapse;\">" + 
			"<tbody >" + 
			"<tr>" + 
			"<td style=\"font-weight: bold; width: 30%; border: 1px solid #cccccc;\">대상 시스템 명</td>" + 
			"<td style=\"font-weight: bold; width: 30%; border: 1px solid #cccccc;\">서비스명</td>" + 
			"<td style=\"font-weight: bold; width: 30%; border: 1px solid #cccccc;\">권한</td>" + 
			"</tr>" + 
			"DETAILCON" + 
			"</tbody>" + 
			"</table>" + 
			"</td>" + 
			"</tr>" + 
			"<tr style=\"height: 30px;\">" + 
			"<td style=\"padding-left: 30px; height: 30px; width: 0px;\">&nbsp;</td>" + 
			"<td style=\"height: 30px; width: 590px;\">&nbsp;</td>" + 
			"</tr>" + 
			"<tr style=\"height: 42px;\">" + 
			"<td style=\"padding-left: 30px; height: 42px; width: 0px;\">&nbsp;</td>" + 
			"<td style=\"height: 42px; font-size: 13px; color: #999999; font-weight: bold; line-height: 13px; width: 590px;\">" + 
			"상세정보 확인" + 
			"</td>" + 
			"</tr>" + 
			"<tr style=\"height: 40px;\">" + 
			"<td style=\"padding-left: 30px; height: 40px; width: 0px;\">&nbsp;</td>" + 
			"<td style=\"height: 20px; width: 590px;\">" + 
			"<p style=\"margin: 5px 0 0 0;\"><span style=\"background-color:#e6e6e6; font-size: 13px; font-weight: bold;\">개인정보검출관리센터(PIMC) 바로가기(<a href=\"https://pimc.sktelecom.com\" target=\"_blank\">https://pimc.sktelecom.com</a>)</span></p>" + 
			"<p style=\"margin: 0px;\"><span style=\"font-size:13px; font-weight: bold; \">(메뉴이동 : 대상관리 -&gt; 대상조회 및 현행화)</span></p>" + 
			"</td>" + 
			"</tr>" + 
			"<tr style=\"height: 30px;\">" + 
			"<td style=\"padding-left: 30px; height: 30px; width: 0px;\">&nbsp;</td>" + 
			"<td style=\"height: 30px; width: 590px;\">&nbsp;</td>" + 
			"</tr>"+
			"</tbody>" + 
			"</table>";
	
/*	private String m_receiver="<td align=\"left\" width=\"80\" style=\"font-size:13px;color:#999;font-weight:700;line-height:15px;\">수 신 자 :</td>" + 
			"<td style=\"font-size: 13px; color: #222222; font-weight: bold; height: 16px; width: 586px;\" align=\"left\">SKT_USER</td>" + 
			"</tr>" + 
			"</tbody>" + 
			"</table>" + 
			"<table style=\"padding-top: 10px;\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">" + 
			"<tbody>" + 
			"<tr>" + 
			"<td style=\"font-size: 13px; color: #999; font-weight: bold; line-height: 15px;\" align=\"left\" width=\"80\">소속부서 :</td>" + 
			"<td style=\"font-size: 13px; color: #222; font-weight: bold;\" width=\"575\">SKT_SOSOK</td>" + 
			"</tr>" + 
			"</tbody>" + 
			"</table>" + 
			"</td>" + 
			"</tr>" + 
			"<tr>" + 
			"<td style=\"padding-left:30;\"></td>" + 
			"<td style=\"height:40px;\"></td>" + 
			"<tr style=\"height: 42px;\">" + 
			"<td style=\"padding-left: 30px; height: 42px; width: 0px;\">&nbsp;</td>" + 
			"<td style=\"height: 42px; font-size: 13px; color: #999999; font-weight: bold; line-height: 13px; width: 590px;\">변경 내역</td>" + 
			"</tr>" + 
			"<tr style=\"height: 22px;\">" + 
			"<td style=\"padding-left: 30px; height: 22px; width: 0px;\">&nbsp;</td>" + 
			"<td style=\"height: 22px; width: 590px;\">" + 
			"<table border=\"0\" width=\"590\" cellspacing=\"0\" cellpadding=\"0\">" + 
			"<tbody>";
*/	
	private String m_receiver3="<tr>" + 
			"<tr style=\"height: 35px;\">" + 
			"<td style=\"padding-left: 30px; height: 35px; width: 0px;\">&nbsp;</td>" + 
			"<td style=\"height: 35px; font-size: 13px; color: #999999; font-weight: bold; line-height: 13px; width: 590px;\">" + 
			"조치계획 등록기한" + 
			"</td>" + 
			"</tr>" + 
			"<tr style=\"height: 30px;\">" + 
			"<td style=\"padding-left: 30px; height: 30px; width: 0px;\">&nbsp;</td>" + 
			"<td style=\"height: 20px; width: 590px;\">" + 
			"<span style=\"font-size:13px; font-weight: bold; \">ACTION_DATE</span>" + 
			"</td>" + 
			"</tr>" + 
			"<tr style=\"height: 15px;\">" + 
			"<td style=\"padding-left: 30px; height: 15px; width: 0px;\">&nbsp;</td>" + 
			"<td style=\"height: 15px; width: 590px;\">&nbsp;</td>" + 
			"</tr>" + 
			"<tr style=\"height: 42px;\">" + 
			"<td style=\"padding-left: 30px; height: 42px; width: 0px;\">&nbsp;</td>" + 
			"<td style=\"height: 42px; font-size: 13px; color: #999999; font-weight: bold; line-height: 13px; width: 590px;\">" + 
			"검출내역" + 
			"</td>" + 
			"</tr>" + 
			"<tr style=\"height: 22px;\">" + 
			"<td style=\"padding-left: 30px; height: 22px; width: 0px;\">&nbsp;</td>" + 
			"<td style=\"height: 22px; width: 590px;\">" + 
			"<table border=\"0\" width=\"550\" cellspacing=\"0\" cellpadding=\"0\" style=\"text-align: center; font-size: 12px; height: 50px; border-collapse: collapse;\">" + 
			"<tbody >" + 
			"<tr>" + 
			"<td style=\"font-weight: bold; width: 30%; border: 1px solid #cccccc;\">호스트명</td>" + 
			"<td style=\"font-weight: bold; width: 25%; border: 1px solid #cccccc;\">서비스명</td>" + 
			"<td style=\"font-weight: bold; width: 20%; border: 1px solid #cccccc;\">검출 파일수</td>" + 
			"<td style=\"font-weight: bold; width: 25%; border: 1px solid #cccccc;\">검출 건수</td>" + 
			"</tr>" + 
			"DETAILCON" + 
			"</tbody>" + 
			"</table>" + 
			"</td>" + 
			"</tr>" + 
			"<tr style=\"height: 30px;\">" + 
			"<td style=\"padding-left: 30px; height: 30px; width: 0px;\">&nbsp;</td>" + 
			"<td style=\"height: 30px; width: 590px;\">&nbsp;</td>" + 
			"</tr>" + 
			"</tr>" + 
			"<tr style=\"height: 42px;\">" + 
			"<td style=\"padding-left: 30px; height: 42px; width: 0px;\">&nbsp;</td>" + 
			"<td style=\"height: 42px; font-size: 13px; color: #999999; font-weight: bold; line-height: 13px; width: 590px;\">" + 
			"상세정보 확인" + 
			"</td>" + 
			"</tr>" + 
			"<tr style=\"height: 40px;\">" + 
			"<td style=\"padding-left: 30px; height: 40px; width: 0px;\">&nbsp;</td>" + 
			"<td style=\"height: 20px; width: 590px;\">" + 
			"<p style=\"margin: 5px 0 0 0;\"><span style=\"background-color:#e6e6e6; font-size: 13px; font-weight: bold;\">개인정보검출관리센터(PIMC)바로가기(<a href=\"https://pimc.sktelecom.com\" target=\"_blank\">https://pimc.sktelecom.com</a>)</span></p>" + 
			"<p style=\"margin: 0px;\"><span style=\"font-size:13px; font-weight: bold; \">(메뉴이동 : 결과 관리 -&gt; 결과조회/조치계획)</span></p>" + 
			"</td>" + 
			"</tr>" + 
			"<tr style=\"height: 30px;\">" + 
			"<td style=\"padding-left: 30px; height: 30px; width: 0px;\">&nbsp;</td>" + 
			"<td style=\"height: 30px; width: 590px;\">&nbsp;</td>" + 
			"</tr>"+
			"</tbody>" + 
			"</table>";
	
/*	private String m_receiver3="<td align=\"left\" width=\"80\" style=\"font-size:13px;color:#999;font-weight:700;line-height:15px;\">수 신 자 :</td>" + 
			"<td style=\"font-size: 13px; color: #222222; font-weight: bold; height: 16px; width: 586px;\" align=\"left\">SKT_USER</td>" + 
			"</tr>" + 
			"</tbody>" + 
			"</table>" + 
			"<table style=\"padding-top: 10px;\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">" + 
			"<tbody>" + 
			"<tr>" + 
			"<td style=\"font-size: 13px; color: #999; font-weight: bold; line-height: 15px;\" align=\"left\" width=\"80\">소속부서 :</td>" + 
			"<td style=\"font-size: 13px; color: #222; font-weight: bold;\" width=\"575\">SKT_SOSOK</td>" + 
			"</tr>" + 
			"</tbody>" + 
			"</table>" + 
			"</td>" + 
			"</tr>" + 
			"<tr>" + 
			"<td style=\"padding-left:30;\"></td>" + 
			"<td style=\"height:40px;\"></td>" + 
			"<tr style=\"height: 42px;\">" + 
			"<td style=\"padding-left: 30px; height: 42px; width: 0px;\">&nbsp;</td>" + 
			"<td style=\"height: 42px; font-size: 13px; color: #999999; font-weight: bold; line-height: 13px; width: 590px;\">검출 내역</td>" + 
			"</tr>" + 
			"<tr style=\"height: 22px;\">" + 
			"<td style=\"padding-left: 30px; height: 22px; width: 0px;\">&nbsp;</td>" + 
			"<td style=\"height: 22px; width: 590px;\">" + 
			"<table border=\"0\" width=\"590\" cellspacing=\"0\" cellpadding=\"0\">" + 
			"<tbody>";
*/	
	private String m_end="<table border=\"0\" width=\"700\" cellspacing=\"0\" cellpadding=\"0\">" + 
			"<tbody>" + 
			"<tr>" + 
			"<td style=\"height: 80px;\">&nbsp;</td>" + 
			"</tr>" + 
			"</tbody>" + 
			"</table>" + 
			"<table style=\"border-top: 1px solid #ccc;\" border=\"0\" width=\"700\"cellspacing=\"0\" cellpadding=\"0\">" + 
			"<tbody>" + 
			"<tr>" + 
			"<td bgcolor=\"#e6e6e6\" height=\"120\"><table>" + 
			"<tbody>" + 
			"<tr>" + 
			"<td style=\"padding-left: 40px;\" width=\"110\"><img src=\"https://pimc.sktelecom.com/resources/assets/images/SKT_mail_footer%20logo.png\" width=\"82\" height=\"32\" />"+
			"</td>" +
			"<td style=\"font-size: 13px; color: #000000; font-weight: bold;\" align=\"center\" height=\"42\" width=\"390\">Personal Information Management Center</td>" + 
			"<!-- <td style=\"font-size: 13px; color: #FF5000; font-weight: bold;\" align=\"center\" height=\"42\" width=\"390\">Personal Information Management Center</td> --> " + 
			"</tr>" + 
			"</tbody>" + 
			"</table></td>" + 
			"</tr>" + 
			"</tbody>" + 
			"</table>" + 
			"<table border=\"0\" width=\"700\" cellspacing=\"0\" cellpadding=\"0\">" + 
			"<tbody>" + 
			"<tr>" + 
			// "<td style=\"font-size: 11px; color: #aaa; font-weight: bold;\" align=\"center\" height=\"42\">Personal Information Management Center</td>" + 
			"</tr>" + 
			"</tbody>" + 
			"</table>" + 
			"</tr>" + 
			"</tbody>" + 
			"</table>" + 
			"</body>";
			
	
	public MailForm() {
		
	}


	public String get_header() {
		return m_header;
	}
	
	public String get_body(int i) {
		String body = "";
		
		if(i == 1) {
			body = m1_body;
		} else if(i == 2) {
			body = m2_body;
		} else if(i == 3) {
			body = m3_body;
		}
		
		return body;
	}
	
	public String get_receiver(int i) {
		if(i == 1) {
			return m_receiver1;
		} else if(i == 2) {
			return m_receiver;
		} else if(i == 3) {
			return m_receiver3;
		}
		
		return m_receiver;
	}

	public String get_end() {
		return m_end;
		
	}


}
