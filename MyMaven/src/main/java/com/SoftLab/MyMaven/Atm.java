package com.SoftLab.MyMaven;

public class Atm {
	
	public int card() {
		return 234534567;
	}
	
	public String name() {
	return"Sandhiya";
	}
	public static void main(String[] args) {
		Atm deposit=new Atm();
		System.out.println(deposit.card());
		System.out.println(deposit.name());
	}

}
