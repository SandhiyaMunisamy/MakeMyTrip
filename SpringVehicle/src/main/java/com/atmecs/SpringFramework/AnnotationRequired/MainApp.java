package com.atmecs.SpringFramework.AnnotationRequired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
		   public static void main(String[] args) {
		      ApplicationContext context = new ClassPathXmlApplicationContext("com\\atmecs\\SpringFramework\\AnnotationRequired\\EmployeeSpring.xml");
		      Employee emp = (Employee)context.getBean("employee");
		      System.out.println("Employee Name : " +emp.getName() );
		      System.out.println("Employee Id : " +emp.getid() );
		       System.out.println("Age : " +emp.getAge() );
		     
		   }

}
