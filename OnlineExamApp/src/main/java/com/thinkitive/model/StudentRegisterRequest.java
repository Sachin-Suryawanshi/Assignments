package com.thinkitive.model;

import javax.persistence.*;
@Entity
public class StudentRegisterRequest {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studId;
	@Column(name = "Student_Name")
	private String studName;
	private String emailId;
	private String password;
	private long contactNo;
	private String securityQuestion;
	private String securityAnswer;
	public StudentRegisterRequest() {
		// TODO Auto-generated constructor stub
	}
	public StudentRegisterRequest(int studId, String studName, String emailId, String password, long contactNo,
			String securityQuestion, String securityAnswer) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.emailId = emailId;
		this.password = password;
		this.contactNo = contactNo;
		this.securityQuestion = securityQuestion;
		this.securityAnswer = securityAnswer;
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
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
		return "StudentRegisterRequest [studId=" + studId + ", studName=" + studName + ", emailId=" + emailId
				+ ", password=" + password + ", contactNo=" + contactNo + ", securityQuestion=" + securityQuestion
				+ ", securityAnswer=" + securityAnswer + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + studId;
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
		StudentRegisterRequest other = (StudentRegisterRequest) obj;
		if (studId != other.studId)
			return false;
		return true;
	}
	
}
