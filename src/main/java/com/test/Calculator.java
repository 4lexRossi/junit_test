package com.test;

public class Calculator {
	
	public int add(String expression) {
		int sum = 0;
		for (String addValue: expression.split("\\+")) 
			sum += Integer.valueOf(addValue);
		
		System.out.println(sum);
		return sum;		
	}
}
