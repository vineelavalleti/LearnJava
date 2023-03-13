package com.vineela.learn;

public class Calculator {
	public int add(int x,int y) {
		
		return x + y;
	}
	public int sub(int a,int b) {
		
		return a-b;
	}
}
class AdvancedCalculator extends Calculator{
	public int mul (int x1,int y1) {
		return x1*y1;
		}
	public int div(int a1,int b1) {
		return a1/b1;
	}
	
	
}
class SuperAdvanced extends AdvancedCalculator{
	public void sqrt() {
	System.out.println("SQUARE");
	}
}
class NewSuperAdvanced extends SuperAdvanced{
	public void tan() {
		System.out.println("TAN");
	}
}