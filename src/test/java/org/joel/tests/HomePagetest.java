package org.joel.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;
import com.joel.pages.HomePage;

public final class HomePagetest extends Basetest {

	private HomePagetest() {};
	
	@Test
	public void test1() throws Exception {
		HomePage name = new HomePage();
		name.click();
		Uninterruptibles.sleepUninterruptibly(15, TimeUnit.SECONDS);
		
	}


}
