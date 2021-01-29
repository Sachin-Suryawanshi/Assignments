package com.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Dictionary;

public class DBUtility {
	public static SessionFactory myConnection()
	{
		SessionFactory sf=null;
		try
		{
		Configuration cfg=new Configuration();
		cfg.addAnnotatedClass(Dictionary.class);
		cfg.configure("hibernate.cfg.xml");
		 sf=cfg.buildSessionFactory();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return sf;
	}

}
