package com.thinkitive.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thinkitive.dao.ExamDao;
import com.thinkitive.dao.QuestionDao;
import com.thinkitive.dao.RegisteredUserDao;
import com.thinkitive.dao.StudentRegisterDao;
import com.thinkitive.dao.TeacherRegisterDao;
import com.thinkitive.model.Exam;
import com.thinkitive.model.Question;
import com.thinkitive.model.RegisteredUsers;
import com.thinkitive.model.StudentRegisterRequest;
import com.thinkitive.model.TeacherRegisterRequest;

@RestController
public class AdminController {
	StudentRegisterRequest stud = new StudentRegisterRequest();
	TeacherRegisterRequest tech = new TeacherRegisterRequest();
	TeacherRegisterDao tdao = new TeacherRegisterDao();
	StudentRegisterDao sdao = new StudentRegisterDao();
	ExamDao edao = new ExamDao();
	Exam e = new Exam();
	QuestionDao qdao = new QuestionDao();
	Question q = new Question();
	RegisteredUsers ru = new RegisteredUsers();
	RegisteredUserDao rdao = new RegisteredUserDao();
//teachers
	@RequestMapping(value = "/teacherRegisterRequests", method = RequestMethod.GET)
	public List<TeacherRegisterRequest> teacherLoginRequest() {
		return tdao.showTeachers();
	}
//Students
	@RequestMapping(value = "/studentRegisterRequests", method = RequestMethod.GET)
	public List<StudentRegisterRequest> studentLoginRequest() {
		return sdao.showStudents();
	}
//admin
	@RequestMapping(value = "/approvestudent", method = RequestMethod.POST)
	public String approveRequest(Integer studId, String emailId, String password, Long contactNo,
			String securityQuestion, String securityAnswer, String domain, String studName) {
		ru.setContactNo(contactNo);
		ru.setDomain(domain);
		ru.setEmailId(emailId);
		ru.setPassword(password);
		ru.setSecurityQuestion(securityQuestion);
		ru.setSecurityAnswer(securityAnswer);
		ru.setUserId(studId);
		ru.setUserName(studName);
		rdao.addUser(ru);
		stud.setStudId(studId);
		sdao.deleteStudent(stud);
		return "Approved Successfully";
	}
//admin
	@RequestMapping(value = "/approveteacher", method = RequestMethod.POST)
	public String approveTeacherRequest(Integer tId, String emailId, String password, Long contactNo,
			String securityQuestion, String securityAnswer, String domain, String tName) {
		ru.setContactNo(contactNo);
		ru.setDomain(domain);
		ru.setEmailId(emailId);
		ru.setPassword(password);
		ru.setSecurityQuestion(securityQuestion);
		ru.setSecurityAnswer(securityAnswer);
		ru.setUserId(tId);
		ru.setUserName(tName);
		rdao.addUser(ru);
		tech.settId(tId);
		tdao.deleteTeacher(tech);
		return "Approved Successfully";
	}
//teachers
	@RequestMapping(value = "/showexams", method = RequestMethod.GET)
	public List<Exam> showExams() {
		return edao.showExam();
	}
//teachers
	@RequestMapping(value = "/searchexam", method = RequestMethod.GET)
	public Exam searchExam(Integer id) {
		return edao.searchExam(id);
	}
//teachers
	@RequestMapping(value = "/deleteexam", method = RequestMethod.DELETE)
	public void deleteExam(Integer id) {
		e.setExamId(id);
		edao.deleteExam(e);
	}

}
