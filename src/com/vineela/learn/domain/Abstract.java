package com.vineela.learn.domain;
abstract class Car{
	public abstract void drive();
		
	public abstract void fly();
	
	public void playMusic() {
		System.out.println("play music");
	}
}
abstract class WagonR extends Car{
	public void drive() {
		System.out.println("Driving");
	}
}
class updateWagonR extends WagonR{
	public void fly() {
		System.out.println("flying");
	}
}
public class Abstract {

	public static void main(String[] args) {
Car obj=new updateWagonR();
obj.drive();
obj.playMusic();
obj.fly();
	}

}
