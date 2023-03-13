package com.vineela.test;

public class MultiDimontional {

	public static void main(String[] args) {
		
	int muldyarray1[][] = {
								{1,2,3}, 
								{3,4,5} , 
								{5,6,7}
								
							};
		
		
	int[] firstRow={1,2,3};
		int secondRow[]={3,4,5};
		int thirdRow[]={5,6,7};
		
		muldyarray1[0] = firstRow;
		muldyarray1[1] = secondRow;
		muldyarray1[2] = thirdRow;
		
		for (int[] rowTemp :muldyarray1) {
			for (int temp :rowTemp) {
				System.out.print(temp+ " " );
			}
			System.out.println();
		}
		
		int singarray[] = new int[3];
		singarray[0] =1;
		singarray[1] =2;
		singarray[2] =3;
		
		
		for(int value : singarray) {
			System.out.println("Single Dyn Array Values ="+value);
		}
		
		
	//	String s[] = {"Srinu","Vineela","hhhhh","kkkkkkk"};
		String s[] = new String[4];
		s[0]="Srinu";
		s[1]="Vineela";
		s[2]="hhhhhh";
		s[3]="kkkkkkk";
		
		int singarray1[] = {4,5,6};
		
		int x=4;
		int y=5;
		int z=6;
		//int singarray1[] =  new int[3];
		singarray1[0] =x;
		singarray1[1] =y;
		singarray1[2] =z;
		
		
		for(int value : singarray1) {
			System.out.println("Single Dyn Array1 Values ="+value);
		}
		
		
		
		int muldyarray[][] = new int[3][2];
		muldyarray[0][0] = 1;
		muldyarray[0][1] = 2;
		
		muldyarray[1][0] = 3;
		muldyarray[1][1] = 4;
		
		muldyarray[2][0] = 5;
		muldyarray[2][1] = 6;
		
	
		
		/**
		for(int i =0; i<20; i++) {
			double randomValue = Math.random();
			System.out.println((int)(randomValue*100));
		}*/


	}

}
