package com.vineela.learn;
interface Key{
	int age=44;
	String area="Mumbai";
	void show();
	void config();
	
}
interface X{
	void run();
}
interface Y extends X{
	
}
class M implements Key,Y{
	public void show() {
		System.out.println("In Show");
	}
		
	
	public void config() {
		System.out.println("In config");
}
	public void run(){
		System.out.println("running");
	}
{
	
}
public class face {

	public static void main(String[] args) {
		
		Key obj;
		obj=new M();
		obj.show();
		obj.config();
		
		X obj1=new M();
		obj1.run();

	}
}
}


