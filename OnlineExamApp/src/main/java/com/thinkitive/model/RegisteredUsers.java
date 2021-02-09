package com.thinkitive.model;

import javax.persistence.*;

@Entity
public class RegisteredUsers {
	@Id
	private int userId;
	@Column(name = "User_Name")
	private String userName;
	private String emailId;
	private String password;
	private long contactNo;
	private String domain;
	private String securityQuestion;
	private String securityAnswer;
	
	public RegisteredUsers() {
		// TODO Auto-generated constructor stub
	}

	public RegisteredUsers(int userId, String userName, String emailId, String password, long contactNo, String domain,
			String securityQuestion, String securityAnswer) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.emailId = emailId;
		this.password = password;
		this.contactNo = contactNo;
		this.domain = domain;
		this.securityQuestion = securityQuestion;
		this.securityAnswer = securityAnswer;
		
	}



	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getSecurityQuestion() {
		return securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public String getSecurityAnswer() {
		return securityAnswer;
	}

	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}

	

	

	@Override
	public String toString() {
		return "RegisteredUsers [userId=" + userId + ", userName=" + userName + ", emailId=" + emailId + ", password="
				+ password + ", contactNo=" + contactNo + ", domain=" + domain + ", securityQuestion="
				+ securityQuestion + ", securityAnswer=" + securityAnswer + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + userId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegisteredUsers other = (RegisteredUsers) obj;
		if (userId != other.userId)
			return false;
		return true;
	}
	

}
