package com.thinkitive.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.thinkitive.model.TeacherRegisterRequest;
import com.thinkitive.utility.HBUtility;

public class TeacherRegisterDao {

	public void addTeacher(TeacherRegisterRequest tech) {
		SessionFactory sf = HBUtility.myConnection();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();

		session.save(tech);
		t.commit();
		session.close();
		sf.close();

	}

	public void deleteTeacher(TeacherRegisterRequest tech) {
		SessionFactory sf = HBUtility.myConnection();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		session.delete(tech);
		t.commit();
		session.close();
		sf.close();
	}

	public TeacherRegisterRequest searchTeacher(int id) {
		SessionFactory sf = HBUtility.myConnection();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		TeacherRegisterRequest tech = new TeacherRegisterRequest();
		tech.settId(id);
		tech = (TeacherRegisterRequest) session.get(TeacherRegisterRequest.class, id);
		return tech;
	}

	public void updateTeacher(TeacherRegisterRequest tech) {
		SessionFactory sf = HBUtility.myConnection();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		session.update(tech);
		t.commit();
		session.close();
		sf.close();
		System.out.println("Updated Successfully");

	}

	public List<TeacherRegisterRequest> showTeachers() {
		SessionFactory sf = HBUtility.myConnection();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		Criteria c = session.createCriteria(TeacherRegisterRequest.class);
		List<TeacherRegisterRequest> techlist = c.list();
		return techlist;
	}

}
