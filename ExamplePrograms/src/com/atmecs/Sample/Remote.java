package com.atmecs.Sample;

import java.util.logging.Logger;

class Remote{
	 private static Logger logger = Logger.getLogger("InfoLogging");
	
	   void operate() 
	       { 
		   logger.info("Tv on/off"); 
	       } 
	    public static void main(String[] args) {
			Remote myremote=new Remote();
			myremote.operate();
	    }
 }
