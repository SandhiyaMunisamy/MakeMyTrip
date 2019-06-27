package com.atmecs.SpringFramework.SpringVehicle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
	    ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		Vehicle obj=(Vehicle)context.getBean("vehicle");
		obj.drive(); 
	}

}
