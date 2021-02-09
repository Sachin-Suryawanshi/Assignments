package com.thinkitive.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkitive.dao.QuestionDao;
import com.thinkitive.model.Question;

@RestController
public class QuestionController {
	QuestionDao qdao = new QuestionDao();
	Question q = new Question();

	@RequestMapping(value = "/allquestions", method = RequestMethod.GET)
	public List<Question> getAllQuestions() {
		List qlist = new ArrayList();
		List<Question> qulist = qdao.showQuestions();
		
		return qulist;
	}

	@RequestMapping(value = "/searchQuestion", method = RequestMethod.GET)
	public Question getQuestion(@RequestParam Integer qId) {
		return qdao.searchQuestion(qId);
	}

	@RequestMapping(value = "/deleteQuestion", method = RequestMethod.DELETE)
	public String deleteQuestion(@RequestParam Integer qId) {
		q.setqId(qId);
		qdao.deleteQuestion(q);
		return "Deleted successfully";
	}

	@RequestMapping(value = "/addQuestion", method = RequestMethod.POST)
	public String addQuestion(@RequestParam String question, String op1, String op2, String op3, String op4,
			String correctAnswer) {
		q.setCorrectAnswer(correctAnswer);
		q.setOp1(op1);
		q.setOp2(op2);
		q.setOp3(op3);
		q.setOp4(op4);
		q.setQuestion(question);
		qdao.addQuestion(q);
		return "Added Successfully";
	}

	@RequestMapping(value = "/updateQuestion", method = RequestMethod.POST)
	public String updateQuestion(@RequestParam Integer qId, String question, String op1, String op2, String op3,
			String op4, String correctAnswer) {
		q.setqId(qId);
		q.setCorrectAnswer(correctAnswer);
		q.setOp1(op1);
		q.setOp2(op2);
		q.setOp3(op3);
		q.setOp4(op4);
		q.setQuestion(question);
		qdao.updateQuestion(q);
		return "Updated Successfully";
	}

}
