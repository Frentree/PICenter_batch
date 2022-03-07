package com.skyun.app.util.database.ibatis.vo;

import java.sql.Date;

public class agentIpVo {
	private String ip;
	private String type;
	private String type_name;
	private String type_class;
	private String mask;
	private String mask_ip;
	private Date regdate;
	
	public agentIpVo() {
		// TODO Auto-generated constructor stub
	}

	public agentIpVo(String ip, String type, String type_name, String type_class, String mask, String mask_ip,
			Date regdate) {
		super();
		this.ip = ip;
		this.type = type;
		this.type_name = type_name;
		this.type_class = type_class;
		this.mask = mask;
		this.mask_ip = mask_ip;
		this.regdate = regdate;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType_name() {
		return type_name;
	}

	public void setType_name(String type_name) {
		this.type_name = type_name;
	}

	public String getType_class() {
		return type_class;
	}

	public void setType_class(String type_class) {
		this.type_class = type_class;
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

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
}
