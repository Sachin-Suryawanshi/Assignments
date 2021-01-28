package com.thinkitive;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MyDBConnection {
	Employee e = new Employee(101, "xyz", 9000000);
	Configuration cfg = new Configuration();
	SessionFactory factory = cfg.configure().buildSessionFactory();
	Session session = factory.openSession();
	Transaction tx = session.beginTransaction();

	public void insertEmployee() {

		session.save(e);

		tx.commit();
		session.close();
		factory.close();
	}

	public void updateEmployee(Employee e) {
		session.update(e);
		tx.commit();
		session.close();
		factory.close();
	}

	public void deleteEmployee(Employee e) {
		session.delete(e);
		tx.commit();
		session.close();
		factory.close();
	}

	public void displayEmployee() {
		Query q = session.createQuery("From Employee");
		List l = q.list();
		System.out.println(l);
		tx.commit();
		session.close();
		factory.close();
	}

}
