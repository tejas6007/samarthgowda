package com.tesescripts.demoblaze;

import org.testng.annotations.Test;

import com.genericlib.demoblaze.Base;


public class Sample1 extends Base{
	@Test(groups="smoke")
	public void test()
	{
		
		driver.get("https://www.flipkart.com");
		System.out.println("i am pa ");
		
	}
	@Test(groups="smoke")
	public void test2()
	{
		System.out.println("iam too good");
		
		
	}
	@Test(groups="smoke")
	public void test3()
	{
		System.out.println(" i amm tooo good");
	}

}
