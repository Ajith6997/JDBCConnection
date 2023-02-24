package com.jdbc.servlet.dto;

public class User {
	private String UserId;
	private String UserName;
	private String PhoneNo;
	
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}
	
	
	public User() {
		super();
	}
	public User(String userId, String userName, String phoneNo) {
		super();
		UserId = userId;
		UserName = userName;
		PhoneNo = phoneNo;
		
	}
}
