package com.baseClass;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.utility.LogDemo;

public class BaseClass{
	
	@BeforeSuite
	
	public void beforeSuite() {
		System.out.println("before suite starts");
		DOMConfigurator.configure("C:\\Users\\HOME\\eclipse-workspace\\LogPractice\\log4j2.xml");
		LogDemo.info("This is before suite method");
		
		System.out.println("before suite finishes");

		
		
	}
	
	@AfterSuite
	
	public void afterSuite() {
		
		System.out.println("after suite starts");

		
		LogDemo.info("This is after suite method");
		
		System.out.println("after suite finishes");

	}

	
}
