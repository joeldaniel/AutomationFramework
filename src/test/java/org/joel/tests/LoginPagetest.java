package org.joel.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;
import com.joel.pages.LoginPage;

public final class LoginPagetest extends Basetest{

	private LoginPagetest() {};
	
	@Test
	public void test2() throws Exception {
		LoginPage name = new LoginPage();
		name.click();
		Uninterruptibles.sleepUninterruptibly(15, TimeUnit.SECONDS);

	}



}
