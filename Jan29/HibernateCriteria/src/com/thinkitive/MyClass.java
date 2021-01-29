package com.thinkitive;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class MyClass {
	Configuration cfg=new Configuration();
	
	SessionFactory factory=cfg.configure().buildSessionFactory();
	Session session=factory.openSession();
	Transaction t=session.beginTransaction();
	public List getEmployee()
	{
		List elist=null;
		
		Criteria c=session.createCriteria(Employee.class);
		c.add(Restrictions.gt("salary", 10000));
		elist=c.list();
		System.out.println(elist);
		t.commit();
		session.close();
		factory.close();
		return elist;
	}
	public Employee searchEmployee(int id)
	{
		Employee e=new Employee();
		e=(Employee)session.get(Employee.class, id);
		System.out.println(e);
		return e;
	}
	public void getAddressinfo()
	{
		Address a=new Address("Mumbai", 400001);
		session.save(a);
		System.out.println("Address added");
		t.commit();
		session.close();
		factory.close();
		
	}

}
