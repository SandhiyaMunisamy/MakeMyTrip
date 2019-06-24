package com.atmecs.javadoc;

/**
 * 
 * @author Sandhiya.Munisamy
 *
 */

/**
 * class which contains details of a particular user
 */
public class Student {
	/**
	 * Student name,rollno and studentid declared as private and can be accessed
	 * inside the sameclass
	 */

	private String StudentName;
	private int StudentRollNo;
	private int StudentId;

	/**
	 * 
	 * @return student Name
	 */

	public String getStudentName() {

		return StudentName;

	}

	/**
	 * 
	 * @param studentName
	 */
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	/**
	 * 
	 * @return StudentRollNo
	 */

	public int getStudentRollNo() {
		return StudentRollNo;
	}

	public void setStudentRollNo(int studentRollNo) {
		StudentRollNo = studentRollNo;
	}

	/**
	 * 
	 * @return StudentId
	 */

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	

}