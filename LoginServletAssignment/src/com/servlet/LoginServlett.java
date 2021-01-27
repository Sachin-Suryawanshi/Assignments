package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmployeeLoginDaoImpl;

/**
 * Servlet implementation class LoginServlett
 */
@WebServlet("/LoginServlett")
public class LoginServlett extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmployeeLoginDaoImpl edao=new EmployeeLoginDaoImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlett() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		RequestDispatcher rd;
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		boolean result=edao.employeeLogin(username, password);
		if(result==true)
		{
			response.sendRedirect("Welcome.html");
		}
		else
		{
			out.println("Login Failed!!!!! Try Again...");
			rd= request.getRequestDispatcher("LogIn.html");
			rd.include(request, response);
		}
		
	}

}
