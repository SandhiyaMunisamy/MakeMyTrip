package com.atmecs.Sample;

import java.util.logging.Logger;

public class String1 {
	public static Logger logger=Logger.getLogger("String1.class");
	 public static void concat1(String s1) 
	    { 
	        s1 = s1 + "forgeeks"; 
	    } 
	  
	    // Concatenates to StringBuilder 
	    public static void concat2(StringBuilder s2) 
	    { 
	        s2.append("forgeeks"); 
	    } 
	  
	    // Concatenates to StringBuffer 
	    public static void concat3(StringBuffer s3) 
	    { 
	        s3.append("forgeeks"); 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	        String s1 = "Geeks"; 
	        concat1(s1);  // s1 is not changed 
	        logger.info("String: " + s1); 
	  
	        StringBuilder s2 = new StringBuilder("Geeks"); 
	        concat2(s2); // s2 is changed 
	        logger.info("StringBuilder: " + s2); 
	  
	        StringBuffer s3 = new StringBuffer("Geeks"); 
	        concat3(s3); // s3 is changed 
	        logger.info("StringBuffer: " + s3); 
	    } 
}
