package com.thinkitive.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.thinkitive.model.StudentRegisterRequest;
import com.thinkitive.utility.HBUtility;

public class StudentRegisterDao {
	public void addStudent(StudentRegisterRequest stud) {
		SessionFactory sf = HBUtility.myConnection();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();

		session.save(stud);
		t.commit();
		session.close();
		sf.close();

	}

	public void deleteStudent(StudentRegisterRequest stud) {
		SessionFactory sf = HBUtility.myConnection();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		session.delete(stud);
		t.commit();
		session.close();
		sf.close();
	}

	public StudentRegisterRequest searchStudent(int id) {
		SessionFactory sf = HBUtility.myConnection();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		StudentRegisterRequest stud=new StudentRegisterRequest();
		stud.setStudId(id);
		stud = (StudentRegisterRequest) session.get(StudentRegisterRequest.class, id);
		return stud;
	}

	public void updateStudent(StudentRegisterRequest stud) {
		SessionFactory sf = HBUtility.myConnection();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		session.update(stud);
		t.commit();
		session.close();
		sf.close();
		System.out.println("Updated Successfully");

	}

	public List<StudentRegisterRequest> showStudents() {
		SessionFactory sf = HBUtility.myConnection();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		Criteria c = session.createCriteria(StudentRegisterRequest.class);
		List<StudentRegisterRequest> studlist = c.list();
		return studlist;
	}

}
