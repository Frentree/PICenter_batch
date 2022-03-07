package com.skyun.app.util.database.ibatis.vo;

public class NetTargetVo {
	private String type;
	private String target_id;
	private int ap_no;
	
	public NetTargetVo() {
		// TODO Auto-generated constructor stub
	}
	
	public NetTargetVo(String type, String target_id, int ap_no) {
		super();
		this.type = type;
		this.target_id = target_id;
		this.ap_no = ap_no;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
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



	@Override
	public String toString() {
		return "netTargetVo [type=" + type + ", target_id=" + target_id + ", ap_no=" + ap_no + "]";
	}

}
