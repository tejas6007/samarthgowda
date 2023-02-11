package com.tesescripts.demoblaze;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.genericlib.demoblaze.base2;

public class launchamazonc3 extends base2{

@Test
public void amazon()  {
	test=extent.createTest("add amazon");
	System.out.println("start1");
driver.findElement(By.xpath("//button[.='✕']")).click();

System.out.println("start2pass");
	driver.findElement(By.xpath("//a[.='Login']")).click();
	Assert.assertTrue(false);

}
}