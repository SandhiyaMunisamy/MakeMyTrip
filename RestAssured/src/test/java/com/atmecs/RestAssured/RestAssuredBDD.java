package com.atmecs.RestAssured;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredBDD {
	
	@Test
	void getEmployee(){
		
		RestAssured.baseURI="http://localhost:3800/employee/";   //specify base URI
		
		RequestSpecification httpRequest=RestAssured.given();  //Request object
		
		Response response=httpRequest.request(Method.GET,"/1017");  //Response object
		
		String responseBody=response.getBody().asString();
		System.out.println("Response body is:"+responseBody);  //print response in console window
		
		int statusCode=response.getStatusCode();
		System.out.println("Status code is:"+statusCode);
		Assert.assertEquals(statusCode, 200);  //status code validation
		
		String statusLine=response.getStatusLine();
		System.out.println("Status Line is:"+statusLine);
		Assert.assertEquals(statusLine, "HTTP/1.1 200 ");	 //status line verification 
	}
	
	@Test
	void PostEmployee(){
		
		RestAssured.baseURI="http://localhost:3800/employee/";  //specify base URI
		
		RequestSpecification httpRequest=RestAssured.given();  //Request object
		
		JSONObject requestParams=new JSONObject();   //Request payload sending along with post request
		
		requestParams.put("empNo", "666");
		requestParams.put("empName", "Kenny");
		requestParams.put("position", "Manager");
		
		httpRequest.header("content-Type","application/json");
		
		httpRequest.body(requestParams.toJSONString());//attach above data to the request
		
		Response response=httpRequest.request(Method.POST,"http://localhost:3800/employee");   //Response object
		
		String responseBody=response.getBody().asString();    //print response in console window
		System.out.println("Response body is:"+responseBody);
		
		int statusCode=response.getStatusCode();
		System.out.println("Status code is:"+statusCode);
		Assert.assertEquals(statusCode, 200);    //status code validation
		
		String SuccessCode=response.jsonPath().get("SuccessCode");
		System.out.println("success code is:"+SuccessCode);
		Assert.assertEquals(SuccessCode, null);  //success code validation
	  
	}
	@Test
	void PutEmployee(){
		
		RestAssured.baseURI="http://localhost:3800/employee/";  
		
		RequestSpecification httpRequest=RestAssured.given();  
		
		JSONObject requestParams=new JSONObject();  
		
		requestParams.put("empNo", "2045");
		requestParams.put("empName", "Vasanth");
		requestParams.put("position", "Manager");
		
		httpRequest.header("content-Type","application/json");
		
		httpRequest.body(requestParams.toJSONString());
		
		Response response=httpRequest.request(Method.PUT,"http://localhost:3800/employee");  
		
		String responseBody=response.getBody().asString();    
		System.out.println("Response body is:"+responseBody);
		
	  
	}
	@Test
	void DeleteEmployee(){
		
		RestAssured.baseURI="http://localhost:3800/employee/";   
		
		RequestSpecification httpRequest=RestAssured.given();  
		
		Response response=httpRequest.request(Method.DELETE,"/778877");  
		
		String responseBody=response.getBody().asString();
		System.out.println("Response body is:"+responseBody);  	
}
}
