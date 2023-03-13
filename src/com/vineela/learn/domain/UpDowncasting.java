package com.vineela.learn.domain;
class A{
	public void show1() {
		System.out.println("In A Show");
	}
	
}
class B extends A{
	public void show2() {
		System.out.println("In B show");
	}
	
}
public class UpDowncasting {

	public static void main(String[] args) {
		//double d=4.5;
		//int i=(int)d;
//System.out.println(i);
		
		A obj=new B();
		obj.show1();
		
		
		B obj1=(B) obj;
		obj1.show2();
		
	}

}
