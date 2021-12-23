package com.joel.pages;

import com.joel.driver.Driver;
import com.joel.utils.ReadPropertyFile;

public class HomePage {
	
	public void click() throws Exception {
		//Driver.getDriver().get(ReadPropertyFile.readProperty("url"));	
		Driver.getDriver().get("google.com");	
		}

}
