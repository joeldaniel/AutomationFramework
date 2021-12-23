package com.joel.constants;

public final class FrameworkConstants {
	
	private FrameworkConstants() {
		
	}
	
	private static final String chromedriverpath=System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver.exe";

	public static String getChromedriverpath() {
		return chromedriverpath;
	}

}
