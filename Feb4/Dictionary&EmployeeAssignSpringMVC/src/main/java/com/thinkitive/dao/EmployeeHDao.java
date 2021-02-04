package com.thinkitive.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.thinkitive.model.Employee;
import com.thinkitive.utility.DBUtility;

public class EmployeeHDao implements EmployeeDao{
	SessionFactory sf=DBUtility.myConnection();
	Session session=sf.openSession();
	Transaction t=session.beginTransaction();

	@Override
	public void addEmployee(Employee e) {
		session.save(e);
		t.commit();
		System.out.println("Added successfully");
		session.close();
		
	}

	@Override
	public void deleteEmployee(Employee emp) {
		session.delete(emp);
		t.commit();
		session.close();
		
	}

	@Override
	public Employee searchEmployee(int empId) {
		Employee emp=(Employee) session.get(Employee.class, empId);
		return emp;
	}

	@Override
	public void updateEmployee(Employee emp) {
		session.update(emp);
		t.commit();
		session.close();
		
	}

	@Override
	public List<Employee> getAll() {
		List<Employee> elist=new ArrayList<Employee>();
		Criteria c=session.createCriteria(Employee.class);
		elist=c.list();
		return elist;
	}

}
