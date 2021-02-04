package com.thinkitive.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.thinkitive.dao.DictionaryDao;
import com.thinkitive.dao.EmployeeDaoImpl;
import com.thinkitive.dao.EmployeeHDao;
import com.thinkitive.model.Dictionary;
import com.thinkitive.model.Employee;

@Controller
public class HomeController {

	/*
	 * @Autowired Employee e;
	 * 
	 * @Autowired EmployeeHDao hdao;
	 * 
	 * @Autowired EmployeeDaoImpl edao;
	 * 
	 * @RequestMapping(value="/") public ModelAndView test(HttpServletResponse
	 * response) throws IOException{ return new ModelAndView("home"); }
	 * 
	 * @RequestMapping(value = "/add") public ModelAndView addEmployee(Integer
	 * empId,String ename,Integer salary,String type) { ModelAndView model=new
	 * ModelAndView(); e.setEmpId(empId); e.setSalary(salary); e.setEmpName(ename);
	 * if(type.equals("add")) {
	 * 
	 * hdao.addEmployee(e);
	 * 
	 * model.addObject("message","Employee added successfully");
	 * model.setViewName("success.jsp");
	 * 
	 * } else if(type.equals("search")) { e=edao.searchEmployee(empId);
	 * model.addObject("employee",e); model.setViewName("NewFile.jsp");
	 * 
	 * } return model; }
	 */

	DictionaryDao ddao = new DictionaryDao();

	@Autowired
	Dictionary d;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView addDictionary(String username, String password, String log) {
		ModelAndView model = new ModelAndView();
		if (log.equals("admin")) {

			if (username.equals("admin") && password.equals("admin")) {
				model.addObject("admin", username);
				model.setViewName("addword.jsp");
			}
		} else {
			model.setViewName("addword.jsp");
		}
		return model;
	}

	@RequestMapping(value = "/adddct", method = RequestMethod.GET)
	public ModelAndView inserWord(String word, String meaning) {
		ModelAndView model = new ModelAndView();
		d = new Dictionary(word, meaning);
		ddao.insertWord(d);
		model.addObject("message", "Word added successfully");
		model.setViewName("DtHome.jsp");
		return model;
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ModelAndView searchWord(String w) {
		Dictionary d = ddao.searchDictionary(w);
		System.out.println(d);
		ModelAndView model = new ModelAndView();
		model.addObject("word", d);
		model.setViewName("show.jsp");
		return model;
	}

	@RequestMapping(value = "/showall", method = RequestMethod.GET)
	public ModelAndView showAll() {
List<Dictionary> dlist=ddao.getall();
		ModelAndView model = new ModelAndView();
		model.addObject("dlist", dlist);
		model.setViewName("showall.jsp");
		return model;
	}
}
