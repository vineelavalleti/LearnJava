package com.vineela.test;
import com.vineela.exercises.*;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		int r = obj.add(3, 4);
		System.out.println(r);
		
		Calculator obj1 = new Calculator();
		int r1 = obj1.add(13, 4);
		System.out.println(r1);
		
		
		
			for (int i = 0; i < 7; i++) {			
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}

	}



	int num = 5;
 {
		
		System.out.println("Default Constructior");
		
	}

	

	public int add(int n1, int n2)
	{
		System.out.println(num);
		return n1+n2;

	}
}
