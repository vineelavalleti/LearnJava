package com.vineela.learn;

import java.util.ArrayList;

import com.vineela.test.Student;

public class TestCollections {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList();
		
		
		list.add("Srinu");
		list.add("Vineela");
		
		boolean b = true;
		Boolean b1 = true;
		
		
		ArrayList<Integer> intList = new ArrayList();
		
		intList.add(10) 
	
		
		Student s1 = new Student(1,"Srinu", 30,40,50);
	
		
		for (Object a :list) {
			System.out.println(a);
		}
		
		/**
		Student[] students  = getSomeSampleStudents();
		for (Student student : students) {
			if (student != null) {
				System.out.println("student name =="+student.getName());
			} else {
				System.out.println("student name is null");
			}
			
		}*/
		
		
	}
	
	
	public static Student getStudent() {
		return new Student(1,"Srinu", 30,40,50);
	}
	
	public static Student[] getSomeSampleStudents() {
		Student[] students = new Student[3];
		
		Student s1 = new Student(1,"Srinu", 30,40,50);
		Student s2 = new Student(2,"Vineela", 70,80,90);
		Student s3 = new Student(2,"Vineela", 70,80,90);
		
		students[0]=s1;
		students[1]=s2;
		students[2]=s3;	
		return students;
	}
	
	public static ArrayList getSomeSampleStudentsFromCollection() {
		ArrayList students = new ArrayList();
		
		Student s1 = new Student(1,"Srinu", 30,40,50);
		Student s2 = new Student(2,"Vineela", 70,80,90);
		Student s3 = new Student(2,"Vineela", 70,80,90);
		Student s4 = new Student(2,"Vineela", 70,80,90);
		
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		
		return students;
	}
	
	
}
