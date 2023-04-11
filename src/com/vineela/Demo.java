package com.vineela;
enum states{
	Texas,Flourida,Georgia,california;
}
public class Demo {

	public static void main(String[] args) {
	
		states s=states.Texas;
		
		if(s==states.california)
			System.out.println("CA");
		else if(s==states.Flourida)
			System.out.println("FL");
		else if(s==states.Georgia)
	System.out.println("GA");
		else
	System.out.println("TX");
	}

}
