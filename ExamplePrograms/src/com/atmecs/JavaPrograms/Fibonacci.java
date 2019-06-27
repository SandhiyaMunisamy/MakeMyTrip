package com.atmecs.JavaPrograms;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the number:");
    	int n=sc.nextInt();
    	int fib1=0;
    	int fib2=1;
    	int fib3=fib1+fib2;
    	while(n>0)
    	{
    		System.out.println(fib1);
    		fib1=fib2;
    		fib2=fib3;
    		fib3=fib1+fib2;
    		n--;
    	}

}
}
