package com.thinkitive.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Result {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int resultId;
	private int studId;
	private String studName;
	private int marks;
	private int examId;
	public Result() {
		// TODO Auto-generated constructor stub
	}
	
	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public Result(int resultId, int studId, String studName, int marks, int examId) {
		super();
		this.resultId = resultId;
		this.studId = studId;
		this.studName = studName;
		this.marks = marks;
		this.examId = examId;
	}

	public int getResultId() {
		return resultId;
	}
	public void setResultId(int resultId) {
		this.resultId = resultId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getExamId() {
		return examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}
	
	@Override
	public String toString() {
		return "Result [resultId=" + resultId + ", studId=" + studId + ", studName=" + studName + ", marks=" + marks
				+ ", examId=" + examId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + resultId;
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
		Result other = (Result) obj;
		if (resultId != other.resultId)
			return false;
		return true;
	}

}
