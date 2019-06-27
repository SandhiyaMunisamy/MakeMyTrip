package com.atmecs.Examples;

import java.util.logging.Logger;

class HouseFullException extends Exception
{
	
}
public class CustomException {
	private static Logger logger = Logger.getLogger("InfoLogging");
      static int tickets=3;
      static void buyTickets() throws HouseFullException
      {
    	  if(tickets>0)
    	  {
    		  tickets--;
    		  logger.info("ticket confirmed");
    	  }
    	  else
    	  {
    		  throw new HouseFullException();
           }
      }
      public static void main(String[] args) {
		try {
			buyTickets();
			buyTickets();
			buyTickets();
			buyTickets();
		}
		catch(HouseFullException e)
		{
			e.printStackTrace();
		}
      }
}