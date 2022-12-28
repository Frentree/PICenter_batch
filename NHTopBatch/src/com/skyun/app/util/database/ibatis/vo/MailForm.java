package com.skyun.app.util.database.ibatis.vo;

import com.skyun.app.util.config.AppConfig;

public class MailForm {

	private String m1_header="<html>\n" + 
			"	<head>\n" + 
			"<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\n"+			
			"		<title>테스트</title>\n" + 
			"		<style type=\"text/css\">\n" + 
			"			.tg  {border-collapse:collapse;border-spacing:0;}\n" + 
			"			.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}\n" + 
			"			.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}\n" + 
			"			.tg .tg-qbec{font-weight:bold;background-color:#cccccc;border-color:inherit;text-align:center;vertical-align:top}\n" + 
			"			.tg .tg-fymr{border-color:inherit;text-align:left;vertical-align:top;word-wrap: break-word;}\n" + 
			"			.tg  {border-collapse:collapse;border-spacing:0;}\n" + 
			"			.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}\n" + 
			"			.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}\n" + 
			"			.tg .tg-aoc1{border-color:#006EB6;text-align:center;vertical-align:top}\n" + 
			"			.tg .tg-7qyp{border-color:#006EB6;text-align:left;vertical-align:top}\n" + 
			"           .center{text-align:center !important;}\n" + 
			"           .right{text-align:right !important;}\n" + 
			"		</style>\n" + 
			"	</head>\n" + 
			"	<body>\n" + 
			"	<table class=\"tg\" style=\"undefined;table-layout: fixed; width: 850px\">\n" + 
			"	<colgroup>\n" + 
			"	<col style=\"width: 850px\">\n" + 
			"	</colgroup>\n" + 
			"	  <tr>\n" + 
			"	    <th class=\"tg-aoc1\">_rname_(_sabun_) 님께 도착한</th>\n" + 
			"	  </tr>\n" + 
			"	  <tr>\n" + 
			"	    <td class=\"tg-aoc1\"><서버내 개인정보 검색 시스템> 결재 요청 건은 아래와 같습니다.</td>\n" + 
			"	  </tr>\n" + 
			"	  <tr>\n" + 
			"	    <td class=\"tg-7qyp\">\n" + 
			"		<div style=\"overflow:auto;\">\n" +
			"		<table class=\"tg\" style=\"undefined;table-layout: fixed; width: 983px\">\n" + 
			"		<colgroup>\n" + 
			"		<col style=\"width: 250px\">\n" + 
			"		<col style=\"width: 100px\">\n" + 
			"		<col style=\"width: 100px\">\n" + 
			"		<col style=\"width: 150px\">\n" + 
			"		<col style=\"width: 150px\">\n" + 
			"		<col style=\"width: 100px\">\n" + 
			"		<col style=\"width: 200px\">\n" + 
			"		</colgroup>\n" + 
			"		  <tr>\n" + 
			"		    <th class=\"tg-qbec\">문서명</th>\n" + 
			"		    <th class=\"tg-qbec\">기안자</th>\n" + 
			"		    <th class=\"tg-qbec\">결재자</th>\n" + 
			"		    <th class=\"tg-qbec\">문서기안일</th>\n" + 
			"		    <th class=\"tg-qbec\">결재일</th>\n" + 
			"		    <th class=\"tg-qbec\">상태</th>\n" + 
			"		    <th class=\"tg-qbec\">비고</th>\n" + 
			"		  </tr>";
	private String m1_end="</table>\n" + 
			"		</div>\n" +
			"	    </td>\n" + 
			"	  </tr>\n" + 
			"	  <tr>\n" + 
			"	    <td class=\"tg-aoc1\">자세한 내용은 <a href=\"_url_\" style=\"font-weight:bold;\"><U>농협 서버내 개인정보 검색 시스템</U></a> 에서 확인 바랍니다.</td>\n" + 
			"	  </tr>\n" + 
			"	</table>\n" + 
			"\n" + 
			"	</body>\n" + 
			"</html>\n" + 
			"";
	
	
	private String m2_header="<html>\n" + 
			"<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\n"+	
			"	<head>\n" + 
			"		<title>승인 반려</title>\n" + 
			"		<style type=\"text/css\">\n" + 
			"			.tg  {border-collapse:collapse;border-spacing:0;}\n" + 
			"			.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}\n" + 
			"			.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}\n" + 
			"			.tg .tg-qbec{font-weight:bold;background-color:#cccccc;border-color:inherit;text-align:center;vertical-align:top}\n" + 
			"			.tg .tg-fymr{border-color:inherit;text-align:left;vertical-align:top;word-wrap: break-word;}\n" + 
			"			.tg  {border-collapse:collapse;border-spacing:0;}\n" + 
			"			.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}\n" + 
			"			.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}\n" + 
			"			.tg .tg-aoc1{border-color:#006EB6;text-align:center;vertical-align:top}\n" + 
			"			.tg .tg-7qyp{border-color:#006EB6;text-align:left;vertical-align:top}\n" + 
			"           .center{text-align:center !important;}\n" + 
			"           .right{text-align:right !important;}\n" + 
			"		</style>\n" + 
			"	</head>\n" + 
			"	<body>\n" + 
			"	<table class=\"tg\" style=\"undefined;table-layout: fixed; width: 850px\">\n" + 
			"	<colgroup>\n" + 
			"	<col style=\"width: 850px\">\n" + 
			"	</colgroup>\n" + 
			"	  <tr>\n" + 
			"	    <th class=\"tg-aoc1\">_rname_(_sabun_) 님께 도착한</th>\n" + 
			"	  </tr>\n" + 
			"	  <tr>\n" + 
			"	    <td class=\"tg-aoc1\"><서버내 개인정보 검색 시스템> 결재 반려 건은 아래와 같습니다.</td>\n" + 
			"	  </tr>\n" + 
			"	  <tr>\n" + 
			"	    <td class=\"tg-7qyp\">\n" + 
			"		<div style=\"overflow:auto;\">" +
			"		<table class=\"tg\" style=\"undefined;table-layout: fixed; width: 983px\">\n" + 
			"		<colgroup>\n" + 
			"		<col style=\"width: 250px\">\n" + 
			"		<col style=\"width: 100px\">\n" + 
			"		<col style=\"width: 100px\">\n" + 
			"		<col style=\"width: 150px\">\n" + 
			"		<col style=\"width: 150px\">\n" + 
			"		<col style=\"width: 100px\">\n" + 
			"		<col style=\"width: 200px\">\n" + 
			"		</colgroup>\n" + 
			"		  <tr>\n" + 
			"		    <th class=\"tg-qbec\">문서명</th>\n" + 
			"		    <th class=\"tg-qbec\">기안자</th>\n" + 
			"		    <th class=\"tg-qbec\">결재자</th>\n" + 
			"		    <th class=\"tg-qbec\">문서기안일</th>\n" + 
			"		    <th class=\"tg-qbec\">결재일</th>\n" + 
			"		    <th class=\"tg-qbec\">상태</th>\n" + 
			"		    <th class=\"tg-qbec\">비고</th>\n" + 
			"		  </tr>"; 
	private String m2_end="		</table>\n" + 
			"		</div>\n" +
			"	    </td>\n" + 
			"	  </tr>\n" + 
			"	  <tr>\n" + 
			"	    <td class=\"tg-aoc1\">자세한 내용은 <a href=\"_url_\" style=\"font-weight:bold;\"><U>농협 서버내 개인정보 검색 시스템</U></a> 에서 확인 바랍니다.</td>\n" + 
			"	  </tr>\n" + 
			"	</table>\n" + 
			"\n" + 
			"	</body>\n" + 
			"</html>"; 
	
	
	private String m3_header="<html>\n" + 
			"	<head>\n" + 
			"<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\n"+			
			"		<title>승인 완료</title>\n" + 
			"		<style type=\"text/css\">\n" + 
			"			.tg  {border-collapse:collapse;border-spacing:0;}\n" + 
			"			.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}\n" + 
			"			.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}\n" + 
			"			.tg .tg-qbec{font-weight:bold;background-color:#cccccc;border-color:inherit;text-align:center;vertical-align:top}\n" + 
			"			.tg .tg-fymr{border-color:inherit;text-align:left;vertical-align:top;word-wrap: break-word;}\n" + 
			"			.tg  {border-collapse:collapse;border-spacing:0;}\n" + 
			"			.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}\n" + 
			"			.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}\n" + 
			"			.tg .tg-aoc1{border-color:#006EB6;text-align:center;vertical-align:top}\n" + 
			"			.tg .tg-7qyp{border-color:#006EB6;text-align:left;vertical-align:top}\n" + 
			"           .center{text-align:center !important;}\n" + 
			"           .right{text-align:right !important;}\n" + 
			"		</style>\n" + 
			"	</head>\n" + 
			"	<body>\n" + 
			"	<table class=\"tg\" style=\"undefined;table-layout: fixed; width: 850px\">\n" + 
			"	<colgroup>\n" + 
			"	<col style=\"width: 850px\">\n" + 
			"	</colgroup>\n" + 
			"	  <tr>\n" + 
			"	    <th class=\"tg-aoc1\">_rname_(_sabun_) 님께 도착한</th>\n" + 
			"	  </tr>\n" + 
			"	  <tr>\n" + 
			"	    <td class=\"tg-aoc1\"><서버내 개인정보 검색 시스템> 결재 완료 건은 아래와 같습니다.</td>\n" + 
			"	  </tr>\n" + 
			"	  <tr>\n" + 
			"	    <td class=\"tg-7qyp\">\n" + 
			"		<div style=\"overflow:auto;\">\n" + 
			"		<table class=\"tg\" style=\"undefined;table-layout: fixed; width: 983px\">\n" + 
			"		<colgroup>\n" + 
			"		<col style=\"width: 250px\">\n" + 
			"		<col style=\"width: 100px\">\n" + 
			"		<col style=\"width: 100px\">\n" + 
			"		<col style=\"width: 150px\">\n" + 
			"		<col style=\"width: 150px\">\n" + 
			"		<col style=\"width: 100px\">\n" + 
			"		<col style=\"width: 200px\">\n" + 
			"		</colgroup>\n" + 
			"		  <tr>\n" + 
			"		    <th class=\"tg-qbec\">문서명</th>\n" + 
			"		    <th class=\"tg-qbec\">기안자</th>\n" + 
			"		    <th class=\"tg-qbec\">결재자</th>\n" + 
			"		    <th class=\"tg-qbec\">문서기안일</th>\n" + 
			"		    <th class=\"tg-qbec\">결재일</th>\n" + 
			"		    <th class=\"tg-qbec\">상태</th>\n" + 
			"		    <th class=\"tg-qbec\">비고</th>\n" + 
			"		  </tr>"; 
	private String m3_end="		</table>\n" + 
			"   	</div>\n" + 
			"	    </td>\n" + 
			"	  </tr>\n" + 
			"	  <tr>\n" + 
			"	    <td class=\"tg-aoc1\">자세한 내용은 <a href=\"_url_\" style=\"font-weight:bold;\"><U>농협 서버내 개인정보 검색 시스템</U></a> 에서 확인 바랍니다.</td>\n" + 
			"	  </tr>\n" + 
			"	</table>\n" + 
			"\n" + 
			"	</body>\n" + 
			"</html>";
	
	private String m4_header="<html>\n" + 
			"	<head>\n" + 
			"<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\n"+			
			"		<title>담당자 변경 요청</title>\n" + 
			"		<style type=\"text/css\">\n" + 
			"			.tg  {border-collapse:collapse;border-spacing:0;}\n" + 
			"			.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}\n" + 
			"			.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}\n" + 
			"			.tg .tg-qbec{font-weight:bold;background-color:#cccccc;border-color:inherit;text-align:center;vertical-align:top}\n" + 
			"			.tg .tg-fymr{border-color:inherit;text-align:left;vertical-align:top;word-wrap: break-word;}\n" + 
			"			.tg  {border-collapse:collapse;border-spacing:0;}\n" + 
			"			.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}\n" + 
			"			.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}\n" + 
			"			.tg .tg-aoc1{border-color:#006EB6;text-align:center;vertical-align:top}\n" + 
			"			.tg .tg-7qyp{border-color:#006EB6;text-align:left;vertical-align:top}\n" + 
			"           .center{text-align:center !important;}\n" + 
			"           .right{text-align:right !important;}\n" + 
			"		</style>\n" + 
			"	</head>\n" + 
			"	<body>\n" + 
			"	<table class=\"tg\" style=\"undefined;table-layout: fixed; width: 850px\">\n" + 
			"	<colgroup>\n" + 
			"	<col style=\"width: 850px\">\n" + 
			"	</colgroup>\n" + 
			"	  <tr>\n" + 
			"	    <th class=\"tg-aoc1\">_rname_(_sabun_) 님께 도착한</th>\n" + 
			"	  </tr>\n" + 
			"	  <tr>\n" + 
			"	    <td class=\"tg-aoc1\"><서버내 개인정보 검색 시스템> 담당자 변경 승인 요청 건은 아래와 같습니다.</td>\n" + 
			"	  </tr>\n" + 
			"	  <tr>\n" + 
			"	    <td class=\"tg-7qyp\" >\n" + 
			"		<div style=\"overflow:auto;\">\n" + 
			"		<table class=\"tg\" style=\"undefined;table-layout: fixed; width: 983px\">\n" + 
			"		<colgroup>\n" + 
			"		<col style=\"width: 120px\">\n" + 
			"		<col style=\"width: 330px\">\n" + 
			"		<col style=\"width: 80px\">\n" + 
			"		<col style=\"width: 80px\">\n" + 
			"		<col style=\"width: 150px\">\n" + 
			"		<col style=\"width: 150px\">\n" + 
			"		<col style=\"width: 100px\">\n" + 
			"		<col style=\"width: 200px\">\n" + 
			"		</colgroup>\n" + 
			"		  <tr>\n" + 
			"		    <th class=\"tg-qbec\">호스트</th>\n" + 
			"		    <th class=\"tg-qbec\">경로</th>\n" + 
			"		    <th class=\"tg-qbec\">기안자</th>\n" + 
			"		    <th class=\"tg-qbec\">결재자</th>\n" + 
			"		    <th class=\"tg-qbec\">신청일</th>\n" + 
			"		    <th class=\"tg-qbec\">결재일</th>\n" + 
			"		    <th class=\"tg-qbec\">상태</th>\n" + 
			"		    <th class=\"tg-qbec\">비고</th>\n" + 
			"		  </tr>"; 
	private String m4_end="			</table>\n" + 
			"		</div>\n" + 
			"	    </td>\n" + 
			"	  </tr>\n" + 
			"	  <tr>\n" + 
			"	    <td class=\"tg-aoc1\">자세한 내용은 <a href=\"_url_\" style=\"font-weight:bold;\"><U>농협 서버내 개인정보 검색 시스템</U></a> 에서 확인 바랍니다.</td>\n" + 
			"	  </tr>\n" + 
			"	</table>\n" +
			"\n" + 
			"	</body>\n" + 
			"</html>";
	
	
	private String m5_header="<html>\n" + 
			"	<head>\n" + 
			"<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\n"+			
			"		<title>담당자 변경 반려</title>\n" + 
			"		<style type=\"text/css\">\n" + 
			"			.tg  {border-collapse:collapse;border-spacing:0;}\n" + 
			"			.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}\n" + 
			"			.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}\n" + 
			"			.tg .tg-qbec{font-weight:bold;background-color:#cccccc;border-color:inherit;text-align:center;vertical-align:top}\n" + 
			"			.tg .tg-fymr{border-color:inherit;text-align:left;vertical-align:top;word-wrap: break-word;}\n" + 
			"			.tg  {border-collapse:collapse;border-spacing:0;}\n" + 
			"			.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}\n" + 
			"			.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}\n" + 
			"			.tg .tg-aoc1{border-color:#006EB6;text-align:center;vertical-align:top}\n" + 
			"			.tg .tg-7qyp{border-color:#006EB6;text-align:left;vertical-align:top}\n" + 
			"           .center{text-align:center !important;}\n" + 
			"           .right{text-align:right !important;}\n" + 
			"		</style>\n" + 
			"	</head>\n" + 
			"	<body>\n" + 
			"	<table class=\"tg\" style=\"undefined;table-layout: fixed; width: 850px\">\n" + 
			"	<colgroup>\n" + 
			"	<col style=\"width: 850px\">\n" + 
			"	</colgroup>\n" + 
			"	  <tr>\n" + 
			"	    <th class=\"tg-aoc1\">_rname_(_sabun_) 님께 도착한</th>\n" + 
			"	  </tr>\n" + 
			"	  <tr>\n" + 
			"	    <td class=\"tg-aoc1\"><서버내 개인정보 검색 시스템> 담당자 변경 승인 반려 건은 아래와 같습니다.</td>\n" + 
			"	  </tr>\n" + 
			"	  <tr>\n" + 
			"	    <td class=\"tg-7qyp\">\n" + 
			"		<div style=\"overflow:auto;\">\n" +
			"		<table class=\"tg\" style=\"undefined;table-layout: fixed; width: 983px\">\n" + 
			"		<colgroup>\n" + 
			"		<col style=\"width: 120px\">\n" + 
			"		<col style=\"width: 330px\">\n" + 
			"		<col style=\"width: 80px\">\n" + 
			"		<col style=\"width: 80px\">\n" + 
			"		<col style=\"width: 150px\">\n" + 
			"		<col style=\"width: 150px\">\n" + 
			"		<col style=\"width: 100px\">\n" + 
			"		<col style=\"width: 200px\">\n" + 
			"		</colgroup>\n" + 
			"		  <tr>\n" + 
			"		    <th class=\"tg-qbec\">호스트</th>\n" + 
			"		    <th class=\"tg-qbec\">경로</th>\n" + 
			"		    <th class=\"tg-qbec\">기안자</th>\n" + 
			"		    <th class=\"tg-qbec\">결재자</th>\n" + 
			"		    <th class=\"tg-qbec\">신청일</th>\n" + 
			"		    <th class=\"tg-qbec\">결재일</th>\n" + 
			"		    <th class=\"tg-qbec\">상태</th>\n" + 
			"		    <th class=\"tg-qbec\">비고</th>\n" + 
			"		  </tr>"; 
	private String m5_end="		</table>\n" + 
			"		</div>\n" + 
			"	    </td>\n" + 
			"	  </tr>\n" + 
			"	  <tr>\n" + 
			"	    <td class=\"tg-aoc1\">자세한 내용은 <a href=\"_url_\" style=\"font-weight:bold;\"><U>농협 서버내 개인정보 검색 시스템</U></a> 에서 확인 바랍니다.</td>\n" + 
			"	  </tr>\n" + 
			"	</table>\n" + 
			"\n" + 
			"	</body>\n" + 
			"</html>\n" + 
			"";
	
	
	private String m6_header="<html>\n" + 
			"	<head>\n" + 
			"<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\n"+			
			"		<title>담당자 변경 완료</title>\n" + 
			"		<style type=\"text/css\">\n" + 
			"			.tg  {border-collapse:collapse;border-spacing:0;}\n" + 
			"			.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}\n" + 
			"			.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}\n" + 
			"			.tg .tg-qbec{font-weight:bold;background-color:#cccccc;border-color:inherit;text-align:center;vertical-align:top}\n" + 
			"			.tg .tg-fymr{border-color:inherit;text-align:left;vertical-align:top; word-wrap: break-word;}\n" + 
			"			.tg  {border-collapse:collapse;border-spacing:0;}\n" + 
			"			.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}\n" + 
			"			.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}\n" + 
			"			.tg .tg-aoc1{border-color:#006EB6;text-align:center;vertical-align:top}\n" + 
			"			.tg .tg-7qyp{border-color:#006EB6;text-align:left;vertical-align:top}\n" + 
			"           .center{text-align:center !important;}\n" + 
			"           .right{text-align:right !important;}\n" + 
			"		</style>\n" + 
			"	</head>\n" + 
			"	<body>\n" + 
			"	<table class=\"tg\" style=\"undefined;table-layout: fixed; width: 850px\">\n" + 
			"	<colgroup>\n" + 
			"	<col style=\"width: 850px\">\n" + 
			"	</colgroup>\n" + 
			"	  <tr>\n" + 
			"	    <th class=\"tg-aoc1\">_rname_(_sabun_) 님께 도착한</th>\n" + 
			"	  </tr>\n" + 
			"	  <tr>\n" + 
			"	    <td class=\"tg-aoc1\"><서버내 개인정보 검색 시스템> 담당자 변경 승인 완료 건은 아래와 같습니다.</td>\n" + 
			"	  </tr>\n" + 
			"	  <tr>\n" + 
			"	    <td class=\"tg-7qyp\">\n" + 
			" 		<div style=\"overflow:auto;\">\n" +
			"		<table class=\"tg\" style=\"undefined;table-layout: fixed; width: 983px\">\n" + 
			"		<colgroup>\n" + 
			"		<col style=\"width: 120px\">\n" + 
			"		<col style=\"width: 300px\">\n" + 
			"		<col style=\"width: 80px\">\n" + 
			"		<col style=\"width: 80px\">\n" + 
			"		<col style=\"width: 150px\">\n" + 
			"		<col style=\"width: 150px\">\n" + 
			"		<col style=\"width: 100px\">\n" + 
			"		<col style=\"width: 200px\">\n" + 
			"		</colgroup>\n" + 
			"		  <tr>\n" + 
			"		    <th class=\"tg-qbec\">호스트</th>\n" + 
			"		    <th class=\"tg-qbec\">경로</th>\n" + 
			"		    <th class=\"tg-qbec\">기안자</th>\n" + 
			"		    <th class=\"tg-qbec\">결재자</th>\n" + 
			"		    <th class=\"tg-qbec\">신청일</th>\n" + 
			"		    <th class=\"tg-qbec\">결재일</th>\n" + 
			"		    <th class=\"tg-qbec\">상태</th>\n" + 
			"		    <th class=\"tg-qbec\">비고</th>\n" + 
			"		  </tr>"; 
	private String m6_end="		</table>\n" + 
			" 		</div>\n" +
			"	    </td>\n" + 
			"	  </tr>\n" + 
			"	  <tr>\n" + 
			"	    <td class=\"tg-aoc1\">자세한 내용은 <a href=\"_url_\" style=\"font-weight:bold;\"><U>농협 서버내 개인정보 검색 시스템</U></a> 에서 확인 바랍니다.</td>\n" + 
			"	  </tr>\n" + 
			"	</table>\n" + 
			"\n" + 
			"	</body>\n" + 
			"</html>\n" + 
			"";
	

	private String m7_header="<html>\n" + 
			"	<head>\n" + 
			"<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\n"+			
			"<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\n" + 
			"		<title>검색 결과 알람</title>\n" + 
			"		<style type=\"text/css\">\n" + 
			"			.tg  {border-collapse:collapse;border-spacing:0;}\n" + 
			"			.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}\n" + 
			"			.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}\n" + 
			"			.tg .tg-qbec{font-weight:bold;background-color:#cccccc;border-color:inherit;text-align:center;vertical-align:top}\n" + 
			"			.tg .tg-fymr{border-color:inherit;text-align:left;vertical-align:top;word-wrap: break-word;}\n" + 
			"			.tg  {border-collapse:collapse;border-spacing:0;}\n" + 
			"			.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}\n" + 
			"			.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}\n" + 
			"			.tg .tg-aoc1{border-color:#006EB6;text-align:center;vertical-align:top}\n" + 
			"			.tg .tg-7qyp{border-color:#006EB6;text-align:left;vertical-align:top}\n" + 
			"           .center{text-align:center !important;}\n" + 
			"           .right{text-align:right !important;}\n" + 
			"		</style>\n" + 
			"	</head>\n" + 
			"	<body>\n" + 
			"	<table class=\"tg\" style=\"undefined;table-layout: fixed; width: 850px; h\">\n" + 
			"	<colgroup>\n" + 
			"	<col style=\"width: 850px\">\n" + 
			"	</colgroup>\n" + 
			"	  <tr>\n" + 
			"	    <th class=\"tg-aoc1\">_rname_(_sabun_) 님께 도착한</th>\n" + 
			"	  </tr>\n" + 
			"	  <tr>\n" + 
			"	    <td class=\"tg-aoc1\"><서버내 개인정보 검색 시스템> 검출 결과 건은 아래와 같습니다.</td>\n" + 
			"	  </tr>\n" + 
			"	  <tr>\n" + 
			"	    <td class=\"tg-7qyp\">\n" + 
			"		<div style=\"overflow:auto;\">\n" +
			"		<table class=\"tg\" style=\"undefined;table-layout: fixed; width: 983px\">\n" + 
			"		<colgroup>\n" + 
			"		<col style=\"width: 120px\">\n" + 
			"		<col style=\"width: 320px\">\n" + 
			"		<col style=\"width: 100px\">\n" + 
			"		<col style=\"width: 80px\">\n" + 
			"		<col style=\"width: 110px\">\n" + 
			"		<col style=\"width: 80px\">\n" + 
			"		<col style=\"width: 80px\">\n" +
			"		<col style=\"width: 80px\">\n" +
			"		<col style=\"width: 80px\">\n" +			
			"		<col style=\"width: 120px\">\n" + 
			"		<col style=\"width: 200px\">\n" + 
			"		</colgroup>\n" + 
			"		  <tr>\n" + 
			"		    <th class=\"tg-qbec\">호스트</th>\n" + 
			"		    <th class=\"tg-qbec\">경로</th>\n" + 
			"		    <th class=\"tg-qbec\">소유자</th>\n" + 
			"		    <th class=\"tg-qbec\">주민번호</th>\n" + 		
			"		    <th class=\"tg-qbec\">외국인번호</th>\n" +
			"		    <th class=\"tg-qbec\">여권번호</th>\n" +
			"		    <th class=\"tg-qbec\">운전번호</th>\n" +
			"		    <th class=\"tg-qbec\">계좌번호</th>\n" +
			"		    <th class=\"tg-qbec\">카드번호</th>\n" +
			"		    <th class=\"tg-qbec\">전화번호</th>\n" +
			"		    <th class=\"tg-qbec\">합계</th>\n" + 
			"		    <th class=\"tg-qbec\">처리상태</th>\n" + 
			"		  </tr>"; 
	private String m7_end="		</table>\n" + 
			"		</div>\n" +
			"	    </td>\n" + 
			"	  </tr>\n" + 
			"	  <tr>\n" + 
			"	    <td class=\"tg-aoc1\">자세한 내용은 <a href=\"_url_\" style=\"font-weight:bold;\"><U>농협 서버내 개인정보 검색 시스템</U></a> 에서 확인 바랍니다.</td>\n" + 
			"	  </tr>\n" + 
			"	</table>\n" + 
			"\n" + 
			"	</body>\n" + 
			"</html>\n" + 
			"";

	
	private String m8_header="<html>\n" + 
			"           <head>\n" + 
			"                     <title>접속 오류</title>\n" + 
			"                     <style type=\"text/css\">\n" + 
			"                                .tg  {border-collapse:collapse;border-spacing:0;}\n" + 
			"                                .tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}\n" + 
			"                                .tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}\n" + 
			"                                .tg .tg-qbec{font-weight:bold;background-color:#cccccc;border-color:inherit;text-align:center;vertical-align:top}\n" + 
			"                                .tg .tg-fymr{border-color:inherit;text-align:left;vertical-align:top;word-wrap: break-word;}\n" + 
			"                                .tg  {border-collapse:collapse;border-spacing:0;}\n" + 
			"                                .tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}\n" + 
			"                                .tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}\n" + 
			"                                .tg .tg-aoc1{border-color:#006EB6;text-align:center;vertical-align:top}\n" + 
			"                                .tg .tg-7qyp{border-color:#006EB6;text-align:left;vertical-align:top}\n" + 
			"                                .center{text-align:center !important;}\n" + 
			"                                .right{text-align:right !important;}\n" + 
			"                     </style>\n" + 
			"           </head>\n" + 
			"           <body>\n" + 
			"           <table class=\"tg\" style=\"undefined;table-layout: fixed; width: 850px\">\n" + 
			"           <colgroup>\n" + 
			"           <col style=\"width: 850px\">\n" + 
			"           </colgroup>\n" + 
			"             <tr>\n" + 
			"	   			 <th class=\"tg-aoc1\">_rname_(_sabun_) 님께 도착한</th>\n" + 
			"             </tr>\n" + 
			"             <tr>\n" + 
			"               <td class=\"tg-aoc1\"><서버내 개인정보 검색 시스템> 접속 오류 건은 아래와 같습니다.</td>\n" + 
			"             </tr>\n" + 
			"             <tr>\n" + 
			"               <td class=\"tg-7qyp\">\n" + 
			"					<div style=\"overflow:auto;\">\n" +
			"                     <table class=\"tg\" style=\"undefined;table-layout: fixed; width: 100%\">\n" + 
			"                     <colgroup>\n" + 
			"                     <col style=\"width: 50%\">\n" + 
			"                     <col style=\"width: 50%\">\n" + 
			"                     </colgroup>\n" + 
			"                       <tr>\n" + 
			"                         <th class=\"tg-qbec\">호스트명</th>\n" + 
			"                         <th class=\"tg-qbec\">IP</th>\n" + 
			"                       </tr>";
	private String m8_end="                    </table>\n" + 
			"               </td>\n" + 
			"             </tr>\n" + 
			"             <tr>\n" + 
			"	    			<td class=\"tg-aoc1\" >자세한 내용은 <a href=\"_url_\" style=\"font-weight:bold;\"><U>농협 서버내 개인정보 검색 시스템</U></a> 에서 확인 바랍니다.</td>\n" + 
			"             </tr>\n" + 
			"           </table>\n" + 
			"			</div>" +
			"           </body>\n" + 
			"\n" + 
			"</html>";
	
	public MailForm() {
		
	}


	public String get_header(int i) {
		if( i==1) {
			return m1_header;	
		}else if(i ==2) {
			return m2_header;
		}else if(i ==3) {
			return m3_header;
		}else if(i ==4) {
			return m4_header;
		}else if(i ==5) {
			return m5_header;
		}else if(i ==6) {
			return m6_header;
		}else if(i ==7) {
			return m7_header;
		}else if(i ==8) {
			return m8_header;
		}
		return " ";
		
	}


	public String get_end(int i) {
		String sret="";
		if( i==1) {
			sret= m1_end;	
		}else if(i ==2) {
			sret= m2_end;
		}else if(i ==3) {
			sret= m3_end;
		}else if(i ==4) {
			sret= m4_end;
		}else if(i ==5) {
			sret= m5_end;
		}else if(i ==6) {
			sret= m6_end;
		}else if(i ==7) {
			sret= m7_end;
		}else if(i ==8) {
			sret= m8_end;
		}
		
		sret=sret.replaceAll("_url_",AppConfig.getProperty("config.email.linkurl"));
		
		return sret;
		
	}


}
