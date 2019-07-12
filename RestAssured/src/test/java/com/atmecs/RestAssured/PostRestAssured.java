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
				.get("http://localhost:3500/employee/1017").then();

	}
	
	@Test
	void postRequest() {

		JSONObject requestParams = new JSONObject();

		requestParams.put("empNo", "4646");
		requestParams.put("empName", "xyz");
		requestParams.put("position", "Analyst");

		System.out.println("json" + requestParams.toString());

		RestAssured.given().contentType("application/json").body(requestParams).when()
				.post("http://localhost:3500/employee").then();

	}
	
	JSONObject requestParams = new JSONObject();
	@Test
	void putRequest() {
		JSONObject requestParams = new JSONObject();
		requestParams.put("empNo", "4646");
		requestParams.put("empName", "xyz");
		requestParams.put("position", "Trainee");

		System.out.println("json" + requestParams.toString());
           
		RestAssured.given().contentType("application/json").body(requestParams).when()
				.put("http://localhost:3500/employee").then();

	}
}
