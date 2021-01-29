package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.model.Dictionary;
import com.utility.DBUtility;

public class DictionaryDao {
	SessionFactory sf=DBUtility.myConnection();
	Session session=sf.openSession();
	Transaction t=session.beginTransaction();
	public void addWord(Dictionary w)
	{
		session.save(w);
		t.commit();
		session.close();
		sf.close();
		
	}
	public List<Dictionary> getDictionary()
	{
		List<Dictionary> dlist=new ArrayList<Dictionary>();
		Query q=session.createQuery("From Dictionary");
		dlist=q.list();
		t.commit();
		session.close();
		sf.close();
		return dlist;
	}
	public Dictionary searchWord(String word)
	{
		Dictionary d=new Dictionary();
		d=(Dictionary) session.get(Dictionary.class, word);
		
		t.commit();
		session.close();
		sf.close();
		return d;
	}

}
