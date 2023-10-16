package com.skyun.app.util.database.ibatis.vo;

public class updateUserVo {
	private String UPDATE_USER_NO;
	private String UPDATE_USER_NM;
	private String target_id;
	private int ap_no;
	private String service_nm;
	private String SOSOK;
	private String REGDATE;
	private String EMAIL;
	
	private String REQUEST_DATE;
	private String APPROVAL_STATUS;
	
	private String SERVICE_NM;
	private String ACTION_DATE;
	
	public String getUPDATE_USER_NO() {
		return UPDATE_USER_NO;
	}
	public void setUPDATE_USER_NO(String uPDATE_USER_NO) {
		UPDATE_USER_NO = uPDATE_USER_NO;
	}
	public String getUPDATE_USER_NM() {
		return UPDATE_USER_NM;
	}
	public void setUPDATE_USER_NM(String uPDATE_USER_NM) {
		UPDATE_USER_NM = uPDATE_USER_NM;
	}
	public String getTarget_id() {
		return target_id;
	}
	public void setTarget_id(String target_id) {
		this.target_id = target_id;
	}
	public int getAp_no() {
		return ap_no;
	}
	public void setAp_no(int ap_no) {
		this.ap_no = ap_no;
	}
	public String getService_nm() {
		return service_nm;
	}
	public void setService_nm(String service_nm) {
		this.service_nm = service_nm;
	}
	public String getSOSOK() {
		return SOSOK;
	}
	public void setSOSOK(String sOSOK) {
		SOSOK = sOSOK;
	}
	public String getREGDATE() {
		return REGDATE;
	}
	public void setREGDATE(String rEGDATE) {
		REGDATE = rEGDATE;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getREQUEST_DATE() {
		return REQUEST_DATE;
	}
	public void setREQUEST_DATE(String rEQUEST_DATE) {
		REQUEST_DATE = rEQUEST_DATE;
	}
	public String getAPPROVAL_STATUS() {
		return APPROVAL_STATUS;
	}
	public void setAPPROVAL_STATUS(String aPPROVAL_STATUS) {
		APPROVAL_STATUS = aPPROVAL_STATUS;
	}
	public String getSERVICE_NM() {
		return SERVICE_NM;
	}
	public void setSERVICE_NM(String sERVICE_NM) {
		SERVICE_NM = sERVICE_NM;
	}
	public String getACTION_DATE() {
		return ACTION_DATE;
	}
	public void setACTION_DATE(String aCTION_DATE) {
		ACTION_DATE = aCTION_DATE;
	}
	
}
