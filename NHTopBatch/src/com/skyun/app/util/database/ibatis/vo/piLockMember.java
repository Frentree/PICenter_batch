package com.skyun.app.util.database.ibatis.vo;

import java.sql.Date;

public class piLockMember {
	private String user_no;
	private String user_name;
	private String user_phone;
	private Date lock_date;
	private Date loginDate;
	public String getUser_no() {
		return user_no;
	}
	public void setUser_no(String user_no) {
		this.user_no = user_no;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public Date getLock_date() {
		return lock_date;
	}
	public void setLock_date(Date lock_date) {
		this.lock_date = lock_date;
	}
	public Date getLoginDate() {
		return loginDate;
	}
	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}
	
}
