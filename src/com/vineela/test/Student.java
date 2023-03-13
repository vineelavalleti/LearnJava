package com.vineela.test;

public class Student {
	public static String colleageName = "JB College";
	private static int rollNo;
	private String name;
	private int englishmarks;
	private int mathsMarks;
	private int sciencemarks;

	public Student() {
		System.out.println("Student Empty Constructor");
	}

	public Student(int inputRollNo, String inputname) {
		this.rollNo = inputRollNo;
		this.name = inputname;
		
	}
	public Student(int inputRollNo, String inputname, int englishmarks,
			int mathsMarks, int sciencemarks) {

		this.rollNo = inputRollNo;
		this.name = inputname;
		this.englishmarks=englishmarks;
		this.mathsMarks= mathsMarks;
		this.sciencemarks= sciencemarks;

	}

	public int totalMarksCalc() {
		int totalMarks = this.englishmarks + this.mathsMarks + this.sciencemarks;
		return totalMarks;
	}
	public String grade() {
		int totalMarks = totalMarksCalc();
		if (totalMarks >100) {
			return "FIRST";
		} else if (totalMarks >50) {
			return "SECOND";
		} else {
			return "THIRD";
		}
		
	}
	

	public static String getColleageName() {
		return colleageName;
	}

	public static void setColleageName(String colleageName) {
		Student.colleageName = colleageName;
	}

	public static int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnglishmarks() {
		return englishmarks;
	}

	public void setEnglishmarks(int englishmarks) {
		this.englishmarks = englishmarks;
	}

	public int getMathsMarks() {
		return mathsMarks;
	}

	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}

	public int getSciencemarks() {
		return sciencemarks;
	}

	public void setSciencemarks(int sciencemarks) {
		this.sciencemarks = sciencemarks;
	}

}
