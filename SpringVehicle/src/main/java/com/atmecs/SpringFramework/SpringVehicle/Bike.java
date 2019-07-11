package com.atmecs.SpringFramework.SpringVehicle;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	public void drive() {
		System.out.println("Its moving");
	}

}
