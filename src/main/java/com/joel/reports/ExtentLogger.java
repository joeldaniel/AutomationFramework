package com.joel.reports;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.joel.driver.Driver;
import com.joel.enums.Configproperties;
import com.joel.utils.ReadPropertyFile;

public final class ExtentLogger {

	private ExtentLogger() {};
	
	public static void pass(String Message) {
		ExtentReport.getEx().pass(Message);
	}
	public static void fail(String Message) {
		ExtentReport.getEx().fail(Message);
	}
	public static void skip(String Message) {
		ExtentReport.getEx().skip(Message);
	}
	public static void pass(String Message,boolean isScreenShotNeeded) {
		if(ReadPropertyFile.get(Configproperties.PASSEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes") &&  isScreenShotNeeded) {
			 ExtentReport.getEx().pass(Message, MediaEntityBuilder.createScreenCaptureFromBase64String(getbase64Image()).build());
		}
		else
			pass(Message);
	}
	public static void fail(String Message,boolean isScreenShotNeeded) {
		if(ReadPropertyFile.get(Configproperties.FAILEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes") &&  isScreenShotNeeded) {
			 ExtentReport.getEx().fail(Message, MediaEntityBuilder.createScreenCaptureFromBase64String(getbase64Image()).build());
		}
		else
			fail(Message);
	}
	public static void skip(String Message,boolean isScreenShotNeeded) {
		if(ReadPropertyFile.get(Configproperties.SKIPPEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes") &&  isScreenShotNeeded) {
			 ExtentReport.getEx().skip(Message, MediaEntityBuilder.createScreenCaptureFromBase64String(getbase64Image()).build());
		}
		else
			skip(Message);
	}
	
	public static String getbase64Image() {
		return ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BASE64);
	}
	
}
