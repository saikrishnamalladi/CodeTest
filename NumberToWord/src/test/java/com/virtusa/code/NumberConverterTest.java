package com.virtusa.code;

import org.junit.Test;

import junit.framework.TestCase;

public class NumberConverterTest extends TestCase{
	
	public NumberConverterTest() {
		
	}
	@Test
	public void testZero() {
		assertEquals("zero", NumberConverter.convertToWord(0));
	}
	
	@Test
	public void testNegative() {
		assertEquals("negative five", NumberConverter.convertToWord(-5));
	}
	
	@Test
	public void testMillion() {
		assertEquals("one hundred twenty three million and one hundred twenty four thousand and two hundred forty three" , NumberConverter.convertToWord(123124243));
	}
	
	@Test
	public void testSmallValue() {
		assertEquals("one hundred twenty three", NumberConverter.convertToWord(123));
	}

}
