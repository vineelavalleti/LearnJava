package com.vineela.learn;

public class Employee {
	
	private int id;
	private String name;
	private int sal;
	private int bonus;
	
	
	
	public Employee() {
		
	}

	public Employee(int id, String name, int sal, int bonus) {
		
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.bonus = bonus;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	
	
}