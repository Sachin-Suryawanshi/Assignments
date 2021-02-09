package com.thinkitive.test;

import java.util.Scanner;

import com.thinkitive.dao.DemoDao;
import com.thinkitive.model.Demo;

public class DemoTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Demo d=new Demo();
		DemoDao ddao=new DemoDao();
		System.out.println("Enter a name");
		d.setName(sc.next());
		ddao.addStudent(d);
		System.out.println("Added successfully");
		
	}

}
