package com.qa.testcases;


import org.testng.annotations.Test;

import com.qa.base.BaseClass;

public class TC_LinkTest_001 extends BaseClass{
	@Test
	public void linktest(){
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
	}

}
