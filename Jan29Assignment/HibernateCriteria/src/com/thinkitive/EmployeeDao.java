package com.thinkitive;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDao {
	Configuration cf=new Configuration();
	SessionFactory factory=cf.configure().buildSessionFactory();
	Session session=factory.openSession();
	Transaction t=session.beginTransaction();
	public void insertEmployee(Employee e)
	
	{
		session.save(e);
		t.commit();
		session.close();
		factory.close();
		
	}
	public Employee searchEmployee(int id)
	{
		Employee e=new Employee();
		e=(Employee) session.get(Employee.class, id);
		t.commit();
		session.close();
		factory.close();
		return e;
		
	}
	public void deleteEmployee(Employee e)
	{
		session.delete(e);
		t.commit();
		session.close();
		factory.close();
		
	}
	public void updateEmployee(Employee e)
	{
		session.update(e);
		t.commit();
		session.close();
		factory.close();
	}

}
