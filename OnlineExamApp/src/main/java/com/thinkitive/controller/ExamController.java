package com.thinkitive.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkitive.dao.QuestionDao;
import com.thinkitive.dao.RegisteredUserDao;
import com.thinkitive.dao.ResultDao;
import com.thinkitive.model.Question;
import com.thinkitive.model.RegisteredUsers;
import com.thinkitive.model.Result;

@RestController
public class ExamController {
	RegisteredUserDao rdao = new RegisteredUserDao();
	RegisteredUsers ru = new RegisteredUsers();
	Question q = new Question();
	QuestionDao qdao = new QuestionDao();
	@Autowired
	HttpServletRequest request;
	ResultDao rt = new ResultDao();
	Result r = new Result();

	@RequestMapping(value = "/submit", method = RequestMethod.POST)
	public Integer getMarks(@RequestParam Integer exId, Integer q1Id, Integer q2Id, String q1, String q2) {
		int marks = 0;
		HttpSession session = request.getSession();
		ru = (RegisteredUsers) session.getAttribute("userdetails");
		if (q1.equals(qdao.searchQuestion(q1Id).getCorrectAnswer())) {
			marks += 2;
		}
		else
		{
			marks+=0;
		}
		if (q2.equals(qdao.searchQuestion(q2Id).getCorrectAnswer())) {
			marks += 2;
		}
		else
		{
			marks+=0;
		}
		r.setExamId(exId);
		r.setMarks(marks);
		r.setStudId(ru.getUserId());
		r.setStudName(ru.getUserName());
		rt.addResult(r);
		return marks;

	}

	@RequestMapping(value = "/userinfo", method = RequestMethod.GET)
	public RegisteredUsers loginUserDetails() {
		HttpSession session = request.getSession();
		return (RegisteredUsers) session.getAttribute("userdetails");
	}

	@RequestMapping(value = "/logout")
	public String logout() {
		HttpSession session = request.getSession();
		session.invalidate();
		return "Logout";
	}

}
