package com.vineela;

public class ExceptionHandlng {

	public static void main(String[] args) throws Exception  {
		System.out.println("Method Starts ");
		try {
			withdraw(100, 1234);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		int a =10;
		int b=5;
		
		division(a,b);
		
		String s = "hhhh";
		try {
			//DB Connection 
			int stringLength = s.length();
			
			System.out.println("String lenth is : " + stringLength);
			int[] iArray = {10,20,30};
			
			for (int i=0; i<=2; i++) {
				System.out.println("Array Value : :"+ iArray[i]);
			}
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
				
		System.out.println("Method End ");
	}

	
	public static void division(int a , int b) throws Exception {
		
		int divRes = 0;
		
		divRes= a/b;
		
		System.out.println("Division Result : "+ divRes);
		
	}
	
	public static void withdraw(int reQuestedMoney, int accountNo) throws Exception {
		int balance = getbalance(accountNo);
		
			if (reQuestedMoney > balance) {

 new Exception("Insufficent Balance Exception");
				
			}
			System.out.println("You have enpugh balance so take the monry ");
			
		
	}
	
	public static int getbalance(int accountNo) {
		//call DB and get balance
		return 20;
	}

}
