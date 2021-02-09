package com.thinkitive.test;

import java.util.List;
import java.util.Scanner;

import com.thinkitive.dao.RegisteredUserDao;
import com.thinkitive.model.RegisteredUsers;

public class RegisteredUserTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RegisteredUsers ru = new RegisteredUsers();
		RegisteredUserDao rudao = new RegisteredUserDao();
		int id;
		String userName;
		long contactNo;
		String securityQuestion;
		String securityAnswer;
		String password;
		String emailId;
		String domain;
		while (true) {
			System.out.println("1.Add User");
			System.out.println("2.Update User");
			System.out.println("3.Show User");
			System.out.println("4.Search User");
			System.out.println("5.Delete User");
			System.out.println("6.Show Teachers");
			System.out.println("7.Show Students");
			System.out.println("8.Exit");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter UserId");
				id=sc.nextInt();
				System.out.println("Enter a User name");
				userName = sc.next();
				System.out.println("Enter mobile number");
				contactNo = sc.nextLong();
				System.out.println("Enter emailId");
				emailId = sc.next();
				System.out.println("Enter a password");
				password = sc.next();
				System.out.println("Enter security Question");
				securityQuestion = sc.next();
				System.out.println("Enter security Answer");
				securityAnswer = sc.next();
				System.out.println("Enter a domain");
				domain = sc.next();
				ru.setUserId(id);
				ru.setContactNo(contactNo);
				ru.setEmailId(emailId);
				ru.setPassword(password);
				ru.setSecurityAnswer(securityAnswer);
				ru.setSecurityQuestion(securityQuestion);
				ru.setUserName(userName);
				ru.setDomain(domain);
				rudao.addUser(ru);
				System.out.println("Student added successfully");

				break;
			case 2:
				System.out.println("Enter a id to update");
				id = sc.nextInt();
				System.out.println("Enter a teacher name to update");
				userName = sc.next();
				System.out.println("Enter mobile number to update");
				contactNo = sc.nextLong();
				System.out.println("Enter emailId to update");
				emailId = sc.next();
				System.out.println("Enter a password to update");
				password = sc.next();
				System.out.println("Enter security Question to update");
				securityQuestion = sc.next();
				System.out.println("Enter security Answer to update");
				securityAnswer = sc.next();
				System.out.println("Enter a domain to update");
				domain = sc.next();
				
				ru.setUserId(id);
				ru.setContactNo(contactNo);
				ru.setEmailId(emailId);
				ru.setPassword(password);
				ru.setSecurityAnswer(securityAnswer);
				ru.setSecurityQuestion(securityQuestion);
				ru.setUserName(userName);
				ru.setDomain(domain);
				rudao.updateUser(ru);
				System.out.println("User Updated successfully");
				break;
			case 3:
				System.out.println("UsersList:");
				List<RegisteredUsers> userlist = rudao.showUsers();
				for (RegisteredUsers u : userlist) {
					System.out.println(u);
				}
				break;
			case 4:
				System.out.println("Enter a teacher id to view teacher");
				id = sc.nextInt();
				ru = rudao.searchUser(id);
				System.out.println(ru);
				break;

			case 5:
				System.out.println("Enter a id to delete");
				id = sc.nextInt();
				ru.setUserId(id);
				rudao.deleteUser(ru);
				System.out.println("Deleted successfully");
				break;
			case 6:
				System.out.println("TeacherList:");
				userlist = rudao.showUsers();
				for (RegisteredUsers u : userlist) {
					if (u.getDomain().equals("Teacher")) {
						System.out.println(u);
					}
				}
				break;
			case 7:
				System.out.println("StudentList:");
				userlist = rudao.showUsers();
				for (RegisteredUsers u : userlist) {
					if (u.getDomain().equals("Student")) {
						System.out.println(u);
					}
				}
				break;
			case 8:
				System.out.println("Successfully Exited");
				System.exit(0);
				break;
			}
		}
	}

}
