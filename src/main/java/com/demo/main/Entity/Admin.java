//package com.demo.main.Entity;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//
////import jakarta.persistence.PrimaryKeyJoinColumn;
//
//@Entity
////@PrimaryKeyJoinColumn(name = "admin_Id")
//public class Admin  {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private long adminId;
//	private String adminName;
//	private String address;
//	private long mobile;
//	private String email;
//
//	public Admin() {
//		super();
//	}
//
//	public Admin(long adminId, String adminName, String address, long mobile, String email) {
//		super();
//		this.adminId = adminId;
//		this.adminName = adminName;
//		this.address = address;
//		this.mobile = mobile;
//		this.email = email;
//	}
//
//	public long getAdminId() {
//		return adminId;
//	}
//
//	public void setAdminId(long adminId) {
//		this.adminId = adminId;
//	}
//
//	public String getAdminName() {
//		return adminName;
//	}
//
//	public void setAdminName(String adminName) {
//		this.adminName = adminName;
//	}
//
//	
//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//	public long getMobile() {
//		return mobile;
//	}
//
//	public void setMobile(long mobile) {
//		this.mobile = mobile;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//}
