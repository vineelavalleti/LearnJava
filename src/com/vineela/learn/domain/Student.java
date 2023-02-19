package com.vineela.learn.domain;

import com.vineela.test.Computer;

public class Student {
	
	public static void main(String[] args) {
		
		MarksCalculator marksCalc = new MarksCalculator();
		marksCalc.display();
		/**
		MarksCalculator marksCalc = new MarksCalculator();
		
		marksCalc.display();
		
		marksCalc.grade(10,20);
		 */
		
		Computer comp=new Computer();
		int totalPriceOfpens= comp.getPensCost(12, 5);
	
		if (totalPriceOfpens <100) {
			System.out.println("You are allowed to Order");
		} else {
			System.out.println("You are Not allowed to Order");
		}
		
		
		
		
		}
	
	
	
	
	private void addOfTwoNumbers(int x, int y){
		int result = 0;
		result = x+y;
		System.out.println(result);
	}
	
	

}

class MarksCalculator {
	
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
		System.out.println(totalmarks);
		return grade;
	}
	
	
	public String percentage(int m1, int m2) {
		
		String grade = "FIRST";
		
		// Calc Grade 
		int totalmarks = total(m1,m2);
		
		return grade;
	}
	
	
	

}