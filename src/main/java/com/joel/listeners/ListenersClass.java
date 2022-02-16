package com.joel.listeners;

import java.io.IOException;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.joel.annotations.FrameworkAnnotations;
import com.joel.reports.ExtentLogger;
import com.joel.reports.ExtentReport;

public class ListenersClass implements ITestListener,ISuiteListener{

	@Override
	public void onTestStart(ITestResult result) {
		ExtentReport.createTest(result.getMethod().getMethodName());
		ExtentReport.addauthors(result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(FrameworkAnnotations.class).author());
		ExtentReport.addcategory(result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(FrameworkAnnotations.class).groups());	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		ExtentLogger.pass(result.getMethod().getMethodName() +": is Passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		//ExtentLogger.fail(result.getMethod().getMethodName() +": is failed");
		ExtentLogger.fail(result.getMethod().getMethodName() +": is failed",true);
		ExtentLogger.fail(result.getThrowable().toString());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		ExtentLogger.skip(result.getMethod().getMethodName() +": is skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		
	}

	@Override
	public void onStart(ISuite suite) {
		try {
			ExtentReport.initReports();
		} catch (Exception e) {
			
			e.printStackTrace();
		}		
		
	}

	@Override
	public void onFinish(ISuite suite) {
		try {
			ExtentReport.flushReports();
			ExtentReport.unLoad();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	

}
