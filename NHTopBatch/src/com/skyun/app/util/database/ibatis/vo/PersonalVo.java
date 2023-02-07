package com.skyun.app.util.database.ibatis.vo;

public class PersonalVo {
	private String target_id;
	private int ap_no;
	private long path_cnt = 0;
	private long rrn = 0;
	private long foreigner = 0;
	private long driver = 0;
	private long passport = 0;
	private long account_num = 0;
	private long card_num = 0;
	private long phone = 0;
	private long phone_num = 0;
	private long mobile_phone = 0;
	private long new_rrn = 0;
	private long email = 0;
	private long carnum = 0;
	private long vehicleid = 0;
	private long total = 0;

	private String regdate;

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

	public long getPath_cnt() {
		return path_cnt;
	}

	public void setPath_cnt(long path_cnt) {
		this.path_cnt = path_cnt;
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

	public long getTotal() {
		total = rrn + foreigner + driver + passport + account_num + card_num + phone + phone_num + mobile_phone
				+ new_rrn + email + carnum + vehicleid;
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public long getPhone_num() {
		return phone_num;
	}

	public void setPhone_num(long phone_num) {
		this.phone_num = phone_num;
	}

	public long getMobile_phone() {
		return mobile_phone;
	}

	public void setMobile_phone(long mobile_phone) {
		this.mobile_phone = mobile_phone;
	}

	public long getNew_rrn() {
		return new_rrn;
	}

	public void setNew_rrn(long new_rrn) {
		this.new_rrn = new_rrn;
	}

	public long getEmail() {
		return email;
	}

	public void setEmail(long email) {
		this.email = email;
	}

	public long getCarnum() {
		return carnum;
	}

	public void setCarnum(long carnum) {
		this.carnum = carnum;
	}

	public long getVehicleid() {
		return vehicleid;
	}

	public void setVehicleid(long vehicleid) {
		this.vehicleid = vehicleid;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

}
