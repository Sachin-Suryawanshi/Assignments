package com.thinkitive.model;

import javax.persistence.*;

@Entity
public class TeacherRegisterRequest {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int tId;
	@Column(name = "TeacherName")
	private String tname;
	private String emailId;
	private String password;
	private long contactNo;
	private String securityQuestion;
	private String securityAnswer;
	
	public TeacherRegisterRequest() {
		// TODO Auto-generated constructor stub
	}

	public TeacherRegisterRequest(int tId, String tname, String emailId, String password, long contactNo,
			String securityQuestion, String securityAnswer) {
		super();
		this.tId = tId;
		this.tname = tname;
		this.emailId = emailId;
		this.password = password;
		this.contactNo = contactNo;
		this.securityQuestion = securityQuestion;
		this.securityAnswer = securityAnswer;
	}

	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
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
		return "TeacherRegisterRequest [tId=" + tId + ", tname=" + tname + ", emailId=" + emailId + ", password="
				+ password + ", contactNo=" + contactNo + ", securityQuestion=" + securityQuestion + ", securityAnswer="
				+ securityAnswer + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + tId;
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
		TeacherRegisterRequest other = (TeacherRegisterRequest) obj;
		if (tId != other.tId)
			return false;
		return true;
	}
	

}
