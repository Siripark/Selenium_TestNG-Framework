package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

import com.qa.base.BaseClass;

public class RegistrationPage extends BaseClass {
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	@FindBy (xpath="//a[@class='ico-register']")
	WebElement RegisterButton;
	
	@FindBy(xpath="//*[@id='gender-female']")
	WebElement gender;
	
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='LastName']")
	WebElement lastName;
	
	@FindBy(xpath="//*[@id='Email']")
	WebElement email;
	
	@FindBy(xpath="//*[@id='Password']")
	WebElement password;
	
	@FindBy(xpath="//*[@id='ConfirmPassword']")
	WebElement confirmPassword;
	
	@FindBy(xpath="//*[@name='register-button']")
	WebElement confirmregister;
	
	@FindBy(xpath="(//a[@class='account'])[1]")
	WebElement account;
	
	public void register(String first, String last, String mail) {
		RegisterButton.click();
		gender.click();
		firstName.sendKeys(first);
		lastName.sendKeys(last);
		email.sendKeys(mail);
		 
	}
	public void userPassword(String pass, String confirmpass) {
		password.sendKeys(pass);
		 confirmPassword.sendKeys(confirmpass);
	}
	public void register() {
		confirmregister.click();
	}
	public String user() {
		String acc= account.getText();
		return acc;
		
	}
	


}
