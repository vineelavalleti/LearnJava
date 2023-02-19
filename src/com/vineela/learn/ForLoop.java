package com.vineela.learn;

import java.util.ArrayList;
import java.util.List;

public class ForLoop {

	public static void main(String[] args) {
		List name1List = new ArrayList();
		
		name1List.add("Srinu");
		name1List.add("Vineela");
		name1List.add("Deekshita");
		name1List.add("Dinesh");
		
		
		List name2List = new ArrayList();
		name2List.add("SRINU");
		name2List.add("VINEELA");
		name2List.add("Deekshita");
		name2List.add("Dinesh");
		
		for (int i=0;i<name1List.size(); i++) {
			
			String name = name1List.get(i).toString();
			String name2 = name2List.get(i).toString();
			
			if (name.toLowerCase().equals(name2.toLowerCase())) {
				System.out.println("names are equal First name is : " + name +"LastName is : "+ name2);
			}
			
		}
		
	}

}
