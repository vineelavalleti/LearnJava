package com.vineela.learn;
class A{
public void show() {
	System.out.println("In a show");
}
}
class B extends A{
	public void show() {
		System.out.println("In b show");
	}
}
class c extends A{
	public void show() {
		System.out.println("In c show");
	}
	
}

public class PolyMorphism {

	public static void main(String[] args) {
		
	A obj=new A();
	obj.show();
		
		obj=new B();
		obj.show();
		
		obj=new c();
		obj.show();
		}

}
