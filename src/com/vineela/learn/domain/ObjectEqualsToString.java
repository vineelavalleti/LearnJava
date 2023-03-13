package com.vineela.learn.domain;

import java.util.Objects;

class Laptop
{
	 String model;
	int price;
	public String toString(){
		return model+" : "+ price;
	}
	@Override
	public int hashCode() {
		return Objects.hash(model, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(model, other.model) && price == other.price;
	}
	
}
public class ObjectEqualsToString {

	public static void main(String[] args) {
	Laptop obj=new Laptop();
	obj.model="Lenovo Yoga";
	obj.price=1000;
	
	Laptop obj1=new Laptop();
	obj1.model="Lenovo Yoga";
	obj1.price=1000;
	
	boolean result=obj==obj1;
	System.out.println(result);
	
	}

}
