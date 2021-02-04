package com.thinkitive.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.thinkitive.model.Employee;
@Component
public class EmployeeDaoImpl implements EmployeeDao {
	List<Employee> elist = new ArrayList<Employee>();

	@Override
	public void addEmployee(Employee e) {
		elist.add(e);

	}

	@Override
	public void deleteEmployee(Employee e) {
		elist.remove(e);

	}

	@Override
	public List<Employee> getAll() {

		return elist;
	}

	@Override
	public Employee searchEmployee(int empId) {
		Employee emp = new Employee();
		for (Employee e : elist) {
			if (e.getEmpId() == empId) {
				return e;
			}
		}
		return null;
	}

	@Override
	public void updateEmployee(Employee emp) {
		
		for(int i=0;i<elist.size();i++)
		{
			if(emp.getEmpId()==elist.get(i).getEmpId())
			{
				elist.get(i).setEmpName(emp.getEmpName());
				elist.get(i).setSalary(emp.getSalary());
			}
		}
	}

}
