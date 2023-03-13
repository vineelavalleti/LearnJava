package com.vineela.learn;

public class EmployeeTest {

	public static void main(String[] args) {
	
		Employee e=new Employee();
		e.setId(10);
		e.setName("Vineela");
		e.setSal(10000);
		e.setBonus(1000);
		System.out.println(e.getId()+e.getName());
		
		Employee e1=new Employee();
		e1.setId(11);
		e1.setName("Deeskshita");
		e1.setSal(20000);
		e1.setBonus(2000);
		System.out.println(e1.getBonus());
		

	}

		
		
	
}
