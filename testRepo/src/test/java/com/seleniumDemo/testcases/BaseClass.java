package com.seleniumDemo.testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.seleniumDemo.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	ReadConfig readC = new ReadConfig();
	public String baseUrl = readC.getApplicationUrl();
	public String username = readC.getUsername();
	public String password = readC.getPassword();
	public static WebDriver driver;
	
	@Parameters("browser")
	@BeforeTest
	public void setup(String browser) {
		
		if(browser.equalsIgnoreCase("Chrome")) 
		{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
	}
	
	
	
	@AfterTest
	public void tearDown() {	
		driver.quit();
	}
	
	public void failedtestScreen(String testMethod) {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(".//Screenshots/"+testMethod+".png");
		try {
			FileUtils.copyFile(source, target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
