package assignment1;

import java.util.Scanner;

public class EmployeeTest {
	public static void main(String args[])
	{
		Employee e=new Employee(1,"Sachin",100000,1500);
		e.empDetails();
		System.out.println("Company Name :"+Employee.companyName);
		Employee e1=new Employee(1,"Sachin",100000,1500);
		e1.empDetails();
		System.out.println("Company Name :"+Employee.companyName);
		System.out.println(Employee.num);
		
		
	}

}
