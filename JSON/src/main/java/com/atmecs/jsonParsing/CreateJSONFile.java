package com.atmecs.jsonParsing;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CreateJSONFile {

	public static void main(String[] args) {
		JSONObject obj=new JSONObject();
		obj.put("name", "Sandhiya");
		obj.put("location", "USA");
		
		JSONArray list =new JSONArray();
		list.add("JAVA");
		list.add("JSP");
		list.add("Servlets");
		
		obj.put("courses" , list);
		
		try(FileWriter file = new FileWriter("myJSON.json")) {
			file.write(obj.toString());
			file.flush();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(obj);
	}
}
