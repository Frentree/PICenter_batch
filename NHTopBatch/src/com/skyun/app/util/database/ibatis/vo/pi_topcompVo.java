package com.skyun.app.util.database.ibatis.vo;

public class pi_topcompVo {
	
	private String target_id;
	private String regdate;
	private long rrn=0;
	private long rrn_pre=0;
	private long foreigner=0;
	private long foreigner_pre=0;
	private long driver=0;
	private long driver_pre=0;
	private long passport=0;
	private long passport_pre=0;
	private long account_num=0;
	private long account_num_pre=0;
	private long card_num=0;
	private long card_num_pre=0;
	private long total=0;
	private long total_pre=0;
	private long total_gap=0;
	
	
	public pi_topcompVo() {
		
	}
	
	public void setPersol(PersonalVo v) {
		this.target_id=v.getTarget_id();
		this.rrn=v.getRrn();
		this.foreigner=v.getForeigner();
		this.driver=v.getDriver();
		this.passport=v.getForeigner();
		this.card_num=v.getCard_num();
		this.account_num=v.getAccount_num();
		this.total=v.getTotal();
	}

	public String getTarget_id() {
		return target_id;
	}

	public void setTarget_id(String target_id) {
		this.target_id = target_id;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public long getRrn() {
		return rrn;
	}

	public void setRrn(long rrn) {
		this.rrn = rrn;
	}

	public long getRrn_pre() {
		return rrn_pre;
	}

	public void setRrn_pre(long rrn_pre) {
		this.rrn_pre = rrn_pre;
	}

	public long getForeigner() {
		return foreigner;
	}

	public void setForeigner(long foreigner) {
		this.foreigner = foreigner;
	}

	public long getForeigner_pre() {
		return foreigner_pre;
	}

	public void setForeigner_pre(long foreigner_pre) {
		this.foreigner_pre = foreigner_pre;
	}

	public long getDriver() {
		return driver;
	}

	public void setDriver(long driver) {
		this.driver = driver;
	}

	public long getDriver_pre() {
		return driver_pre;
	}

	public void setDriver_pre(long driver_pre) {
		this.driver_pre = driver_pre;
	}

	public long getPassport() {
		return passport;
	}

	public void setPassport(long passport) {
		this.passport = passport;
	}

	public long getPassport_pre() {
		return passport_pre;
	}

	public void setPassport_pre(long passport_pre) {
		this.passport_pre = passport_pre;
	}

	public long getAccount_num() {
		return account_num;
	}

	public void setAccount_num(long account_num) {
		this.account_num = account_num;
	}

	public long getAccount_num_pre() {
		return account_num_pre;
	}

	public void setAccount_num_pre(long account_num_pre) {
		this.account_num_pre = account_num_pre;
	}

	public long getCard_num() {
		return card_num;
	}

	public void setCard_num(long card_num) {
		this.card_num = card_num;
	}

	public long getCard_num_pre() {
		return card_num_pre;
	}

	public void setCard_num_pre(long card_num_pre) {
		this.card_num_pre = card_num_pre;
	}

	public long getTotal() {
		total=rrn+foreigner+driver+passport+account_num+card_num;
		return total;
	}
	public long getTotal1() {
		return total;
	}


	public void setTotal(long total) {
		this.total = total;
	}

	public long getTotal_pre() {
		return total_pre;
	}

	public void setTotal_pre(long total_pre) {
		this.total_pre = total_pre;
	}

	public long getTotal_gap() {
		return total_gap;
	}

	public void setTotal_gap(long total_gap) {
		this.total_gap = total_gap;
	}
	
	
	
	
	

}
