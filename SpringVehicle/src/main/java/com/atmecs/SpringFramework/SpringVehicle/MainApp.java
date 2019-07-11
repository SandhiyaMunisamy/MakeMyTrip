package com.atmecs.SpringFramework.SpringVehicle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
	    ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		//AbstractApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml"); 
		Vehicle obj=(Vehicle)context.getBean("bike");
		obj.drive(); 
		//context.registerShutdownHook();
	}

}
