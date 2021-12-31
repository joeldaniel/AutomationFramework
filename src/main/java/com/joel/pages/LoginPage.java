package com.joel.pages;

import com.joel.driver.Driver;
import com.joel.enums.Configproperties;
import com.joel.reports.ExtentLogger;
import com.joel.utils.ReadPropertyFile;

public class LoginPage {

	public void click() throws Exception {
		//Driver.getDriver().get(ReadPropertyFile.get(Configproperties.URL));	
		Driver.getDriver().get("https://www.youtube.com/");	
		ExtentLogger.pass("url also is opened",true);	
		}
}
