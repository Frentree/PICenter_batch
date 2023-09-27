package com.skyun.app.util.database.ibatis.vo;

public class piFindDataVo {
	
	private String TARGET_ID;
	private int AP_NO;
	private String REGDATE;
	private long PATH_CNT = 0;
	private String DATA_CNT;
	private long TOTAL;
	
	public String getTARGET_ID() {
		return TARGET_ID;
	}
	public void setTARGET_ID(String tARGET_ID) {
		TARGET_ID = tARGET_ID;
	}
	public int getAP_NO() {
		return AP_NO;
	}
	public void setAP_NO(int aP_NO) {
		AP_NO = aP_NO;
	}
	public String getREGDATE() {
		return REGDATE;
	}
	public void setREGDATE(String rEGDATE) {
		REGDATE = rEGDATE;
	}
	public long getPATH_CNT() {
		return PATH_CNT;
	}
	public void setPATH_CNT(long pATH_CNT) {
		PATH_CNT = pATH_CNT;
	}
	public String getDATA_CNT() {
		return DATA_CNT;
	}
	public void setDATA_CNT(String dATA_CNT) {
		DATA_CNT = dATA_CNT;
	}
	public long getTOTAL() {
		return TOTAL;
	}
	public void setTOTAL(long tOTAL) {
		TOTAL = tOTAL;
	}
	@Override
	public String toString() {
		return "piFindDataVo [TARGET_ID=" + TARGET_ID + ", AP_NO=" + AP_NO + ", REGDATE=" + REGDATE + ", PATH_CNT="
				+ PATH_CNT + ", DATA_CNT=" + DATA_CNT + ", TOTAL=" + TOTAL + "]";
	}
	
}
