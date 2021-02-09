package com.thinkitive.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.thinkitive.model.Demo;
import com.thinkitive.utility.HBUtility;

public class DemoDao {
	SessionFactory sf=HBUtility.myConnection();
	Session session=sf.openSession();
	Transaction t=session.beginTransaction();
	public void addStudent(Demo d)
	{
	
		session.save(d);
		t.commit();
		session.close();
		
	}
}
