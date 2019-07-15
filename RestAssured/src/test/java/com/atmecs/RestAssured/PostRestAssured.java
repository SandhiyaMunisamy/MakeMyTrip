package com.atmecs.RestAssured;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRestAssured {
	
	@Test
	void getRequest() {
		JSONObject requestParams = new JSONObject();

		System.out.println("json" + requestParams.toString());

		RestAssured.given().contentType("application/json").body(requestParams).when()
				.get("http://localhost:3800/employee/1017").then();
		
		

	}
	
	@Test
	void postRequest() {

		JSONObject requestParams = new JSONObject();

		requestParams.put("empNo", "778877");
		requestParams.put("empName", "Mirunalini");
		requestParams.put("position", "Analyst");

		System.out.println("json" + requestParams.toString());

		RestAssured.given().contentType("application/json").body(requestParams).when()
				.post("http://localhost:3800/employee").then();

	}
	
	JSONObject requestParams = new JSONObject();
	@Test
	void putRequest() {
		JSONObject requestParams = new JSONObject();
		requestParams.put("empNo", "2045");
		requestParams.put("empName", "Vasanth");
		requestParams.put("position", "HR");

		System.out.println("json" + requestParams.toString());
           
		RestAssured.given().contentType("application/json").body(requestParams).when()
				.put("http://localhost:3800/employee").then();

	}
	@Test
	void deleteRequest() {
		JSONObject requestParams = new JSONObject();

		System.out.println("json" + requestParams.toString());

		RestAssured.given().contentType("application/json").body(requestParams).when()
				.delete("http://localhost:3800/employee/1456").then();

	}
}
