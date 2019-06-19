package com.atmecs.Calculator;

public class Calc {
	
	public int additionOfNumbers(int... num) {

		int res=0;

		for(int num1 : num) {

			res =res+num1;

		}

		return res;

	}
	
}
