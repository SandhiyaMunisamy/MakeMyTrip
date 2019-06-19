package com.atmecs.Examples;

import java.util.Random;
import java.util.Scanner;
import java.util.logging.Logger;

import com.atmecs.Examples.TrainTicketBooking.Card;
import com.atmecs.Examples.TrainTicketBooking.DebitCard;
import com.atmecs.Examples.TrainTicketBooking.HouseFullException;

public class Reservation {
	private static Logger logger = Logger.getLogger("TrainTicketBooking");
	 public static void main(String[] args) throws Exception{
		TrainTicketBooking t = new TrainTicketBooking();
		String Str = new String("Welcome to IRCTC!!!");
		logger.info(Str.toUpperCase());
		Scanner sc = new Scanner(System.in);
		
		
		logger.info("Enter PassengerName:");
		String name = sc.next();
		
		
		logger.info("Enter Age:");
		int a = sc.nextInt();
		
		
		logger.info("Enter Aadhar number:");
		String aid = sc.next();
		if (aid.length() == 12) {
			logger.info("valid Aadharid ");
		} else {
			logger.info("Invalid Aadharid..please provide 12 digits");
			System.exit(0);
			;
		}
		
		
		
		logger.info("Enter Destination:");
		String End = sc.next();
     	  
		
		try {
 			t.buyTickets();
 			
 		   }
 		   catch(HouseFullException e)
 		   {
 			e.printStackTrace();
 		  }
		
		
        Thread.sleep(4000);
       	
		
      	  
      	Random rand = new Random();
		int BookingId = rand.nextInt(1000000);
		logger.info("Booking Id:" + BookingId++);

		
		
		Seating s = new Class();
        s.sleeper();
      	   
		
		
        
        logger.info("press 1 for Booking " + '\n' + "press 2 for confirmation" + '\n' + "press 3 for cancel");
		logger.info("Please provide the confirmation");
		int status = sc.nextInt();
		switch (status) {
		case 1:
			t.booking("23-10-2019");
			break;
		case 2:
			t.Confirmation("Upper");
			break;
		case 3:
			t.Cancel();
			break;
		}
   		
   		
   		
		
		logger.info("press 1 for Cash " + '\n' + "press 2 for card payment" + '\n' + "press 3 for netbanking");
		logger.info("Enter Payment method:");
		int payment = sc.nextInt();

		switch (payment) {
		case 1:
			t.payment();
			break;
		case 2:
			t.payment(123456789);
			logger.info("Enter card number:");
			String card = sc.next();
			if (card.length() == 12 || card.length() == 14 || card.length() == 16) {
				logger.info("valid card number");

			} else {
				System.exit(0);
			}
			break;
		case 3:
			t.payment("ICIC1234");
			logger.info("Enter netbanking id:");
			String netbanking = sc.next();
			break;
		}
		
		
		String details=t.trainDetails(12859,"B46-0474720");
		logger.info("PNR NO:" +details);
		
   		 
		
		
		
		Card c = new DebitCard();
		c.swipe();
		logger.info("Thank for booking !! please visit again");
   	  
   	 
	}
	 
	

}
