package com.thinkitive.model;

import java.util.List;

public class AnswerSheet {
	private int ansId;
	private List<Integer> qId;
	private List<String> answer;
	public AnswerSheet() {
		// TODO Auto-generated constructor stub
	}
	
	public AnswerSheet(int ansId, List<Integer> qId, List<String> answer) {
		super();
		this.ansId = ansId;
		this.qId = qId;
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "AnswerSheet [ansId=" + ansId + ", qId=" + qId + ", answer=" + answer + "]";
	}

	public int getAnsId() {
		return ansId;
	}

	public void setAnsId(int ansId) {
		this.ansId = ansId;
	}

	public List<Integer> getqId() {
		return qId;
	}

	public void setqId(List<Integer> qId) {
		this.qId = qId;
	}

	public List<String> getAnswer() {
		return answer;
	}

	public void setAnswer(List<String> answer) {
		this.answer = answer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ansId;
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
		AnswerSheet other = (AnswerSheet) obj;
		if (ansId != other.ansId)
			return false;
		return true;
	}
	

}
