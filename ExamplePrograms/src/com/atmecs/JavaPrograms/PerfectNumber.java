package com.atmecs.JavaPrograms;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the number:");
    	int num=sc.nextInt();
    	int sum=0;
    	int i=1;
    	while(i<=num/2)
    	{
    		if(num%i==0)
    		{
    			sum=sum+i;
    		}
    		i++;
    	}
    	if(sum==num)
    		System.out.println("Perfect");
    	else
    		System.out.println("Not Perfect");
}
}
