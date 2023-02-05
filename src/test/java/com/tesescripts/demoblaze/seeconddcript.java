package com.tesescripts.demoblaze;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.genericlib.demoblaze.Base;

public class seeconddcript extends Base  {
@Test
public void secondscriptTest() throws IOException
{test=extent.createTest("add multipe products");
	cu.productname(driver, fl.getDAtafrompropertyfile(propath, "productname")).click();
	hp.getAddtocart().click();;
	cu.waitforthealert(driver);
	cu.acceptpopup(driver);
	hp.getHomecart().click();
	 cu.productname2(driver, fl.getDAtafrompropertyfile(propath, "productname")).isDisplayed();
	 hp.getDeletebutton().click();
	 hp.getHomebutton().click();
	hp.getLaptopname().click();
	hp.getSonylaptop().click();
	hp.getAddtocart().click();;
	cu.waitforthealert(driver);
	cu.acceptpopup(driver);
	hp.getHomecart().click();
	 hp.getDeletebutton().click();
	 hp.getHomebutton().click();
	 hp.getMonitorbutton().click();
	 hp.getMonitor().click();
	 hp.getAddtocart().click();
cu.waitforthealert(driver);
cu.acceptpopup(driver);
//hp.getHomecart().click();
	 cu.productname2(driver, fl.getDAtafrompropertyfile(propath, "productname3")).isDisplayed();
	 hp.getDeletebutton().click();
	  List<WebElement> text = driver.findElements(By.xpath("//td[2]"));
	 ArrayList a=new ArrayList();
	 a.add(text);
	 for (Object object : a) 
	 {
	System.out.println(object);	
	}
}
}
