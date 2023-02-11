package com.genericlib.demoblaze;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;


public class base2 {
	public   static ExtentReports extent;
	public  static ExtentSparkReporter spark;
	public static  ExtentTest test;
	public static  WebDriver driver;
	//@Parameters("browser")
	@BeforeTest
	public void connct()
	{
		extent = new ExtentReports();
		spark=new ExtentSparkReporter("tejas_Amazon.html");
		extent.attachReporter(spark);
		WebDriverManager.chromedriver().setup();
		driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	}
	
	@AfterTest
	public void after()
	{
		driver.quit();
		extent.flush();
	}
}
