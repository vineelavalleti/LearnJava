package com.vineela.learn.domain;
class Calc{
	public final void show() {
		System.out.println("Vineela");
	}
	public void add(int a,int b) {
	System.out.println(a+b);	
	}
}
class AdvCalc extends Calc{
	public void show() {
		System.out.println("valleti");
	}
}
public class FinalVariable {

	public static void main(String[] args) {
		
	Calc obj=new Calc();
	obj.add(5, 4);
	obj.show();
	}

}
