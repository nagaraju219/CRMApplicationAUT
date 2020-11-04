package com.crm.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.TestBase;
import com.crm.locators.LoginPageLocators;
import com.crm.utils.LoggingManager;

public class LoginPage {
	public static Logger log;
	private static WebDriver driver;
	LoginPageLocators loginPageLocators = new LoginPageLocators();
	
	public LoginPage()
	{
		driver = TestBase.getDriver();
		LoggingManager.log = LoggingManager.LoggingManager(LoginPage.class.getName());
		PageFactory.initElements(driver,loginPageLocators);
		
	}
	public void clickOnUsername(String username)
	{
		LoggingManager.log.info("Username has ben entered successfully");
		loginPageLocators.emailField.sendKeys(username);
		
	}
	public void clickonPassword(String passWord)
	{
		LoggingManager.log.info("Password has ben entered successfully");
		loginPageLocators.passwordField.sendKeys(passWord);
	}
	
	public void clickOnLoginBtn()
	{
		LoggingManager.log.info("Login Button has been clicked successfully");
		loginPageLocators.loginButton.click();
	}
	
	public void clickonForgetPasswordLink()
	{
		LoggingManager.log.info("Password link has been clicked successfully");
		loginPageLocators.ForgetPasswordLink.click();
		
	}
	
	
}
