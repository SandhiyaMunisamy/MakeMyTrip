package com.atmecs.Random;

class A{
	int num1=8;
	static int num2=6;
}

public class StaticAndNonStatic {
	public static void main(String[] args) {
		
		A s=new A();
		System.out.println(	s.num1);
		System.out.println(	A.num2);
	}

}
