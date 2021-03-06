package com.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.opeartion.Calculator;

public class CalculatorTest {

	int num1;
	int num2;
	Calculator calculator;
	
	@Before
	public void setUp() throws Exception {
		
		num1 = 3;
		num2 = 4;
		
		calculator = new Calculator();
	}

	@Test
	public void testAdd() {

		int ans = calculator.add(num1, num2);
		assertEquals(7, ans);
		
	}

	@Test
	public void testSub() {
		int ans = calculator.sub(num1, num2);
		assertEquals(-1, ans);
	}

	@Test
	public void testMulti() {
		int ans = calculator.multi(num1, num2);
		assertEquals(12, ans);
	}

	@Test
	public void testDiv() {
		int ans = calculator.div(num1, num2);
		assertEquals(0, ans);
		
		assertEquals(expected, actual, delta);
	}

}
