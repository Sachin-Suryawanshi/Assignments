package com.thinkitive.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.thinkitive.dao.RegisteredUserDao;
import com.thinkitive.dao.StudentRegisterDao;
import com.thinkitive.dao.TeacherRegisterDao;
import com.thinkitive.model.RegisteredUsers;
import com.thinkitive.model.StudentRegisterRequest;
import com.thinkitive.model.TeacherRegisterRequest;

@RestController
public class HomeController {
	RegisteredUserDao rudao = new RegisteredUserDao();
	TeacherRegisterDao tdao = new TeacherRegisterDao();
	TeacherRegisterRequest tech = new TeacherRegisterRequest();
	StudentRegisterDao sdao = new StudentRegisterDao();
	StudentRegisterRequest stud = new StudentRegisterRequest();

//users
	@RequestMapping(value = "/forgotpassword", method = RequestMethod.GET)
	public String getPassword(@RequestParam String emailId, String securityQuestion, String securityAnswer) {

		String password = null;
		List<RegisteredUsers> rulist = rudao.showUsers();
		for (RegisteredUsers ru : rulist) {
			if (ru.getEmailId().equals(emailId) && ru.getSecurityQuestion().equals(securityQuestion)
					&& ru.getSecurityAnswer().equals(securityAnswer)) {
				password = ru.getPassword();
			}

		}
		return password;
	}

//users
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(HttpServletRequest request, @RequestParam String domain, String emailId, String password) {
		String success = null;
		HttpSession session=request.getSession();
		if (domain.equals("Teacher") || domain.equals("Student")) {
			List<RegisteredUsers> rulist = rudao.showUsers();
			for (RegisteredUsers ru : rulist) {
				if (ru.getDomain().equals(domain) && ru.getEmailId().equals(emailId)
						&& ru.getPassword().equals(password)) {
					success = ru.getUserName();
					session.setAttribute("userdetails", ru);
				}
			}
		} else if (domain.equals("admin") && emailId.equals("admin") && password.equals("admin")) {
			success = "admin";
			session.setAttribute("userdetails", "admin");
		}
		else
		{
			return "Please Cheack your credentials";
		}

		return "Login Successful by " + success;
	}

//teachers
	@RequestMapping(value = "/teacherregister", method = RequestMethod.POST)
	public String registration(String emailId, String password, String domain, Long contactNo, String teacherName,
			String securityQuestion, String securityAnswer) {
		if (domain.equals("Teacher")) {
			tech.setContactNo(contactNo);
			tech.setEmailId(emailId);
			tech.setPassword(password);
			tech.setSecurityQuestion(securityQuestion);
			tech.setSecurityAnswer(securityAnswer);
			tech.setTname(teacherName);

			tdao.addTeacher(tech);

		}
		return "Successfully Registered";
	}

//student
	@RequestMapping(value = "/studentregister", method = RequestMethod.POST)
	public String studentRegistration(String emailId, String password, String domain, Long contactNo, String studName,
			String securityQuestion, String securityAnswer) {
		if (domain.equals("Student")) {
			stud.setContactNo(contactNo);
			stud.setEmailId(emailId);
			stud.setPassword(password);
			stud.setSecurityQuestion(securityQuestion);
			stud.setSecurityAnswer(securityAnswer);
			stud.setStudName(studName);

			sdao.addStudent(stud);

		}
		return "Successfully Registered";
	}
}
