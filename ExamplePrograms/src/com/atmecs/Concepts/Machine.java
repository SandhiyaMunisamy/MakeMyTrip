package com.atmecs.Concepts;

public class Machine implements Info{
	private int id=7;
public void start() {
	System.out.println("Machine Started");
}
@Override
public void showinfo() {
	System.out.println("Info1");
	
}
}
