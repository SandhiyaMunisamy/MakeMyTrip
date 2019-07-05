package com.atmecs.jsonParsing;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class Example1 {
	public static void main(String[] args) throws  FileNotFoundException,IOException,ParseException{
	
       JSONParser parser=new JSONParser();
       try {
    	   Object obj=parser.parse(new FileReader("myJSON.json"));
    	   JSONObject jsonObject = (JSONObject) obj;
    	   String name=(String) jsonObject.get("name");
    	   System.out.println("Name is: " +name);
    	   
    	   String location=(String) jsonObject.get("location");
    	   System.out.println("location is: " +location);
    	   
    	   //loop array
    	   JSONArray coursesArray = (JSONArray) jsonObject.get("courses");
       }
       catch(FileNotFoundException e)
       {
    	   e.printStackTrace();
       }
       catch(IOException e)
       {
    	   e.printStackTrace();
       }
       catch(ParseException e)
       {
    	   e.printStackTrace();
       }
	
}
}
