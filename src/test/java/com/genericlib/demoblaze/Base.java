package com.genericlib.demoblaze;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.objectrepo.demoblaze.Homepage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
public WebDriver driver;
public Filelib fl=new Filelib();
public String propath="src/test/resources/commondataproperties";
public commonutils cu=new commonutils();
public  Homepage hp;
public   ExtentReports extent;
public  ExtentSparkReporter spark;
public  ExtentTest test;

@BeforeSuite
public void  configBsTest() throws IOException
{	extent=new ExtentReports();//create obeject fro extenet report
	spark=new ExtentSparkReporter("Samarth_Demoblaze.html");//extnds spark reporter is one of the format
	extent.attachReporter(spark);//we are attcjing to ecxtent report
	if(fl.getDAtafrompropertyfile(propath, "browser").equals("FireFox"))
	{
	WebDriverManager.chromedriver().setup();
	 driver=new FirefoxDriver();
	}
	if(fl.getDAtafrompropertyfile(propath, "browser").equals("edge"))
	{
	WebDriverManager.chromedriver().setup();
	driver=new EdgeDriver();
	}      driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
driver.get(fl.getDAtafrompropertyfile(propath, "url"));
}
@BeforeMethod
public void configbmtest() throws IOException {
	hp=PageFactory.initElements(driver, Homepage.class);
	hp.getHomeLogin().click();
	hp.getHomeusername().sendKeys(fl.getDAtafrompropertyfile(propath, "username"));
	hp.getHomepassword().sendKeys(fl.getDAtafrompropertyfile(propath,"password"));
	hp.getuserlogin().click();
	cu.waitforThetext(driver,hp.getVerifylogin(),fl.getDAtafrompropertyfile(propath, "username"));
	Assert.assertTrue(hp.getVerifylogin().getText().contains(fl.getDAtafrompropertyfile(propath, "username")));
}
@AfterMethod
public void configAMTest() throws IOException {
hp.getLogout().click();;
test.pass("logged out  demo blaze as as"+fl.getDAtafrompropertyfile(propath, "uername"));
}
@AfterSuite
public void configAstest() {
driver.quit();
test.pass("close the browser");
extent.flush();//to execute the operations
}
}
