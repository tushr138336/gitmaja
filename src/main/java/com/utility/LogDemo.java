package com.utility;
import org.apache.logging.log4j.*;


public class LogDemo {
	
	 // Initialize Log4j logs
	
	 public static Logger Log = LogManager.getLogger(LogDemo.class);
	 
	 //https://www.automationtestinginsider.com/2020/05/generate-logs-in-selenium-web-driver.html

	 public static void startTestCase(String sTestCaseName){    
		 System.out.println("startTestCase method running");
	   Log.info("====================================="+sTestCaseName+" TEST START=========================================");
	   }
	 
	 public static void endTestCase(String sTestCaseName){
		 System.out.println("endTestCase method running");

	  Log.info("====================================="+sTestCaseName+" TEST END=========================================");
	   }
	 
	 // Need to create below methods, so that they can be called  

	  public static void info(String message) {

	   Log.info(message);

	   }

	  public static void warn(String message) {

	     Log.warn(message);

	  }

	  public static void error(String message) {

	     Log.error(message);

	  }

	  public static void fatal(String message) {

	     Log.fatal(message);

	  }

	  public static void debug(String message) {

	     Log.debug(message);

	  }
	  
	  public static void main(String[] args) {
		  
		LogDemo.info("this is info");
		LogDemo.startTestCase("start");
		
	}

}



