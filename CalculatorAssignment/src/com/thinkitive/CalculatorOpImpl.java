package com.thinkitive;

public class CalculatorOpImpl implements CalculatorOp{

	@Override
	public double addition(int a, int b) {
		
		return a+b;
	}

	@Override
	public double substraction(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double multiplication(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double division(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

}
