package com.skyun.app.util.database.ibatis.vo;

public class pi_statisticsVo {
	
	private String target_id;
	private String host_name;
	private String regdate;
	private long path_cnt=0;
	private long rrn=0;
	private long foreigner=0;
	private long driver=0;
	private long passport=0;
	private long account_num=0;
	private long card_num=0;
	private long phone=0;
	private long phone_num=0;
	private long mobile_phone=0;
	private long new_rrn=0;
	private long email=0;
	private long car_num=0;
	private long vehicleid=0;
	private long total=0;
	private long total_gap=0;

	
	public pi_statisticsVo() {
		
	}
	
	public void setPersol(PersonalVo v) {
		this.target_id=v.getTarget_id();
		this.path_cnt=v.getPath_cnt();
		this.rrn=v.getRrn();
		this.foreigner=v.getForeigner();
		this.driver=v.getDriver();
		this.passport=v.getPassport();
		this.card_num=v.getCard_num();
		this.account_num=v.getAccount_num();
		this.phone=v.getPhone();
		this.phone_num=v.getPhone_num();
		this.mobile_phone=v.getMobile_phone();
		this.new_rrn=v.getNew_rrn();
		this.email=v.getEmail();
		this.car_num=v.getCarnum();
		this.vehicleid=v.getVehicleid();
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
		//total=rrn+foreigner+driver+passport+account_num+card_num;
		return total;
	}
	public long getTotal1() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public long getTotal_gap() {
		return total_gap;
	}

	public void setTotal_gap(long total_gap) {
		this.total_gap = total_gap;
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
		return car_num;
	}

	public void setCarnum(long carnum) {
		this.car_num = carnum;
	}

	public long getVehicleid() {
		return vehicleid;
	}

	public void setVehicleid(long vehicleid) {
		this.vehicleid = vehicleid;
	}
	
	public String getHost_name() {
		return host_name;
	}

	public void setHost_name(String host_name) {
		this.host_name = host_name;
	}

	@Override
	public String toString() {
		return "pi_statisticsVo [target_id=" + target_id + ", host_name=" + host_name + ", regdate=" + regdate
				+ ", path_cnt=" + path_cnt + ", rrn=" + rrn + ", foreigner=" + foreigner + ", driver=" + driver
				+ ", passport=" + passport + ", account_num=" + account_num + ", card_num=" + card_num + ", phone="
				+ phone + ", phone_num=" + phone_num + ", mobile_phone=" + mobile_phone + ", new_rrn=" + new_rrn
				+ ", email=" + email + ", carnum=" + car_num + ", vehicleid=" + vehicleid + ", total=" + total
				+ ", total_gap=" + total_gap + "]";
	}

	
}
