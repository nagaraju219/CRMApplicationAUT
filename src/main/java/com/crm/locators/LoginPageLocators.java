package com.crm.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
	WebDriver driver;
	
	@FindBy(name="email")
	public WebElement emailField;
	
	@FindBy(name="password")
	public WebElement passwordField;
	
	@FindBy(xpath="//div[text()='Login']")
	public WebElement loginButton;
	
	@FindBy(xpath="//div//a[text()='Forgot your password?']")
	public WebElement ForgetPasswordLink;
	
	@FindBy(xpath="//div//a[text()='Classic CRM']")
	public WebElement ClassicCRMLink;
	
	@FindBy(xpath="//div//a[text()='Sign Up']")
	public WebElement SignUpLink;
	
}
