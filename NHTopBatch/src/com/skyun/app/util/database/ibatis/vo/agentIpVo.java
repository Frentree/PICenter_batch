package com.skyun.app.util.database.ibatis.vo;

public class agentIpVo {
	private String ip;
	private String target_id;
	private int ap_no;
	private int net_id;
	private String type;
	
	public agentIpVo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "agentIpVo [ip=" + ip + ", target_id=" + target_id + ", ap_no=" + ap_no + "]";
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
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

	public int getNet_id() {
		return net_id;
	}

	public void setNet_id(int net_id) {
		this.net_id = net_id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
