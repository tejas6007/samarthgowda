package com.tesescripts.demoblaze;

import org.testng.annotations.Test;

import com.genericlib.demoblaze.Base;


public class Sample1 extends Base{
	@Test
	public void test()
	{
		System.out.println("chrome started sucessfully");
		driver.get("https://www.flipkart.com");
		System.out.println("i am pa ");
		
	}
	@Test
	public void test2()
	{
		System.out.println("iam too good");
		
		
	}
	@Test
	public void test3()
	{
		System.out.println(" i amm tooo good");
	}

}
