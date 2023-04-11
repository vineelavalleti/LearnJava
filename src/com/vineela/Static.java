package com.vineela;
enum Colors{
	red,green,blue,orange;
}
public class Static {

	public static void main(String[] args) {
		
Colors c=Colors.orange;
System.out.println(c.getClass().getSuperclass());

switch(c)
{
case red:
	System.out.println("Stop");
break;
case green:
	System.out.println("Tree");
	break;
case blue:
	System.out.println("Sea");
	break;
	default:
		System.out.println("Sun");
		
}
	}

}
