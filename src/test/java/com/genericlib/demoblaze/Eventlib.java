package com.genericlib.demoblaze;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;

public class Eventlib implements ITestListener  {

	public void onTestFailure(WebDriver driver,ITestResult result) {
		TakesScreenshot tss = (TakesScreenshot) driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File dst = new File("testOutput/Screenshotas/"+System.currentTimeMillis()+".png+");
		try {
			FileUtils.copyFile(src, dst);
		} catch (IOException e) {

			e.printStackTrace();
		}


//		ExtentTest extentTest = new ExtentTest(null, null, null);
	//	extentTest.fail("testcase is failed "+result.getThrowable().toString());




	}


}
