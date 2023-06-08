package com.UserMicroService.entitty;


public class Contact {

	private int cid;
	private String mobile;
	private String address;
	private int userId;
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(int cid, String mobile, String address, int userId) {
		super();
		this.cid = cid;
		this.mobile = mobile;
		this.address = address;
		this.userId = userId;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "Contact [cid=" + cid + ", mobile=" + mobile + ", address=" + address + ", userId=" + userId + "]";
	}
	
}
