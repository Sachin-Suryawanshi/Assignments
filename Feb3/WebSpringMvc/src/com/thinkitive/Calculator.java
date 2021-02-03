package com.thinkitive;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
	public double addition(int a,int b)
	{
		return a+b;
	}
	public double sub(int a,int b)
	{
		return a-b;
	}
	public double mul(int a,int b)
	{
		return a*b;
	}
	public double div(int a,int b)
	{
		return a/b;
	}

}
