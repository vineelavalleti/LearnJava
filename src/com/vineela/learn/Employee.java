package com.vineela.learn;

public class Employee {
	int id;
	String name;
	
	public Employee getEmployeeData() {
		// Call DB and get Employee data 
		Employee e = new Employee();
		e.id = 100;
		e.name="Srinu";
		
		return e;
		
	}

}
