package com.thinkitive.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.thinkitive.model.Question;
import com.thinkitive.model.RegisteredUsers;
import com.thinkitive.utility.HBUtility;

public class QuestionDao {
	public void addQuestion(Question q) {
		SessionFactory sf = HBUtility.myConnection();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();

		session.save(q);
		t.commit();
		session.close();
		sf.close();

	}

	public void deleteQuestion(Question q) {
		SessionFactory sf = HBUtility.myConnection();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		session.delete(q);
		t.commit();
		session.close();
		sf.close();
	}

	public void updateQuestion(Question q) {
		SessionFactory sf = HBUtility.myConnection();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		session.update(q);
		t.commit();
		session.close();
		sf.close();
		System.out.println("Updated Successfully");

	}

	public Question searchQuestion(int id) {
		SessionFactory sf = HBUtility.myConnection();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		Question q = new Question();
		q = (Question) session.get(Question.class, id);
		return q;
	}

	public List<Question> showQuestions() {
		SessionFactory sf = HBUtility.myConnection();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		Criteria c = session.createCriteria(Question.class);
		List<Question> qlist = c.list();
		return qlist;
	}

}
