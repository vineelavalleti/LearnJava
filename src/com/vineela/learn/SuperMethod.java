package com.vineela.learn;

class B4
{
	public B4()
	{
		System.out.println("Deekshita");
	}

	public B4(int n)
	{
		super();
		System.out.println("in A int");
	}
}


class C extends B4
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
