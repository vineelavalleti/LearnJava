package com.vineela.learn;
class A1{
	public void show() {
		System.out.println("In A Show");
	}
	public void config() {
		System.out.println("In A Config");
	}
}
class B1 extends A1{
	public void show() {
		System.out.println("In B show");
	}
}
public class OverRiding {

	public static void main(String[] args) {
	B1 obj=new B1();
	obj.show();
	obj.config();			}
			}
		
	


