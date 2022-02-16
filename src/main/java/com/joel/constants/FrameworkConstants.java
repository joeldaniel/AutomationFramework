package com.joel.constants;

import com.joel.enums.Configproperties;
import com.joel.utils.ReadPropertyFile;

public final class FrameworkConstants {
	
	private FrameworkConstants() {
		
	}
	
	private static final String chromedriverpath=System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver.exe";
	private static final String firefoxdriverpath=System.getProperty("user.dir")+"/src/test/resources/executables/geckodriver.exe";
	private static final String extentreportfolderpath=System.getProperty("user.dir")+"\\Reports\\";
	private static String extentreportfilepath="";

	

	public static String getExtentreportfilepath() {
		if(extentreportfilepath.isEmpty()) {
			extentreportfilepath=createReportPath();
		}
		return extentreportfilepath;
	}

	public static String getFirefoxdriverpath() {
		return firefoxdriverpath;
	}

	private static String createReportPath() {
		if(ReadPropertyFile.get(Configproperties.OVERRIDEREPORTS).equalsIgnoreCase("no"))
			return extentreportfolderpath+System.currentTimeMillis()+"_index.html";
		else
			return extentreportfolderpath+"index.html";
			
	}


	public static String getChromedriverpath() {
		return chromedriverpath;
	}

}
