package com.atmecs.JavaPrograms;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the number:");
    	int num=sc.nextInt();
    	int i=2;
    	while(i<=num/2)
    	{
    		if(num%i==0)
    		{
    			break;
    		}
    		i++;
    	}
    	if(i>num/2)
    	{
    		System.out.println("prime");
    	}
    	else
    	{
    		System.out.println("Not prime");
    	}
}
}
