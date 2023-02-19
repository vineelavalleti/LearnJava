package com.vineela.learn;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println(12345);
		System.out.println(0 > 5);
		
		
		Calculator  calcul = new Calculator();
		
		int addResult = calcul.add(10, 20);
		System.out.println("addResult == "+addResult);
		
		int subResult = calcul.sub(30, 17);
		
		int mulResult = calcul.mul(50, 4);
		
		String s = "Vineela";
		System.out.println("Lenght of S is : :"+s.length());
		
		
	
		System.out.println("subResult == "+subResult);
		System.out.println("mulResult == "+mulResult);

	}

}
