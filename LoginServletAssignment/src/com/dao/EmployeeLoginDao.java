package com.dao;

import java.util.List;

import com.pojo.EmployeeLogin;

public interface EmployeeLoginDao {
	boolean insertEmployeeLogin(EmployeeLogin el);
	List<EmployeeLogin> showEmployeeLogin();
	boolean employeeLogin(String username,String password);

}
