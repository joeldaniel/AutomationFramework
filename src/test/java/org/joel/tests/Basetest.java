package org.joel.tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.joel.driver.Driver;

public  class Basetest {
	protected Basetest() {};
	
	 
	@BeforeSuite
	public void beforesuite() {
		
		
	}
	@BeforeTest
	public void setUp() {
		Driver.initDriver();
	}
	@AfterTest
	public void tearDown() {
		Driver.cleanupDriver();
	}
	
	@AfterSuite
	public void aftersuite()  {
		
	}

}
