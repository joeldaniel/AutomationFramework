package com.joel.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.joel.constants.FrameworkConstants;

import io.github.bonigarcia.wdm.WebDriverManager;

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
	
	public static void initDriver(String browser) {
		if(Objects.isNull(getDriver())) {
			if(browser.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}else if(browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}
			setDr(driver);
		}
	}

	public static void cleanupDriver() {
		if(Objects.nonNull(getDriver()))
			getDriver().quit();
		unload();
	}
}
