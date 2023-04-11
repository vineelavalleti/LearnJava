package com.vineela;

public class OverWriteFunctions {

	public static void main(String[] args) {
		A a = new A();
		a.display();

	}

}

class A {
	public void display() {
		System.out.println("A display new meethd");
	}
}

class B extends A {

	@Override
	public void display() {
		System.out.println("B display new meethd");
	}

}

class C extends A {

	@Override
	public void display() {
		System.out.println("C display new meethd");
	}

}
