package com.pojo;

public class EmployeeLogin {
	String userName,password;
	public EmployeeLogin() {
		// TODO Auto-generated constructor stub
	}
	public EmployeeLogin(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "EmployeeLogin [userName=" + userName + ", password=" + password + "]";
	}
	

}
