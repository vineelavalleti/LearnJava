package com.vineela.learn.domain;

abstract class Anon {

	public abstract void show() ;
	public abstract void config() ;	
	}


public class Anonumus {

	public static void main(String[] arg) {
		Anon obj=new Anon() {
		public void show() {
			System.out.println("In new A");
		}
		public void config() {
			System.out.println("In A config");
		}
		};
		obj.show();
		obj.config();
	}	

}
