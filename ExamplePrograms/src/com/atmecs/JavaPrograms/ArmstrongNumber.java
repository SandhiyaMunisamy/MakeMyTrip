package com.atmecs.JavaPrograms;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the number:");
    	int num=sc.nextInt();
    	int copy=num;
    	int sum=0;
    	while(num>0)
    	{
    		int t=num%10;
    		sum=sum+(t*t*t);
    		num=num/10;
    	}
    	if(copy==sum)
    		System.out.println("Armstrong number");
    	else
    		System.out.println("Not Armstrong number");
}
}
