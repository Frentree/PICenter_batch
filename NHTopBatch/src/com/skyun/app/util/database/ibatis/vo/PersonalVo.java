package com.skyun.app.util.database.ibatis.vo;

public class PersonalVo {
	private String target_id;
	private long rrn=0;
	private long foreigner=0;
	private long driver=0;
	private long passport=0;
	private long account_num=0;
	private long card_num=0;
	private long phone=0;
	private long meritz_acc=0;
	private long total=0;
	
	
	public String getTarget_id() {
		return target_id;
	}
	public void setTarget_id(String target_id) {
		this.target_id = target_id;
	}
	public long getRrn() {
		return rrn;
	}
	public void setRrn(long rrn) {
		this.rrn = rrn;
	}
	public long getForeigner() {
		return foreigner;
	}
	public void setForeigner(long foreigner) {
		this.foreigner = foreigner;
	}
	public long getDriver() {
		return driver;
	}
	public void setDriver(long driver) {
		this.driver = driver;
	}
	public long getPassport() {
		return passport;
	}
	public void setPassport(long passport) {
		this.passport = passport;
	}
	public long getAccount_num() {
		return account_num;
	}
	public void setAccount_num(long account_num) {
		this.account_num = account_num;
	}
	public long getCard_num() {
		return card_num;
	}
	public void setCard_num(long card_num) {
		this.card_num = card_num;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public long getMeritz_acc() {
		return meritz_acc;
	}
	public void setMeritz_acc(long meritz_acc) {
		this.meritz_acc = meritz_acc;
	}
	public long getTotal() {
		//total=rrn+foreigner+driver+passport+account_num+card_num;
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	
	

}
