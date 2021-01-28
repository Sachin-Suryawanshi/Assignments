package com.thinkitive;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class Factorial extends TagSupport {
	private String message;


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	@Override
	public int doStartTag() throws JspException {
		JspWriter out=pageContext.getOut();
		int fact=1;
		try {
			for(int i=1;i<=Integer.parseInt(message);i++)
			{
				fact*=i;
			}
			out.println("Factorial of "+this.message+" is "+fact);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return super.doStartTag();
	}

}
