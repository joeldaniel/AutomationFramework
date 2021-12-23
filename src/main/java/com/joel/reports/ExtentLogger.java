package com.joel.reports;

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
}
