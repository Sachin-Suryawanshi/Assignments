package com.thinkitive.test;

import java.util.List;
import java.util.Scanner;

import com.thinkitive.dao.StudentRegisterDao;
import com.thinkitive.dao.TeacherRegisterDao;
import com.thinkitive.model.StudentRegisterRequest;

public class StudentRegisterTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentRegisterRequest sr=new StudentRegisterRequest();
		StudentRegisterDao srdao=new StudentRegisterDao();
		int id;
		String studName;
		long contactNo;
		String securityQuestion;
		String securityAnswer;
		String password;
		String emailId;
		while(true) {
		System.out.println("1.Add Student");
		System.out.println("2.Update Student");
		System.out.println("3.Show Student");
		System.out.println("4.Search Student");
		System.out.println("5.Delete Student");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter a Student name");
			studName=sc.next();
			System.out.println("Enter mobile number");
			contactNo=sc.nextLong();
			System.out.println("Enter emailId");
			emailId=sc.next();
			System.out.println("Enter a password");
			password=sc.next();
			System.out.println("Enter security Question");
			securityQuestion=sc.next();
			System.out.println("Enter security Answer");
			securityAnswer=sc.next();
			sr.setContactNo(contactNo);
			sr.setEmailId(emailId);
			sr.setPassword(password);
			sr.setSecurityAnswer(securityAnswer);
			sr.setSecurityQuestion(securityQuestion);
			sr.setStudName(studName);
			srdao.addStudent(sr);
			System.out.println("Student added successfully");
			
			
			break;
		case 2:
			System.out.println("Enter a id to update");
			id=sc.nextInt();
			System.out.println("Enter a teacher name to update");
			studName=sc.next();
			System.out.println("Enter mobile number to update");
			contactNo=sc.nextLong();
			System.out.println("Enter emailId to update");
			emailId=sc.next();
			System.out.println("Enter a password to update");
			password=sc.next();
			System.out.println("Enter security Question to update");
			securityQuestion=sc.next();
			System.out.println("Enter security Answer to update");
			securityAnswer=sc.next();
			sr.setStudId(id);
			sr.setContactNo(contactNo);
			sr.setEmailId(emailId);
			sr.setPassword(password);
			sr.setSecurityAnswer(securityAnswer);
			sr.setSecurityQuestion(securityQuestion);
			sr.setStudName(studName);
			srdao.updateStudent(sr);
			System.out.println("Student Updated successfully");
			break;
		case 3:
			System.out.println("TeacherList:");
			List<StudentRegisterRequest> techlist=srdao.showStudents();
			for(StudentRegisterRequest s:techlist)
			{
				System.out.println(s);
			}
			break;
		case 4:
			System.out.println("Enter a teacher id to view teacher");
			id=sc.nextInt();
			sr=srdao.searchStudent(id);
			System.out.println(sr);
			break;
		
			
		case 5:
			System.out.println("Enter a id to delete");
			id=sc.nextInt();
			sr.setStudId(id);
			srdao.deleteStudent(sr);
			System.out.println("Deleted successfully");
			break;
		}
	}
	}

	

}
