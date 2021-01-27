package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmployeeLoginDaoImpl;
import com.pojo.EmployeeLogin;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmployeeLoginDaoImpl edao=new EmployeeLoginDaoImpl();
	EmployeeLogin el=new EmployeeLogin();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		List<EmployeeLogin> elist=edao.showEmployeeLogin();
		out.println(elist);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String userName=request.getParameter("username");
		String pass=request.getParameter("password");
		el=new EmployeeLogin(userName,pass);
		boolean result=edao.insertEmployeeLogin(el);
		if(result==true)
		{
			out.println("Added Successfully");
		}
		else
		{
			out.println("Not Added");
		}
		
	}

}
