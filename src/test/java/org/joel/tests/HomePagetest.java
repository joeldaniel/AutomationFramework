package org.joel.tests;

import org.testng.annotations.Test;

import com.joel.driver.Driver;
import com.joel.pages.HomePage;
import com.joel.reports.ExtentLogger;
import com.joel.utils.ReadPropertyFile;

public final class HomePagetest extends Basetest {

	private HomePagetest() {};
	
	@Test
	public void test1() throws Exception {
		HomePage name = new HomePage();
		name.click();
		
		
	}


}
