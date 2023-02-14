package com.vineela.learn;

public class Condition {

	public static void main(String[] args) {
		System.out.println(x(6));
		System.out.println(x(2));
		
		int result = add(10,4,20);
		
		System.out.println(result);
		
		
	}
	

	public static int add(int a,int b, int c) {
		
		return a+b+c; 
	}
	
	public static String x(int n) {
		
		String day= "";

		if (n == 1)
			day="monday";
		else if (n == 2)
			day="tuesday";
		else if (n == 3)
			day="wednesday";
		else if (n == 4)
			day="thursday";
		else if (n == 5)
			day="friday";
		else if (n == 6)
			day="saturday";
		else
			day="sunday";
		
		return day;
		
	}
	
	

}
