package com.seleniumDemo.testcases;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustoListener extends BaseClass implements ITestListener{
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Failed "+result.getMethod());
		failedtestScreen(result.getMethod().getMethodName());
		
	}
}
