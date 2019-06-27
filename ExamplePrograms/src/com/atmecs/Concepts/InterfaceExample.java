package com.atmecs.Concepts;

public class InterfaceExample implements Info{
	private String name;
public InterfaceExample(String name) {
		super();
		this.name = name;
	}
public void greet()
{
	System.out.println("Hello there");
}
@Override
public void showinfo() {
	System.out.println("Info2");
	
}
}
