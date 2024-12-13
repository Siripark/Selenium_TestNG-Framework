package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagedemo extends BaseTest {
	// Constructor
	WebDriver driver;

	public LoginPagedemo(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//*[@id=\"loginlabel\"])[1]") WebElement loginclick;
	@FindBy(name = "log")WebElement uname;
	@FindBy(name = "pwd")WebElement upass;
	@FindBy(id = "wp-submit")WebElement submit;
	@FindBy(xpath = "//*[@id=\"gk-login-toggle\"]") WebElement logoutimage;

	@FindBy(xpath = "//a[contains(text(),'Logout')]") WebElement logoutclick;

	public void loginPortal(String username, String password) {
		loginclick.click();
		uname.sendKeys(username);
		upass.sendKeys(password);
		submit.click();
	}
	public void logout()
	{
		logoutimage.click();
		logoutclick.click();
	}

}
