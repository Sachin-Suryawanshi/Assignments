package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pojo.EmployeeLogin;
import com.utility.MyConnection;

public class EmployeeLoginDaoImpl implements EmployeeLoginDao {
	String query;
	ResultSet rs;
	PreparedStatement ps;
	int rows;
	Connection c=MyConnection.getConnection();
	EmployeeLogin el=new EmployeeLogin();

	@Override
	public boolean insertEmployeeLogin(EmployeeLogin el) {
		try
		{
			query="insert into EmployeeLogin values(?,?)";
			ps=c.prepareStatement(query);
			ps.setString(1, el.getUserName());
			ps.setString(2, el.getPassword());
			rows=ps.executeUpdate();
			if(rows>0)
			{
				return true;
			}
			else
			{
				return false;
			}
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public List<EmployeeLogin> showEmployeeLogin() {
		List<EmployeeLogin> elist=new ArrayList<>();
		try
		{
			query="select * from EmployeeLogin";
			ps=c.prepareStatement(query);
			rs=ps.executeQuery();
			while(rs.next())
			{
				EmployeeLogin el=new EmployeeLogin();
				el.setUserName(rs.getString(1));
				el.setPassword(rs.getString(2));
				elist.add(el);
			}
		}catch(Exception em)
		{
			em.printStackTrace();
		}
		return elist;
	}

	@Override
	public boolean employeeLogin(String username, String password) {
		try
		{
			query="select * from EmployeeLogin where UserName=? and Password=?";
			ps=c.prepareStatement(query);
			ps.setString(1, username);
			ps.setString(2, password);
			rs=ps.executeQuery();
			if(rs.next())
			{
				return true;
			}
			else
			{
				return false;
			}
		}catch(Exception em)
		{
			em.printStackTrace();
		}
		return false;
	}

}
