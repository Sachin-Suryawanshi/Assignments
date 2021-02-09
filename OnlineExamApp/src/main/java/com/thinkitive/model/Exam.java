package com.thinkitive.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class Exam {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int examId;
	private String examName;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "ExamId")
	private List<Question> questions;
	public Exam() {
		// TODO Auto-generated constructor stub
	}
	public Exam(int examId, String examName, List<Question> questions) {
		super();
		this.examId = examId;
		this.examName = examName;
		this.questions = questions;
	}
	public int getExamId() {
		return examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}
	public String getExamName() {
		return examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	@Override
	public String toString() {
		return "Exam [examId=" + examId + ", examName=" + examName + ", questions=" + questions + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + examId;
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
		Exam other = (Exam) obj;
		if (examId != other.examId)
			return false;
		return true;
	}

}
