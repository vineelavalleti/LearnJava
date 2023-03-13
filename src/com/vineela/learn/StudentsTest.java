package com.vineela.learn;

public class StudentsTest {

	public static void main(String[] args) {
		Students s=new Students();
			s.setId(1);
			System.out.println(s.getId());
		s.setSchool("CreekView");
		System.out.println(s.getSchool());
		System.out.println(s.getId()+s.getName());
	}

}
