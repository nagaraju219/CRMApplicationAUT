package com.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.TestBase;
import com.crm.locators.LoginPageLocators;

public class LoginPage {
	private static WebDriver driver;
	LoginPageLocators loginPageLocators = new LoginPageLocators();
	
	public LoginPage()
	{
		driver = TestBase.getDriver();
		PageFactory.initElements(driver,loginPageLocators);
		
	}
	public void clickOnUsername(String username)
	{
		loginPageLocators.emailField.sendKeys(username);
		
	}
	public void clickonPassword(String passWord)
	{
		loginPageLocators.passwordField.sendKeys(passWord);
	}
	
	public void clickOnLoginBtn()
	{
		loginPageLocators.loginButton.click();
	}
	
	public void clickonForgetPasswordLink()
	{
		loginPageLocators.ForgetPasswordLink.click();
		
	}
	
}
