package com.vineela.learn;

public class Names {

	public static void main(String[] args) {
	
	Mobile obj1 = new Mobile();
		obj1.brand = "apple";
		obj1.price = 500;
		obj1.name = "SmartPhone";

		Mobile obj2 = new Mobile();
		obj2.brand = "Samsung";
		obj2.price = 400;
		obj2.name = "SmartPhone";
		obj1.show();

		obj2.show();

		/*
		 * String name = "Vineela";
		 * 
		 * System.out.println(name.concat("Valleti"));
		 * 
		 * name = name + "Valleti"; System.out.println("Good Afternoon" + " " + name);
		 * 
		 * String n1 = "Vineela"; String n2 = "Vineela"; System.out.println(n1 == n2);
		 * StringBuffer sb = new StringBuffer("Vineela"); sb.append("Valleti");
		 * sb.deleteCharAt(2); sb.insert(2, "n"); System.out.println(sb);
		 */

	}

}

class Mobile {
	String brand;
	int price;
	String name;

	public void show() {
		System.out.println(brand + ":" + price + ":" + name);
	}
	
		
	
	}
	

