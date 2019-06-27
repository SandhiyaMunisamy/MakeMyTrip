package com.atmecs.BankingApplication;


import java.util.Scanner;

public class BankAccount {
	private int balance;
	private int previousTransaction;
	private String customerId;
	private String customerName;
	

	BankAccount(String cusName,String cusid){
		customerName=cusName;
		customerId=cusid;
	}
	
	void deposit(int amount) {
		if(amount!=0) {
		balance=balance+amount;
		previousTransaction=amount;
		}
	}
	void withdrawl(int amount) {
		if(amount!=0) {
		balance=balance-amount;
		previousTransaction=-amount;
		}
	}
	
	void getPrevoiusTransaction(){
		if(previousTransaction>0)
		System.out.println("You have deposited your amount" +previousTransaction);
		
		else if(previousTransaction<0) 
			System.out.println("you have withdrawn your amount" +Math.abs(previousTransaction));
			
			else
			
				System.out.println("No transaction occured");
			
		}
	void mainMenu() {
		char option ='\0';
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Welcome User "+customerName);
		System.out.println("Your customer Id is: " +customerId);
		System.out.println("\n");
		System.out.println("A.checkBalance");
		System.out.println("B.deposit amount");
		System.out.println("C.Withdraw amount");
		System.out.println("D.Previous Transaction");
		System.out.println("E.Exit");
		do{
			System.out.println("***********************");
			System.out.println("Enter an option");
			System.out.println("***********************");
			option=sc.next().charAt(0);
			System.out.println("\n");
			
		switch(option) {
		case 'A' :System.out.println("Balance:"+balance);
		          System.out.println("\n");
		          break;
		case 'B' :System.out.println("Enter an deposit amount:");
		          int amount=sc.nextInt();
		          deposit(amount);
		          System.out.println("\n");
		          break;
		case 'C' :System.out.println("Enter the withdrawl amount");
		          int amount1=sc.nextInt();
		          withdrawl(amount1);
		          System.out.println("\n");
		          break;
		case 'D' :getPrevoiusTransaction();
		          System.out.println("\n");
		          break;
		case 'E' :System.out.println("None");
		          break;
		default :System.out.println("Invalid option !!! please enter again");
		         break;
		         
			}
		
	}while(option!='E');
	
	}	
	
}
