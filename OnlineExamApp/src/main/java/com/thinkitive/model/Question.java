package com.thinkitive.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
@Entity
@Table(name = "Question_List")
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int qId;
	private String question;
	private String op1;
	private String op2;
	private String op3;
	private String op4;
	private String correctAnswer;
	public Question() {
		// TODO Auto-generated constructor stub
	}
	public Question(int qId, String question, String op1, String op2, String op3, String op4, String correctAnswer) {
		super();
		this.qId = qId;
		this.question = question;
		this.op1 = op1;
		this.op2 = op2;
		this.op3 = op3;
		this.op4 = op4;
		this.correctAnswer = correctAnswer;
	}
	public int getqId() {
		return qId;
	}
	public void setqId(int qId) {
		this.qId = qId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOp1() {
		return op1;
	}
	public void setOp1(String op1) {
		this.op1 = op1;
	}
	public String getOp2() {
		return op2;
	}
	public void setOp2(String op2) {
		this.op2 = op2;
	}
	public String getOp3() {
		return op3;
	}
	public void setOp3(String op3) {
		this.op3 = op3;
	}
	public String getOp4() {
		return op4;
	}
	public void setOp4(String op4) {
		this.op4 = op4;
	}
	public String getCorrectAnswer() {
		return correctAnswer;
	}
	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	@Override
	public String toString() {
		return "Question [qId=" + qId + ", question=" + question + ", op1=" + op1 + ", op2=" + op2 + ", op3=" + op3
				+ ", op4=" + op4 + ", correctAnswer=" + correctAnswer + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + qId;
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
		Question other = (Question) obj;
		if (qId != other.qId)
			return false;
		return true;
	}
	

}
