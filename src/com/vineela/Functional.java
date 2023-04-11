package com.vineela;

interface inter {

	int add (int i,int j);
}


public class Functional
{

	public static void main(String[] args) {
		      	
		    		inter in=(i,j) -> i+j;
		    
		    				int result=in.add(5, 4);
		    				System.out.println(result);
		    	
		    	  }
		   
		     
	

}
