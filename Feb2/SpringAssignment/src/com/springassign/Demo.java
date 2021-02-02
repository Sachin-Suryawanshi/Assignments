package com.springassign;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("mybean.xml");
		Employee e=context.getBean(Employee.class);
		System.out.println(e.getGrossSalary());
		System.out.println(e.getNetSalary());
	}

}
