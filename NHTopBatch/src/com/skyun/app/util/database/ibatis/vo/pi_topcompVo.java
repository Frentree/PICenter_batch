package com.skyun.app.util.database.ibatis.vo;

public class pi_topcompVo {
	
	private String target_id;
	private String regdate;
	private int ap_no;
	private long path_cnt=0;
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
	private long phone=0;
	private long phone_pre=0;
	private long phone_num=0;
	private long phone_num_pre=0;
	private long mobile_phone=0;
	private long mobile_phone_pre=0;
	private long new_rrn=0;
	private long new_rrn_pre=0;
	private long email=0;
	private long email_pre=0;
	private long carnum=0;
	private long carnum_pre=0;
	private long vehicleid=0;
	private long vehicleid_pre=0;
	private long total=0;
	private long total_pre=0;
	private long total_gap=0;

	
	public pi_topcompVo() {
		
	}
	
	public void setPersol(PersonalVo v) {
		this.target_id=v.getTarget_id();
		this.ap_no=v.getAp_no();
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
		this.carnum=v.getCarnum();
		this.vehicleid=v.getVehicleid();
		this.total=v.getTotal();
		this.regdate=v.getRegdate();
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
		//total=rrn+foreigner+driver+passport+account_num+card_num;
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

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public long getPhone_pre() {
		return phone_pre;
	}

	public void setPhone_pre(long phone_pre) {
		this.phone_pre = phone_pre;
	}

	public long getPhone_num() {
		return phone_num;
	}

	public void setPhone_num(long phone_num) {
		this.phone_num = phone_num;
	}

	public long getPhone_num_pre() {
		return phone_num_pre;
	}

	public void setPhone_num_pre(long phone_num_pre) {
		this.phone_num_pre = phone_num_pre;
	}

	public long getMobile_phone() {
		return mobile_phone;
	}

	public void setMobile_phone(long mobile_phone) {
		this.mobile_phone = mobile_phone;
	}

	public long getMobile_phone_pre() {
		return mobile_phone_pre;
	}

	public void setMobile_phone_pre(long mobile_phone_pre) {
		this.mobile_phone_pre = mobile_phone_pre;
	}

	public long getNew_rrn() {
		return new_rrn;
	}

	public void setNew_rrn(long new_rrn) {
		this.new_rrn = new_rrn;
	}

	public long getNew_rrn_pre() {
		return new_rrn_pre;
	}

	public void setNew_rrn_pre(long new_rrn_pre) {
		this.new_rrn_pre = new_rrn_pre;
	}

	public long getEmail() {
		return email;
	}

	public void setEmail(long email) {
		this.email = email;
	}

	public long getEmail_pre() {
		return email_pre;
	}

	public void setEmail_pre(long email_pre) {
		this.email_pre = email_pre;
	}

	public long getCarnum() {
		return carnum;
	}

	public void setCarnum(long carnum) {
		this.carnum = carnum;
	}

	public long getCarnum_pre() {
		return carnum_pre;
	}

	public void setCarnum_pre(long carnum_pre) {
		this.carnum_pre = carnum_pre;
	}

	public long getVehicleid() {
		return vehicleid;
	}

	public void setVehicleid(long vehicleid) {
		this.vehicleid = vehicleid;
	}

	public long getVehicleid_pre() {
		return vehicleid_pre;
	}

	public void setVehicleid_pre(long vehicleid_pre) {
		this.vehicleid_pre = vehicleid_pre;
	}

	@Override
	public String toString() {
		return "pi_topcompVo [target_id=" + target_id + ", regdate=" + regdate + ", ap_no=" + ap_no + "]";
	}

	

}
