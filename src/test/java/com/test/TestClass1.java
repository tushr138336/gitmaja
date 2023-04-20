package com.test;

import org.testng.annotations.Test;

import com.utility.LogDemo;

public class TestClass1 {
	
	
	@Test
	public void testCase1() {
		System.out.println("start");
		LogDemo.startTestCase("testCase1");
		LogDemo.info("This is testCase1");
		LogDemo.endTestCase("testCase1 ");
		System.out.println("finish");
	}
	
	

}