package com.vineela.learn;

public class MethodsTest {

	public static void main(String[] args) {

		goodMorning();
		
		MethodsTest m=new MethodsTest();
			int result	=m.add();
				System.out.println(result);

	System.out.println(result=MethodsTest.sub());

				
	}
	public static void goodMorning(){
			
	System.out.println("Good Morning Vineela");
	}
	
 public int add(){
	 int a=10;
	 int b=10;
	int result=a+b;
	return result;
	 }
 public static int sub(){
	 int a=10;
	 int b=5;
	int result=a-b;
	return result;
	 }
	
}

