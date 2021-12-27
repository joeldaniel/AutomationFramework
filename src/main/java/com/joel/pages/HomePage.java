package com.joel.pages;

import com.joel.driver.Driver;
import com.joel.enums.Configproperties;
import com.joel.reports.ExtentLogger;
import com.joel.utils.ReadPropertyFile;

public class HomePage {
	
	public void click() throws Exception {
		Driver.getDriver().get(ReadPropertyFile.get(Configproperties.URL));	
		//Driver.getDriver().get("google.com");	
		ExtentLogger.pass("url is opened",true);
		}

}
