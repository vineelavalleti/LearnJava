package com.vineela.learn;
interface Computer{
	void code();
}
class Laptop implements Computer{
	public void code()
	{
		System.out.println("code,compiler");
	}
}
class Desktop implements Computer{
	public void code() {
		System.out.println("code,compile,run");
	}
	
}
class Developer{
	public void  devapp(Computer lap) {
		lap.code();
	}
}

public class Demo{
	public static void main(String a[]) {
		Computer lap=new Laptop();
		Computer desk=new Desktop();
		
		Developer vineela=new Developer();
		vineela.devapp(lap);

}
}
