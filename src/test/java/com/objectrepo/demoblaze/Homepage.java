package com.objectrepo.demoblaze;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{	
	WebDriver driver=null;
	
@FindBy(xpath="//a[.='Log in']")
private  WebElement HomeLogin;

@FindBy(xpath="//a[.='Cart']")
private  WebElement homecart;

@FindBy(xpath="//input[@id='loginusername']")
private WebElement homeusername;

@FindBy (xpath="//a[.='Log out']")
private WebElement logout;

@FindBy (xpath="//a[@id='cat']/..//a[.='Laptops']")
private WebElement laptopname;

@FindBy (xpath="//a[.='Apple monitor 24']")
private WebElement monitor;

@FindBy (xpath="//a[@id='cat']/..//a[.='Monitors']")
private WebElement monitorbutton;

@FindBy (xpath="//div[@id='navbarExample']//a[@href='index.html']")
private WebElement homebutton;



public WebElement getHomebutton() {
	return homebutton;
}

public WebElement getMonitor() {
	return monitor;
}

public WebElement getMonitorbutton() {
	return monitorbutton;
}

public WebElement getLaptopname() {
	return laptopname;
}

public WebDriver getDriver() {
	return driver;
}

public WebElement getSonylaptop() {
	return sonylaptop;
}

public WebElement getUserlogin() {
	return userlogin;
}

@FindBy (xpath="//a[.='Sony vaio i5']")
private WebElement sonylaptop;

@FindBy(xpath="//input[@id='loginpassword']")
private WebElement homepassword;

@FindBy (xpath="//button[.='Log in']")
private WebElement userlogin;

@FindBy(xpath="//a[.='Add to cart']")
private WebElement addtocart;

@FindBy(xpath="//a[.='Welcome tejas007']")
private WebElement verifylogin;

@FindBy(xpath="//a[.='Samsung galaxy s6']")
private WebElement samsunggalays6;

@FindBy(xpath="//a[.='Delete']")
private WebElement deletebutton;
public WebElement getSamsunggalays6() {
	return samsunggalays6;
}
public WebElement getDeletebutton() {
	return deletebutton;
}
public WebElement getHomeLogin() {
	return HomeLogin;
}
public WebElement getHomecart() {
	return homecart;
}
public WebElement getHomeusername() {
	return homeusername;
}
public WebElement getHomepassword() {
	return homepassword;
}
public WebElement getuserlogin() {
	return userlogin;	
}
public WebElement getAddtocart() {
	return addtocart;
}
public WebElement getVerifylogin() {
	return verifylogin;
}
public WebElement getLogout() {
	return logout;
}
}



