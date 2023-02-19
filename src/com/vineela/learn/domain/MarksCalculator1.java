package com.vineela.learn.domain;

 class MarksCalculator1 {
	
	private int x =10;	
	public int y =20;
	
	public int total(int m1, int m2) {
		return m1+m2;
	}
	
	public void display() {
		
		System.out.println("Hello Marks Cals");
		
	}
	
	public String grade(int m1, int m2) {
		
		String grade = "FIRST";
		
		// Calc Grade 
		int totalmarks = total(m1,m2);
		
		return grade;
	}
	
	
	public String percentage(int m1, int m2) {
		
		String grade = "FIRST";
		
		// Calc Grade 
		int totalmarks = total(m1,m2);
		
		return grade;
	}
	
	
	

}
