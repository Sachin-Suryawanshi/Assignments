package com.thinkitive;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.thinkitive.*;

public class Demo {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		SessionFactory factory=cfg.configure().buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		Address a1=new Address("Pune",411001);
		Address a2=new Address("Mumbai",431001);
		
		Set<Address> alist=new HashSet<Address>();
		alist.add(a1);
		alist.add(a2);
//		alist.add(a3);
//		alist.add(a4);
//		alist.add(a6);
//		alist.add(a5);
		Employee e=new Employee(99, "pqr", 12345, alist);
		
		session.save(e);
		t.commit();
		session.close();
		factory.close();
		
	}

}
