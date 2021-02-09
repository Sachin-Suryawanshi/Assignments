package com.thinkitive.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.thinkitive.model.Exam;
import com.thinkitive.utility.HBUtility;

public class ExamDao {
	public void addExam(Exam ex) {
		SessionFactory sf = HBUtility.myConnection();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();

		session.save(ex);
		t.commit();
		session.close();
		sf.close();

	}
	public void deleteExam(Exam ex)
	{
		SessionFactory sf = HBUtility.myConnection();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		session.delete(ex);
		Query q=session.createQuery("delete from Question where examId=:i");
		q.setParameter("i", ex.getExamId());
		int noOfRows=q.executeUpdate();
		System.out.println("No of rows affected");
		t.commit();
		session.close();
		sf.close();
	}
	public void updateExam(Exam ex) {
		SessionFactory sf = HBUtility.myConnection();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		session.update(ex);
		t.commit();
		session.close();
		sf.close();
		System.out.println("Updated Successfully");

	}
	public List<Exam> showExam() {
		SessionFactory sf = HBUtility.myConnection();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		Criteria c = session.createCriteria(Exam.class);
		List<Exam> exlist = c.list();
		return exlist;
	}
	public Exam searchExam(int id) {
		SessionFactory sf = HBUtility.myConnection();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		Exam ex = new Exam();
		ex = (Exam) session.get(Exam.class, id);
		return ex;
	}

}
