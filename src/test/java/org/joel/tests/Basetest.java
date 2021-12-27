package org.joel.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.joel.driver.Driver;

public  class Basetest {
	protected Basetest() {};
	
	 
	@BeforeSuite
	public void beforesuite() {
		
		
	}
	@BeforeMethod
	public void setUp() {
		Driver.initDriver();
	}
	@AfterMethod
	public void tearDown() {
		Driver.cleanupDriver();
	}
	
	@AfterSuite
	public void aftersuite()  {
		
	}

}
