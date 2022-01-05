package com.joel.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.joel.constants.FrameworkConstants;

public final class Driver {
	
	private Driver() {}
	
	static WebDriver driver=null;
	private static ThreadLocal<WebDriver> dr=new ThreadLocal<>();
	
	public static WebDriver getDriver() {
		return dr.get();
	}
	public static void setDr(WebDriver driver) {
		dr.set(driver);
	}
	
	
	static void unload() { dr.remove(); }
	
	public static void initDriver() {
		if(Objects.isNull(getDriver())) {
			System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromedriverpath());
			driver=new ChromeDriver();
			setDr(driver);
		}
	}

	public static void cleanupDriver() {
		if(Objects.nonNull(getDriver()))
			getDriver().quit();
	}
}
