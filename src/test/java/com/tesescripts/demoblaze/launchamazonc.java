package com.tesescripts.demoblaze;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.genericlib.demoblaze.base2;
import com.genericlib.demoblaze.eventlib32;
@Listeners(eventlib32.class)
public class launchamazonc extends base2{

@Test
public void amazon()  {
	test=extent.createTest("add amazon   2");
System.out.println("start2");

driver.findElement(By.xpath("//button[.='✕']")).click();
System.out.println("start4");
Assert.assertTrue(false);

//driver.quit();
}
}