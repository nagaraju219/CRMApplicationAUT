package com.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.TestBase;
import com.crm.locators.HomePageLocators;

public class HomePage {
	private static WebDriver driver;
	HomePageLocators homePageLocators = new HomePageLocators();
	public HomePage()
	{
		driver = TestBase.getDriver();
		PageFactory.initElements(driver, homePageLocators);
	}
	public String HomePageTitle()
	{
		return driver.getTitle();
	}
	
	public void ContactsLink()
	{
		homePageLocators.ContactsLink.click();
	}
	public String getLoggedInUserName()
	{
		return homePageLocators.userNameLabel.getText();
	}
	
	public void TasksLink()
	{
		homePageLocators.TasksLink.click();
	}

}
