package com.vineela.test;

public class Students {
	public String getgrade(int a, int b) {
		
		int total = getTotal(a,b);
		String grade = "";
		if (total > 100)
			grade = "First";
		else
			grade = "Second";
		return grade;

	}
	
	public int getTotal(int a, int b) {
		return a+b;
		
	}
}
