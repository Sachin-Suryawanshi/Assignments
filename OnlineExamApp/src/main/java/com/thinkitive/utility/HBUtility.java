package com.thinkitive.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.thinkitive.model.Exam;
import com.thinkitive.model.Question;
import com.thinkitive.model.RegisteredUsers;
import com.thinkitive.model.Result;
import com.thinkitive.model.StudentRegisterRequest;
import com.thinkitive.model.TeacherRegisterRequest;

public class HBUtility {
	public static SessionFactory myConnection() {
		SessionFactory sf = null;
		try {
			Configuration c = new Configuration();
			c.addAnnotatedClass(Result.class);
			c.addAnnotatedClass(Exam.class);
			c.addAnnotatedClass(Question.class);
			c.addAnnotatedClass(RegisteredUsers.class);
			c.addAnnotatedClass(StudentRegisterRequest.class);
			c.addAnnotatedClass(TeacherRegisterRequest.class);
			c.configure("hibernate.cfg.xml");
			sf = c.buildSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sf;
	}

}
