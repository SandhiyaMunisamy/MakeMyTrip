package com.atmecs.Examples;

import java.util.Scanner;
import java.util.logging.Logger;

public class TrainTicketBooking {
	private static Logger logger = Logger.getLogger("TrainTicketBooking");
	private static int BookingId;
	public int trainno;
	public String pnrno;
	
	//Encapsulation using getter and setter methods
	protected long AdharNumber;
	public long getAdharNumber() {
		return AdharNumber;
	}
	public void setAdharNumber(long adharNumber) {
		AdharNumber = adharNumber;
	}
	
	
	public  String trainDetails(int trainno,String pnrno)
	{
		return pnrno;
	}
	
	
	
	//Confirmation of booking using Compile-time polymorphism
	public static void booking(String date) {
		logger.info("Your ticket is booked!! please confirm once again by entering details ");
		System.exit(0);
		}
	public static void Confirmation(String berth) {
		logger.info("Your ticket is confirmed!!Please provide the payment method");
		
	}
	public static void Cancel() {
		logger.info("Your ticket is cancelled!!");
		System.exit(0);
	}
	
	
	
	//Payment methods using Run-time polymorphism
	public void payment() {
		logger.info("cash on delivery");
	 }
	 public void payment(long card)
	 {
		 logger.info("You availed 10% discount");
	 }
	 public  void payment(String netbanking) 
	 {
		 logger.info("You availed 15% cashback"); ///method overloading(Compiletime polymorphism)
	 }

	 
	//custom exception handling
class HouseFullException extends Exception
	   {
		
	     }
      
         
	      public void buyTickets() throws HouseFullException
	      {
	    	  Scanner scn=new Scanner(System.in);
	          logger.info("Enter number of tickets:");
		      int tickets=scn.nextInt();
	    	  if(tickets<=2)
	    	  {
	    		  tickets--;
	    		  logger.info("ticket confirmed..please wait for 5 seconds");
	    		 
	    	  }
	    	  else
	    	  {
	    		 
	    		  logger.info("Only 2 tickets allowed Per account!!Thank you!!");
	    		  System.exit(0);
	    		  throw new HouseFullException();
	    		 
	    	  }
	    	  
	      }
       //Run-time polymorphism
      static class Card 
      {
      	void swipe() {
      		logger.info("Please wait");
      	}
      }
       static class DebitCard extends Card
      {
      	@Override
      	void swipe()
      	{
      		logger.info("check bank details.your Balance is reduced");
      	}
      }

}