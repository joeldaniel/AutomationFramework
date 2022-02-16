package org.joel.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;
import com.joel.annotations.FrameworkAnnotations;
import com.joel.enums.Categorytype;
import com.joel.pages.LoginPage;

public final class LoginPagetest extends Basetest{

	private LoginPagetest() {};
	
	@FrameworkAnnotations(author = { "Daniel" }, groups = { Categorytype.REGRESSION })
	@Test
	public void test2() throws Exception {
		LoginPage name = new LoginPage();
		name.click();
		Uninterruptibles.sleepUninterruptibly(15, TimeUnit.SECONDS);

	}



}
