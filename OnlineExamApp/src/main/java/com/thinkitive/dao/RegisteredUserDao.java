package com.thinkitive.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.thinkitive.model.RegisteredUsers;
import com.thinkitive.utility.HBUtility;

public class RegisteredUserDao {
	public void addUser(RegisteredUsers user) {
		SessionFactory sf = HBUtility.myConnection();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();

		session.save(user);
		t.commit();
		session.close();
		sf.close();

	}

	public void deleteUser(RegisteredUsers user) {
		SessionFactory sf = HBUtility.myConnection();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		session.delete(user);
		t.commit();
		session.close();
		sf.close();
	}

	public RegisteredUsers searchUser(int id) {
		SessionFactory sf = HBUtility.myConnection();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		RegisteredUsers user=new RegisteredUsers();
		user = (RegisteredUsers) session.get(RegisteredUsers.class, id);
		return user;
	}

	public void updateUser(RegisteredUsers user) {
		SessionFactory sf = HBUtility.myConnection();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		session.update(user);
		t.commit();
		session.close();
		sf.close();
		System.out.println("Updated Successfully");

	}

	public List<RegisteredUsers> showUsers() {
		SessionFactory sf = HBUtility.myConnection();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		Criteria c = session.createCriteria(RegisteredUsers.class);
		List<RegisteredUsers> userlist = c.list();
		return userlist;
	}


}
