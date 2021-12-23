package com.joel.reports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public final class ExtentReport {
	private ExtentReport() {}
	
	private static ExtentReports extent;
	private static ThreadLocal<ExtentTest> ex=new ThreadLocal<>();
	public static ExtentTest test;
	
	
	
	
	
	static ExtentTest getEx() {
		return ex.get();
	}

	static void setEx(ExtentTest extent) {
		ex.set(extent);
	}

	static void unLoad() {ex.remove();}
	
	public static void initReports() {
		if(Objects.isNull(extent)) {
			extent=new ExtentReports();
			ExtentSparkReporter spark=new ExtentSparkReporter("index.html");
			extent.attachReporter(spark);
			
			spark.config().setTheme(Theme.DARK);
			spark.config().setDocumentTitle("Automation Report");
			spark.config().setReportName("Module");
			
		}
	}
	
	public static void flushReports() throws IOException {
		if(Objects.nonNull(extent))
			extent.flush();
		Desktop.getDesktop().browse(new File("index.html").toURI());
	}
	
	public static void createTest(String testcasename) {
		test=extent.createTest(testcasename);
		setEx(test);
	}
}
