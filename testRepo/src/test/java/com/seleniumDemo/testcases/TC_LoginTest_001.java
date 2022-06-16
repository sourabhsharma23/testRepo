package com.seleniumDemo.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.seleniumDemo.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{

	@Test
	public void loginTest() {
		

		LoginPage lp = new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickButton();
		
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "Guru99 Bank Manager HomePage");
		
	}
	
	@Test
	public void loginTestFail() {
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickButton();
		
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "SGuru99 Bank Manager HomePage");
		
	}
	
	@Test
	public void TestFailedScreenshot() {
		Assert.assertEquals(false, true);
	}
	
	
	
}
