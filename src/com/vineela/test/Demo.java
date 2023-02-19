package com.vineela.test;

public class Demo {

	public static void main(String[] args) {

		Computer obj = new Computer();

		obj.playMusic();

		String penStaus = obj.getMeAPens(18);

		System.out.println(penStaus);
	}

}
