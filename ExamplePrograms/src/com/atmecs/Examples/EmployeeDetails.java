package com.atmecs.Examples;
import java.util.logging.Logger;
public class EmployeeDetails {
	private static Logger logger = Logger.getLogger("InfoLogging");
	public String name="sandhiya";
	private int empno=20;
	protected void working() {
		logger.info("working");
		}
	public static void meeting() {
		logger.info("Go for meeting");
	}
public static void main(String args[]){  
	  EmployeeDetails e=new EmployeeDetails();
	  logger.info(e.name);
	  System.out.println(e.empno);
	  e.working();
	  EmployeeDetails.meeting();
}
}
