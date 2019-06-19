package com.SoftLab.MyMaven;

import java.util.Scanner;

public class BasePower {
	public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the base:");
    	int base=sc.nextInt();
    	System.out.println("Enter the Power:");
    	int power=sc.nextInt();
    	int res=1;
    	while(power>0)
    	{
    		res=res*base;
    		power--;
    	}
    	System.out.println("Base Power:" +res);
sc.close();
}

}
