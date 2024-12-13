package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.RegistrationPage;

public class TC_RegisterPage_002 extends BaseClass {
	@Test(priority=1)
	public void test1() {
		TC_LinkTest_001 tc1= new TC_LinkTest_001();
		tc1.linktest();
	}
	@Test(priority=2)
	public void tets2() {
		RegistrationPage rp= new RegistrationPage(driver);
		rp.register("Siri","Parkkyungsoo","Siripark128@gmail.com");
		rp.userPassword("siri1234","siri1234");
		rp.register();
	}
	@Test
	public void testUserVerify() {
		RegistrationPage rp= new RegistrationPage(driver);
		String actualUser =rp.user();
		System.out.println("Actual User name is : "+ actualUser);
		String expectUser="Siripark128@gmail.com";
		System.out.println("Actual User name is : "+ expectUser);
		Assert.assertEquals(actualUser, expectUser);
	}

}
