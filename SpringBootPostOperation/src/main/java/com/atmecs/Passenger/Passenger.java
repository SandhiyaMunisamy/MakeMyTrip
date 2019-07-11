package com.atmecs.Passenger;

public class Passenger {
	
	
	private String PassengerName;
	private int age;
	private String departFrom;
	private String arriveAt;
	
	public Passenger() {
		
	}
	
	public Passenger(String PassengerName,int age, String departFrom, String arriveAt) {
		this.PassengerName = PassengerName;
		this.age = age;
		this.departFrom = departFrom;
		this.arriveAt = arriveAt;
	}
	public String getPassengerName() {
		return PassengerName;
	}

	public void setPassengerName(String PassengerName) {
		this.PassengerName = PassengerName;
	}

	public int getage() {
		return age;
	}

	public void setage(int age) {
		this.age = age;
	}
	
	public String getdepartFrom() {
		return departFrom;
	}

	public void setdepartFrom(String departFrom) {
		this.departFrom = departFrom;
	}

	public String getarriveAt() {
		return arriveAt;
	}

	public void setarriveAt(String arriveAt) {
		this.arriveAt = arriveAt;
	}
	
}
