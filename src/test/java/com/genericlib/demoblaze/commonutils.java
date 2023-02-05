package com.genericlib.demoblaze;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class commonutils 
{
	WebDriverWait wait;
public WebElement productname(WebDriver driver,String productname) {
	return driver.findElement(By.xpath("//a[.='"+productname+"']"));
}
	public WebElement productname2(WebDriver driver,String productname) {
		return driver.findElement(By.xpath("//td[.='"+productname+"']"));
	}
		public void waitforThetext(WebDriver driver,WebElement e,String text)
		{
			 wait=new WebDriverWait(driver,Duration.ofSeconds(15));
			wait.until(ExpectedConditions.textToBePresentInElement(e, text));
			
}
		public WebElement productname3(WebDriver driver,String productname3) {
			return driver.findElement(By.xpath("//td[.='"+productname3+"']"));
		}
		public WebElement lapproduct(WebDriver driver,String productname2)
		{
			return driver.findElement(By.xpath("//a[.='"+productname2+"']"));
		}
		public void implicitlywait(WebDriver driver)
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		}
		public void Scrollbar(WebDriver driver)
		{
			JavascriptExecutor jss = (JavascriptExecutor)driver;
			jss.executeScript("window.scrollBy(0,500)","");
		}
		
	public void acceptpopup(WebDriver driver) {
			 
	Alert alt = driver.switchTo().alert();
	alt.accept();
		
	}
	public void waitforthealert(WebDriver driver ) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.alertIsPresent());
		
	}
	
}
