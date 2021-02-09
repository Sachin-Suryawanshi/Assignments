package com.thinkitive.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.thinkitive.model.Result;
import com.thinkitive.utility.HBUtility;

public class ResultDao {
	public void addResult(Result r) {
		SessionFactory sf = HBUtility.myConnection();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();

		session.save(r);
		t.commit();
		session.close();
		sf.close();

	}

}
