package com.atmecs.Collection.CollectionFramework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Car {
	private String vehicleModel;
	private int price;
	private int Tax;
	private int year;
	public static  int totalprice;
	private String CustomerFirstName;
	private String CustomerLastName;
	public Scanner sc = new Scanner(System.in);
	List<String> list=new ArrayList<String>();
	Vector<Integer> list1=new Vector<Integer>();

	
	
	Car(String Fname, String Lname) {
		CustomerFirstName = Fname;
		CustomerLastName = Lname;

	}
	

	public void vehicleDetails() {
		
		System.out.println("Enter the vehicle model:");
		try {
			list.add( sc.next());

			System.out.println("Enter the Price:");
			list1.add( sc.nextInt());
           
			System.out.println("Enter the Tax:");
			list1.add( sc.nextInt());

			System.out.println("Enter the year:");
			list1.add( sc.nextInt());

		} catch (InputMismatchException e) {
			System.out.println("\tInvalid input entered. Please enter the specified input");
		}
	}

	public int getPrice() {
		return price;
	}

	public int getTax() {
		return Tax;
	}



	void displayDetails() {
		System.out.println("The vehicle model is: " + list.get(0));

		System.out.println("The Price is: " + list1.get(0));

		System.out.println("The tax is: " + list1.get(1));

		System.out.println("The year is: " + list1.get(2));
	}

	public int computeCars() {
		 totalprice = list1.get(0) + list1.get(1);
		System.out.println(list.get(0) + "\t" + totalprice + "\t" + list1.get(2));
		processCar1(totalprice);
		return totalprice;
	}

	public static void processCar1(int totalprice) {
		int totalAmount = 0;
			//totalprice = cars.get(i).computeCars();
			totalAmount = totalAmount + totalprice;
		
	}

	void CarExecution() {
		System.out.println("Welcome "+CustomerFirstName+" "+CustomerLastName);
		int choice = 0;
		

		System.out.println("1.Enter vehicle details");
		System.out.println("2.Total price amount");
		System.out.println("3. Display vehicle details");
		System.out.println("4.Exit");
		do {
			System.out.println("Enter an option");
			choice=sc.nextInt();
			switch (choice) {
			case 1:
				vehicleDetails();
				System.out.println("\n");
				break;
			case 2:
				computeCars();
			        
				break;

			case 3:

				displayDetails();
				System.out.println("\n");
				break;
			case 4:
				System.out.println("None");
			default:
				System.out.println("Invalid option!!please enter again");
			}
		}

		while (choice != 4);
	}



	
	

	public static void main(String[] args) {
		Car myCar = new Car("Sandhiya", "Munisamy");
		myCar.CarExecution();
		

		
	}
}

/*
 * try{
 * 
 * String content =
 * "VehicleModel, the total price of car with year is displayed "; String
 * path="C:\\sandhiya\\new.txt"; File file = new File(path);
 * 
 * 
 * if (!file.exists()) { file.createNewFile(); }
 * 
 * FileWriter fw = new FileWriter(file.getAbsoluteFile()); BufferedWriter bw =
 * new BufferedWriter(fw);
 * 
 * 
 * bw.write(content);
 * 
 * 
 * bw.close(); } catch(Exception e){ System.out.println(e); }
 */

/*
 * try { int line; FileReader fileReader = new
 * FileReader("C:\\sandhiya\\demo.txt"); FileWriter fileWriter = new
 * FileWriter("C:\\sandhiya\\collectionCar.txt");
 * 
 * while ((line = fileReader.read()) != -1) { fileWriter.write(line); }
 * fileReader.close(); fileWriter.close(); System.out.println("Console is: " +
 * System.console()); System.out.println("Task Completed"); } catch (Exception
 * e) { e.printStackTrace(); }
 */
