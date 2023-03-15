package com.vineela.learn;


class A5{
	public A5() 
	{
		System.out.println("object created");
	}
	public void show() {
		System.out.println("In a show");
	}
}


public class Super {

	public static void main(String[] args) {
		new A5().show();
		new A5().show();
	}

}

