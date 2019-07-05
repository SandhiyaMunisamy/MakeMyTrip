package com.atmecs.jsonfile;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
/**
 * 
 * @author Sandhiya.Munisamy
 *
 */

public class EmployeeWriteFile{
	public static void main(String[] args) throws FileNotFoundException{
		/**
		 * Creating a Java Object to store the employee details
		 */
		JSONObject empDetails=new JSONObject();
		/**
		 * adding employee details and putting data to JSONObject
		 */
		empDetails.put("EmployeeName", "Sandhiya Munisamy");
		empDetails.put("EmployeeID", "1017");
		empDetails.put("Age", "23");
		
		/**
		 * To store the address data using LinkedHashMap
		 */
		Map address =new LinkedHashMap(4);
		address.put("Street", "No.3,12th Street");
		address.put("city","Vellore");
		address.put("State", "TamilNadu");
		address.put("Pincode", "632007");
		/**
		 * putting address to JSONObject
		 */
		empDetails.put("address", address);
		
		
		/**
		 * create JSONArray for adding phone numbers
		 */
		JSONArray mobile=new JSONArray();
		
		address=new LinkedHashMap(2);
		address.put("type", "Home");
		address.put("number","0416-2242660");
		
		mobile.add(address);   //adding map to list
		
		address=new LinkedHashMap(2);
		address.put("type", "MobileNumber");
		address.put("number","7502987295");
		
		mobile.add(address);  //adding map to list 
		
		
		
		empDetails.put("PhoneNumbers",mobile);//putting phoneNumbers to JSONObject 
		
		/**
		 *  writing JSON to file 
		 */
		PrintWriter writeFile=new PrintWriter("JSONExample.json");
		writeFile.write(empDetails.toJSONString());
		System.out.println("written");
		
		writeFile.flush();
		writeFile.close();
	}
}
