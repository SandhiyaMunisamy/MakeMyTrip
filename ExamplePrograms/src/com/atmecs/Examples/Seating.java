package com.atmecs.Examples;

public interface Seating {
	public abstract void seater();
	public abstract void sleeper();
	public abstract void semisleeper();
}

class Compartment implements Seating{
	public void seater() {
		System.out.println("Seater booked");
	}
	public void semisleeper() {
		System.out.println("semi-sleeper booked");
	}
	public void sleeper() {
		System.out.println("sleeper booked");
	}
	
	public static void main(String[] args) {
		Seating s=new Compartment();
		s.seater();
	}
	
	
}
