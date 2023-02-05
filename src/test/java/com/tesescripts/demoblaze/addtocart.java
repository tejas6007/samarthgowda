package com.tesescripts.demoblaze;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.genericlib.demoblaze.Base;
@Listeners
public class addtocart extends Base{
@Test
public void addtoCartTest() throws IOException, InterruptedException {
	test=extent.createTest("add product to the cart");
	
	test.pass("logged in  demo blaze as as"+fl.getDAtafrompropertyfile(propath, "uername"));
cu.productname(driver, fl.getDAtafrompropertyfile(propath, "productname")).click();
test.pass("navigated to product details page");
hp.getAddtocart().click();;
cu.waitforthealert(driver);
cu.acceptpopup(driver);
System.out.println("added product to the cart");

hp.getHomecart().click();
 Assert.assertTrue(cu.productname2(driver, fl.getDAtafrompropertyfile(propath, "productname")).isDisplayed());
 hp.getDeletebutton().click();
 Thread.sleep(2000);
 
try {
	cu.productname2(driver, fl.getDAtafrompropertyfile(propath, "productname")).isDisplayed();
Assert.assertTrue(false);
}
catch(NoSuchElementException e)
{
	System.out.println("tc is passed");
}
test.pass("product has been deleted from the cart" );

}
}
