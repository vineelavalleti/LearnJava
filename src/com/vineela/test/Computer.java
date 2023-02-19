package com.vineela.test;

public class Computer {
	public void playMusic() {
		System.out.println("Music Playing");
	}

	public String getMeAPens(int cost) {
		if (cost > 10)
			return "PEN";
		else
			return "PENCIL";
	}

	public int getPensCost(int cost, int quantity) {
		return cost * quantity;
	}
	
	public int getComputer(int cost, int quantity) {
		return cost * quantity;
	}
}
