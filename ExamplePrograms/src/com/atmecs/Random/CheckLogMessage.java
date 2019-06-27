package com.atmecs.Random;

import java.util.logging.Logger;

public class CheckLogMessage{

	private static Logger logger = Logger.getLogger("InfoLogging");
   
   public static void main(String[] args){
      logger.info("Hello this is an info message");
   }
}
