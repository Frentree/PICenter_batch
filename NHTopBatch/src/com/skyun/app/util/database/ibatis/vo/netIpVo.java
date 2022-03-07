package com.skyun.app.util.database.ibatis.vo;

public class netIpVo {
	private String type;
	private String ip;
	private String mask;
	private String mask_ip;
	
	public netIpVo() {
		// TODO Auto-generated constructor stub
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMask() {
		return mask;
	}

	public void setMask(String mask) {
		this.mask = mask;
	}

	public String getMask_ip() {
		return mask_ip;
	}

	public void setMask_ip(String mask_ip) {
		this.mask_ip = mask_ip;
	}

	@Override
	public String toString() {
		return "netIpVo [type=" + type + ", ip=" + ip + ", mask=" + mask + ", mask_ip=" + mask_ip + "]";
	}

}
