package com.thinkitive.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import com.thinkitive.model.Dictionary;
import com.thinkitive.utility.DBUtility;

public class DictionaryDao {

	public void insertWord(Dictionary dt)
	{
		SessionFactory sf=DBUtility.myConnection();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		session.save(dt);
		t.commit();
		session.close();
	}
	
	public List<Dictionary> getall()
	{
		SessionFactory sf=DBUtility.myConnection();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		Criteria c=session.createCriteria(Dictionary.class);
		List<Dictionary> dlist=c.list();
		return dlist;
	}
	
	public Dictionary searchDictionary(String word)
	{
		SessionFactory sf=DBUtility.myConnection();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		Dictionary d=new Dictionary();
		d=(Dictionary) session.get(Dictionary.class, word);
		
		
		return d;
	}

}
