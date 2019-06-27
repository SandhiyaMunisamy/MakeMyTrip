package com.atmecs.Concepts;

public class InterfaceTest implements I1,I2 {
	public void m1() {
		System.out.println("Child class");
		System.out.println("i in i1 " +I1.i);
		System.out.println("i in i2 " +I2.i);
	}
	public static void main(String[] args) {
		InterfaceTest obj=new InterfaceTest();
		obj.m1();
	}

}
