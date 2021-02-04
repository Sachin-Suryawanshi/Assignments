package com.thinkitive.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class DBUtility {
	public static SessionFactory myConnection()
	{
		SessionFactory sf=null;
		try
		{
			Configuration c=new Configuration();
			c.addAnnotatedClass(com.thinkitive.model.Dictionary.class);
			c.configure("hibernate.cfg.xml");
			sf=c.buildSessionFactory();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return sf;
	}

}
