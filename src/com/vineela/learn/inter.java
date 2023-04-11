package com.vineela.learn;
interface Deekshi{
	void show();
	void config();
	
}
class Dinu implements Deekshi{
	public void show() {
		System.out.println("In Show");
	}
	public void config() {
		System.out.println("In Config");
	}
}
public class inter {

	public static void main(String[] args) {
	Deekshi obj;
	obj=new Dinu();
	obj.show();
	obj.config();

	}

}
