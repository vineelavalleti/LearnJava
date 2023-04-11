package com.vineela.learn;

public class ExceptionTest {

	public static void main(String[] args) {
		int i = 0;
		int j = 9;

		int num[]= {
				
				
			};
		
		
		try {

			j = 18 / i;
			System.out.println(num[1]);
		} catch (ArithmeticException e) {
			System.out.println("Divide By Zero is not possible please check the inut numners");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("You can not give high index " );
		} 

		System.out.println(j);
		System.out.println("HI");
	}

}
