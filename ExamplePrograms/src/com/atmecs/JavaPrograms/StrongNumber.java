package com.atmecs.JavaPrograms;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the number:");
    	int num=sc.nextInt();
    	int copy=num;
    	int sum=0;
    	while(num>0)
    	{
    		int t=num%10;
    		int fact=1;
    		while(t>0)
    		{
    			fact=fact*t;
    			t--;
    		}
    		sum=sum+fact;
    		num=num/10;
    	}
    	if(copy==sum)
    		System.out.println("Strong number");
    	else
    		System.out.println("Not Strong number");
	}
}
