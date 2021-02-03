package com.thinkitive;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyClass {
  
	@Autowired
	Calculator cal; 
	
	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public ModelAndView hello(String username, String password) {
		System.out.println("Hello world");
		System.out.println(username);
		System.out.println(password);
		ModelAndView model = new ModelAndView();
		if (username.equals("admin") && password.equals("admin")) {
			model.addObject("message", "You have login Successfuuly");
			model.setViewName("welcome.jsp");
		} else {
			model.addObject("message", "your username or password is wrong ");
			model.setViewName("welcome.jsp");
		}
		return model;
	}

	@RequestMapping(value = "/hi", method = RequestMethod.POST)
	public ModelAndView bye(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Hello world");
		String user = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(user);
		System.out.println(password);
		ModelAndView model = new ModelAndView();
		model.addObject("message", "This is simple data");
		model.setViewName("welcome.jsp");

		return model;
	}
	@RequestMapping(value = "/add")
	public ModelAndView myadd(Integer a, Integer b, String type) {
		ModelAndView model = new ModelAndView();
		if(type.equals("add"))
		{
		model.setViewName("welcome.jsp");
		model.addObject("message","Answer is:"+cal.addition(a, b));
		}
		if(type.equals("sub"))
		{
		model.setViewName("welcome.jsp");
		model.addObject("message","Answer is:"+cal.sub(a, b));
		}
		if(type.equals("mul"))
		{
		model.setViewName("welcome.jsp");
		model.addObject("message","Answer is:"+cal.mul(a, b));
		}
		if(type.equals("div"))
		{
		model.setViewName("welcome.jsp");
		model.addObject("message","Answer is:"+cal.div(a, b));
		}
		return model;

	}

}
