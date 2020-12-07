package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		int sum = calc.add("1+1+3");
		assertEquals(5, sum);
	}

}
