package com.vineela.inter;

public abstract class CalculatorBaseService {
	public  int add(int a , int b) {
		return a+b;
	}
	public  int sub(int a , int b) {
		return a-b;
	}
	public int mul(int a , int b) {
		return a*b;
	}
	public int div(int a , int b) {
		return a/b;
	}
	
	public abstract int sqrt(int a ) ;
	public abstract int powerOf(int a ) ;
}

class ScintificCalculatorService extends CalculatorBaseService{

	@Override
	public int sqrt(int a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int powerOf(int a) {
		// TODO Auto-generated method stub
		return 0;
	}

}
