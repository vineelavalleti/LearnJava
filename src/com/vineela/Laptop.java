package com.vineela;

enum Computer {
	Macbook(2000),Dell,Surface(1500), Thinkpad(1800);

	private int price;

	private Computer() {
		this.price = 500;
	}

	private Computer(int price) {
		this.price = price;
		System.out.println(this.name());
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}

public class Laptop {

	public static void main(String[] args) {
		// Computer lap=Computer.Macbook;
		// System.out.println(lap+":"+lap.getPrice());
		for (Computer lap : Computer.values()) {
			System.out.println(lap + ":" + lap.getPrice());
		}

	}

}
