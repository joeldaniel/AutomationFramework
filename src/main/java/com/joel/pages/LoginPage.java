package com.joel.pages;

import com.joel.driver.Driver;
import com.joel.utils.ReadPropertyFile;

public class LoginPage {

	public void click() throws Exception {
		//Driver.getDriver().get(ReadPropertyFile.readProperty("url"));	
		Driver.getDriver().get("twitter.com");	
		}
}
