package org.joel.tests;

import org.testng.annotations.Test;

import com.joel.pages.LoginPage;
import com.joel.reports.ExtentLogger;

public final class LoginPagetest extends Basetest{

	private LoginPagetest() {};
	
	@Test
	public void test2() throws Exception {
		LoginPage name = new LoginPage();
		name.click();
		ExtentLogger.pass("Login page Test passed");

	}



}
