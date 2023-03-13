package com.vineela.test;

public class StudentTest {
	
	public StudentTest() {
		
	}

	public static void main(String[] args) {
		
		
		/**Student s1 = new Student();
		s1.setRollNo(100);
		s1.setName("Srinu");
		s1.setEnglishmarks(40);
		s1.setMathsMarks(80);
		s1.setSciencemarks(60);*/
		
		Student s1 = new Student(100,"Srinu");
		Student s2 = new Student();
		

		System.out.println(Student.getRollNo());
		/**
		Student s2 = new Student();
		s2.setRollNo(101);
		s2.setName("Vineela");
		s2.setEnglishmarks(90);
		s2.setMathsMarks(60);
		s2.setSciencemarks(70);
		
		Student s3 = new Student();
		
		Student[] students = new Student[2];
		students[0] = s1;
		students[1] = s2;
		
		for (Student stu : students) {
			System.out.println("Student RollNo: "+ stu.getRollNo());
			System.out.println("Student RollNo: "+ stu.getName());
			System.out.println("Student Colleage: "+ stu.getColleageName());
		}*/
		
		
	}

}
