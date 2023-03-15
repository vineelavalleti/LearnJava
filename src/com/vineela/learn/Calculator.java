package com.vineela.learn;

public class Calculator {
	int a=0;
	int b=0;
	public Calculator() {
		
	}
	public Calculator(int a , int b) {
		this.a = a;
		this.b=b;
	}
	
	public int totalMarks(Marks m) {
		return m.getEnglish() + m.getMaths() + m.getScience();
	}
	
	public int somemethod(String s) {
		return 10;
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();
		Marks m = new Marks(70,60,80);
		System.out.println("Englih"+ m.getEnglish());
		
		int toalMarks = c.totalMarks(m);
		System.out.println("toalMarks = "+ toalMarks);
		
		c.somemethod("20");
		
	}
	
}


class Marks {
	int english;
	int maths;
	int science;
	public Marks(int e, int m, int s) {
		this.english=e;
		this.maths=m;
		this.science=s;
		
		
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	
	
	
	
}