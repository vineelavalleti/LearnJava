package com.vineela.learn;

class B
{
	public B()
	{
		System.out.println("Deekshita");
	}

	public B(int n)
	{
		super();
		System.out.println("in A int");
	}
}


class C extends B
{
	public C() 
	{
	super();
		System.out.println(" Vineela");
	}
	public C(int n)
	{
		this();
		System.out.println("in C int");
	}

}



public class SuperMethod {

	public static void main(String[] args) {
		C obj=new C(5);
	}

}
