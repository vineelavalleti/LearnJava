package com.vineela.learn.domain;
class Ant{
	int age;
	public void show() {
	System.out.println("In Show");	
	}
	static class B{
		public void config() {
			System.out.println("In Config");
		}
	}
}
public class Inner {

	public static void main(String[] args) {
	Ant obj=new Ant();
	//obj.age();
	obj.show();
	
	Ant.B obj1=new Ant.B();
	obj1.config();
	}

}
