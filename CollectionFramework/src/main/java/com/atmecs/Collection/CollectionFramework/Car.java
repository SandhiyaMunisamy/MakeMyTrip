package com.atmecs.Collection.CollectionFramework;

import java.util.ArrayList;

public class Car {
	private String vehicleModel;
	private int price;
	private int Tax;
	private String year;

	public Car(String vehicleModel, int price, int Tax, String year) {
		this.vehicleModel = vehicleModel;
		this.price = price;
		this.Tax = Tax;
		this.year = year;
	}

	public int computeCars (){
	    int  totalprice= price + Tax;
	    System.out.println (vehicleModel + "\t" +totalprice+"\t"+year );
	    return  totalprice; 
	 }

	public String getVehicleModel() {
		return vehicleModel;
	}

	public int getPrice() {
		return price;
	}

	public int getTax() {
		return Tax;
	}

	public String getYear() {
		return year;
	}

	public static void processCar1(ArrayList<Car> cars){
	    int totalAmount=0;
	    for (int i=0; i<cars.size(); i++){
	        int totalprice= cars.get(i).computeCars ();
	        totalAmount=totalAmount+ totalprice; 
	    }
	}

	public static void main(String[] args) {
		Car thisCar = new Car("Toyota", 10000, 100, "2003");
		ArrayList<Car> car = new ArrayList<Car>();
		car.add(thisCar);
		processCar1(car);
	}

	public static void processCar(ArrayList<Car> car) {
		for (Car c : car) {
			System.out.println(c.getPrice());
		}
	}
}