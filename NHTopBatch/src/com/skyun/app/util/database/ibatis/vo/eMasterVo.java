package com.skyun.app.util.database.ibatis.vo;

public class eMasterVo {
	private String receiver;
	private String receiver_name;
	private String sender;
	private String sender_name;
	private int path_cnt;
	
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getReceiver_name() {
		return receiver_name;
	}
	public void setReceiver_name(String receiver_name) {
		this.receiver_name = receiver_name;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getSender_name() {
		return sender_name;
	}
	public void setSender_name(String sender_name) {
		this.sender_name = sender_name;
	}
	public int getPath_cnt() {
		return path_cnt;
	}
	public void setPath_cnt(int path_cnt) {
		this.path_cnt = path_cnt;
	}
	
}
