package com.atmecs.javadoc;

public class Car {
	    
	    String model;
	    String colour;
	    double mileage;
	    
	    public void startCar(){
	            System.out.println("Car starts !");
	    }
	 
	    public void changeGears(){
	        System.out.println("Gears changed !");
	    }
	 
	    public void stopCar(){
	        System.out.println("Car stopped !");
	    }
	    public String getInfo() {
	            return ("Model:" +model + " Colour:"  + colour + " Mileage:" +mileage);
	        }
	     
	    public static void main (String args[]){
	        Car cars = new Car();
	        cars.model = "Baleno";
	        cars.colour = "Jet Black";
	        cars.mileage = 27.89;
	        System.out.println(cars.getInfo());
	        cars.startCar();
	        }

}
