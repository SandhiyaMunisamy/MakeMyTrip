package com.atmecs.javadoc;

public class StudentDetails {
	public static void main(String[] args) {
		Student stud = new Student();
		stud.setStudentName("Abirami");
		stud.setStudentRollNo(4);
		stud.setStudentId(12345);
		System.out.println("Student Name:" + stud.getStudentName());
		System.out.println("Student Name:" + stud.getStudentRollNo());
		System.out.println("Student Name:" + stud.getStudentId());

	}
}
