package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.DictionaryDao;
import com.model.Dictionary;

/**
 * Servlet implementation class DictionaryServlet
 */
@WebServlet("/DictionaryServlet")
public class DictionaryServlet extends HttpServlet {
	DictionaryDao ddao = new DictionaryDao();
	Dictionary d = new Dictionary();
	
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DictionaryServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		String type = request.getParameter("type");
		

		if (type.equals("add")) {
			String word = request.getParameter("word");
			String mean = request.getParameter("mean");
			Dictionary w = new Dictionary(word, mean);
			ddao.addWord(w);
			out.println("Added Successfully");
		}
		if (type.equals("search")) {
			String word = request.getParameter("word");
			d = ddao.searchWord(word);
			out.println(d);

		}
		if (type.equals("display")) {
		

			List dlist = new ArrayList();
			dlist = ddao.getDictionary();
			out.println(dlist);
		
		
			

		}
	}

}
