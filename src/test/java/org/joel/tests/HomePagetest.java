package org.joel.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;
import com.joel.annotations.FrameworkAnnotations;
import com.joel.enums.Categorytype;
import com.joel.pages.HomePage;

public final class HomePagetest extends Basetest {

	private HomePagetest() {};
	
	@FrameworkAnnotations(author = { "Joel" }, groups = { Categorytype.SMOKE })
	@Test
	public void test1() throws Exception {
		HomePage name = new HomePage();
		name.click();
		Uninterruptibles.sleepUninterruptibly(15, TimeUnit.SECONDS);
		
	}


}
