package com.atmecs.Examples;

public class Class implements Seating {

	@Override
	public void seater() {
		System.out.println("seater booked");

	}

	@Override
	public void semiSleeper() {
		System.out.println("semiSleeper booked");

	}

	@Override
	public void sleeper() {
		System.out.println("Sleeper booked");

	}

}
