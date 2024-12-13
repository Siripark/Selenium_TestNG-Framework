package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import com.qa.base.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath="//a[@class='ico-login']")
	WebElement LoginButton;
	
	@FindBy (xpath="//*[@id='Email']")
	WebElement userID;
	
	@FindBy (xpath="//a[@id='Password']")
	WebElement password;
	
	@FindBy (xpath="//*[@class='button-1 login-button']")
	WebElement login;
	
	public void logInCredentials(String id, String pass) {
		LoginButton.click();
		userID.sendKeys(id);
		password.sendKeys(pass);		 
	}

	public void logIn() {
		login.click();
	}

}
