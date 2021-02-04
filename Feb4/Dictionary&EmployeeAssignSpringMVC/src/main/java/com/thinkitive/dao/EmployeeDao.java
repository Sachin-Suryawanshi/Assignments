package com.thinkitive.dao;

import java.util.List;

import com.thinkitive.model.Employee;

public interface EmployeeDao {
	public void addEmployee(Employee e);
	public void deleteEmployee(Employee emp);
	public Employee searchEmployee(int empId);
	public void updateEmployee(Employee emp);
	public List<Employee> getAll();

}
