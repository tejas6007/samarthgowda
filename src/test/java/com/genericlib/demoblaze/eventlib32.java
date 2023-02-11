package com.genericlib.demoblaze;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class eventlib32 implements ITestListener{

	public void ontestfailure(WebDriver driver ,ITestResult result)
	{
		
	
		TakesScreenshot tss = (TakesScreenshot) driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File dst = new File("testOutput/Screenshotejasas/"+System.currentTimeMillis()+".png+");
		try {
			FileUtils.copyFile(src, dst);
		} catch (IOException e) {

			e.printStackTrace();
		}
		base2.test.fail("testcase failed"+result.getThrowable().toString());
	}
	
}
