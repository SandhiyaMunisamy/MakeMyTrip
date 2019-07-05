package com.atmecs.jsonfile;


import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.*;

public class EmployeeReadFile {
	public static void main(String[] args) throws Exception {
		/**
		 * // parsing file from "JSONExample.json" 
		 */
		Object readFile=new JSONParser().parse(new FileReader("JSONExample.json"));
		
		/**
		 * Typecast readFile to JSONObject
		 */
		JSONObject employeeDetails=(JSONObject) readFile;
		
		/**
		 * Getting EmployeeName,EmployeeID,Age
		 */
		String EmployeeName=(String)employeeDetails.get("EmployeeName");
		String EmployeeID=(String)employeeDetails.get("EmployeeID");
		String Age = (String)employeeDetails.get("Age");
		System.out.println(EmployeeName);//getting EmployeeName
		System.out.println(EmployeeID);//getting EmployeeID
		System.out.println(Age);//getting age
		
		Map address=((Map)employeeDetails.get("address"));
		
		// iterating address Map 
        Iterator<Map.Entry> emp = address.entrySet().iterator(); 
        while (emp.hasNext()) { 
            Map.Entry pair = emp.next(); 
            System.out.println(pair.getKey() + " : " + pair.getValue()); 
        } 
        //getting phoneNumbers 
        JSONArray mobile = (JSONArray) employeeDetails.get("PhoneNumbers"); 
          
        // iterating phoneNumbers 
        Iterator ph = mobile.iterator(); 
          
        while (ph.hasNext())  
        { 
            emp = ((Map) ph.next()).entrySet().iterator(); 
            while (emp.hasNext()) { 
                Map.Entry pair = emp.next(); 
                System.out.println(pair.getKey() + " : " + pair.getValue()); 
            } 
        }
	}
}
