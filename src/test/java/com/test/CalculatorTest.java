package com.test;

import static org.junit.Assert.*;
//import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		int sum = calc.add("1+1+3");
		assertEquals(5, sum);
	}
	
	@Test
	public void testAddWithMock() {
		Calculator calc = mock(Calculator.class);
		
		when(calc.add("1+2")).thenReturn(10);
		
		int result = calc.add("1+2");
	
		assertEquals(10, result);
	}

}
