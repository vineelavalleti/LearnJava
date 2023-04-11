package com.vineela;

enum status{
	good,average,failed;
}
public class annum {

	public static void main(String[] args) {
		status []t=status.values();
		
		for(status s:t)
		System.out.println(s);

	}

}
