package com.thinkitive.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.thinkitive.dao.EmployeeDaoImpl;
import com.thinkitive.dao.EmployeeHDao;
import com.thinkitive.model.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		List<Employee> elist = new ArrayList<Employee>();
		EmployeeDaoImpl edao = new EmployeeDaoImpl();
		EmployeeHDao hdao=new EmployeeHDao();
		while (true) {
			System.out.println("1.Insert Employee");
			System.out.println("2.Show All Employee");
			System.out.println("3.Search Employee");
			System.out.println("4.Delete Employee");
			System.out.println("5.Employee to updates");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				emp = new Employee(2, "Mno", 200000);
				hdao.addEmployee(emp);
				System.out.println("Added successfully");
				break;
			case 2:
				elist = hdao.getAll();
				for (Employee e : elist) {
					System.out.println(e);
				}
				break;
			case 3:
				System.out.println("Enter employee id to search");
				int id = sc.nextInt();
				emp = hdao.searchEmployee(id);
				System.out.println(emp);
				break;
			case 4:
				System.out.println("Enter a employee id to delete");
				emp.setEmpId(sc.nextInt());
				hdao.deleteEmployee(emp);
				System.out.println("Deleted successfully");
				break;
			case 5:
				System.out.println("Enter id to update");
				id=sc.nextInt();
				System.out.println("Enter a name to update");
				String name=sc.next();
				System.out.println("Enter a salary to update");
				int salary=sc.nextInt();
				emp=new Employee(id, name, salary);
				hdao.updateEmployee(emp);
				System.out.println("Employee Updated successfully");
				break;
			}
		}
	}

}
