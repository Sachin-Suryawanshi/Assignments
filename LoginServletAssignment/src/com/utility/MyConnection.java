package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
	public static Connection getConnection()
	{
		{
			Connection c=null;
			try {
				Class.forName("com.mysql.jdbc.Driver");	
				c=DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeDetails","root","sachin");

			} catch (Exception e) {
			
				e.printStackTrace();
			}
			return c;
		}
		}

}
