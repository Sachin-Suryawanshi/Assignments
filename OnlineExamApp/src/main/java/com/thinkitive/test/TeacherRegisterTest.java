package com.thinkitive.test;

import java.util.List;
import java.util.Scanner;

import com.thinkitive.dao.TeacherRegisterDao;
import com.thinkitive.model.TeacherRegisterRequest;

public class TeacherRegisterTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TeacherRegisterDao trdao=new TeacherRegisterDao();
		TeacherRegisterRequest tr=new TeacherRegisterRequest();
		int id;
		String tName;
		long contactNo;
		String securityQuestion;
		String securityAnswer;
		String password;
		String emailId;
		while(true) {
		System.out.println("1.Add Teacher");
		System.out.println("2.Update Teacher");
		System.out.println("3.Show Teachers");
		System.out.println("4.Search Teacher");
		System.out.println("5.Delete Teacher");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter a teacher name");
			tName=sc.next();
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
			tr.setContactNo(contactNo);
			tr.setEmailId(emailId);
			tr.setPassword(password);
			tr.setSecurityAnswer(securityAnswer);
			tr.setSecurityQuestion(securityQuestion);
			tr.setTname(tName);
			trdao.addTeacher(tr);
			System.out.println("Teacher added successfully");
			
			
			break;
		case 2:
			System.out.println("Enter a id to update");
			id=sc.nextInt();
			System.out.println("Enter a teacher name to update");
			tName=sc.next();
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
			tr.settId(id);
			tr.setContactNo(contactNo);
			tr.setEmailId(emailId);
			tr.setPassword(password);
			tr.setSecurityAnswer(securityAnswer);
			tr.setSecurityQuestion(securityQuestion);
			tr.setTname(tName);
			trdao.updateTeacher(tr);
			System.out.println("Teacher Updated successfully");
			break;
		case 3:
			System.out.println("TeacherList:");
			List<TeacherRegisterRequest> techlist=trdao.showTeachers();
			for(TeacherRegisterRequest t:techlist)
			{
				System.out.println(t);
			}
			break;
		case 4:
			System.out.println("Enter a teacher id to view teacher");
			id=sc.nextInt();
			tr=trdao.searchTeacher(id);
			System.out.println(tr);
			break;
		
			
		case 5:
			System.out.println("Enter a id to delete");
			id=sc.nextInt();
			tr.settId(id);
			trdao.deleteTeacher(tr);
			System.out.println("Deleted successfully");
			break;
		}
	}
	}

}
