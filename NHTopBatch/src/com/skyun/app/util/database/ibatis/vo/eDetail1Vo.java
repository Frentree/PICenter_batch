package com.skyun.app.util.database.ibatis.vo;

public class eDetail1Vo {
	private String DOC_NAME;
	private String APPROVAL_STATUS;
	private String OK_USER_NO;
	private String USER_NAME; 
	private String TEAM_NAME;
	
	@Override
	public String toString() {
		return "eDetail1Vo [DOC_NAME=" + DOC_NAME + ", APPROVAL_STATUS=" + APPROVAL_STATUS + ", OK_USER_NO="
				+ OK_USER_NO + ", USER_NAME=" + USER_NAME + ", TEAM_NAME=" + TEAM_NAME + "]";
	}
	public String getDOC_NAME() {
		return DOC_NAME;
	}
	public void setDOC_NAME(String dOC_NAME) {
		DOC_NAME = dOC_NAME;
	}
	public String getAPPROVAL_STATUS() {
		return APPROVAL_STATUS;
	}
	public void setAPPROVAL_STATUS(String aPPROVAL_STATUS) {
		APPROVAL_STATUS = aPPROVAL_STATUS;
	}
	public String getOK_USER_NO() {
		return OK_USER_NO;
	}
	public void setOK_USER_NO(String oK_USER_NO) {
		OK_USER_NO = oK_USER_NO;
	}
	public String getUSER_NAME() {
		return USER_NAME;
	}
	public void setUSER_NAME(String uSER_NAME) {
		USER_NAME = uSER_NAME;
	}
	public String getTEAM_NAME() {
		return TEAM_NAME;
	}
	public void setTEAM_NAME(String tEAM_NAME) {
		TEAM_NAME = tEAM_NAME;
	}
	
}
