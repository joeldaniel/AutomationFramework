package org.joel.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.joel.driver.Driver;

public  class Basetest {
	protected Basetest() {};
	
	 
	@BeforeSuite
	public void beforesuite() {
		
		
	}
	@BeforeMethod()
	@Parameters({"browser"})
	public void setUp(String browserval) {
		Driver.initDriver(browserval);
	}
	@AfterMethod
	public void tearDown() {
		Driver.cleanupDriver();
	}
	
	@AfterSuite
	public void aftersuite()  {
		
	}

}
