package com.skyun.app.util.database.ibatis.vo;

public class eDetail1Vo {
	private String PATH;
	private String REQ_USER_NAME;
	private String OK_USER_NAME;
	private String REGDATE; 
	private String OKDATE;
	private String STATUS_NAME;
	private String REASON;
	
	public String getPATH() {
		return PATH;
	}
	public void setPATH(String pATH) {
		PATH = pATH;
	}
	public String getREQ_USER_NAME() {
		return REQ_USER_NAME;
	}
	public void setREQ_USER_NAME(String rEQ_USER_NAME) {
		REQ_USER_NAME = rEQ_USER_NAME;
	}
	public String getOK_USER_NAME() {
		return OK_USER_NAME;
	}
	public void setOK_USER_NAME(String oK_USER_NAME) {
		OK_USER_NAME = oK_USER_NAME;
	}
	public String getREGDATE() {
		return REGDATE;
	}
	public void setREGDATE(String rEGDATE) {
		REGDATE = rEGDATE;
	}
	public String getOKDATE() {
		if(OKDATE == null) OKDATE= " ";
		return OKDATE;
	}
	public void setOKDATE(String oKDATE) {
		OKDATE = oKDATE;
	}
	public String getSTATUS_NAME() {
		return STATUS_NAME;
	}
	public void setSTATUS_NAME(String sTATUS_NAME) {
		STATUS_NAME = sTATUS_NAME;
	}
	public String getREASON() {
		return REASON;
	}
	public void setREASON(String rEASON) {
		REASON = rEASON;
	}

}
