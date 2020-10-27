package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import locators.LoginPageLocators;

public class LoginPage {
	private WebDriver driver = TestBase.getDriver();
	LoginPageLocators loginPageLocators = new LoginPageLocators();
	
	public LoginPage()
	{
		PageFactory.initElements(driver,loginPageLocators);
		
	}
	public void clickOnUsername(String userName)
	{
		loginPageLocators.emailField.sendKeys(userName);
		
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
	public WebDriver LoginPageDriver()
	{
		return driver;
	}
	

}
