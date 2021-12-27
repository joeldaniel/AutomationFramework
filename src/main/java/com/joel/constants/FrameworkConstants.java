package com.joel.constants;

import com.joel.enums.Configproperties;
import com.joel.utils.ReadPropertyFile;

public final class FrameworkConstants {
	
	private FrameworkConstants() {
		
	}
	
	private static final String chromedriverpath=System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver.exe";
	private static final String extentreportpath=System.getProperty("user.dir")+"/Reports/";

	public static String getExtentreportpath() {
		if(ReadPropertyFile.get(Configproperties.OVERRIDEREPORTS).equalsIgnoreCase("yes"))
			return extentreportpath+System.currentTimeMillis()+"_index.html";
		else
			return extentreportpath+"index.html";
	}

	public static String getChromedriverpath() {
		return chromedriverpath;
	}

}
