package br.com.dev2me;

public class CalculatorImpl implements Calculator {

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int subtraction(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int multiplication(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int division(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	public boolean equalsIntergers(int a, int b) {
		// TODO Auto-generated method stub
		return a==b;
	}

}
