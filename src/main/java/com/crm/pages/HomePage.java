package com.crm.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.TestBase;
import com.crm.locators.HomePageLocators;
import com.crm.utils.LoggingManager;

public class HomePage {
	public static Logger log;
	private static WebDriver driver;
	HomePageLocators homePageLocators = new HomePageLocators();
	public HomePage()
	{
		driver = TestBase.getDriver();
		PageFactory.initElements(driver, homePageLocators);
		LoggingManager.log = LoggingManager.LoggingManager(HomePage.class.getName());
	}
	public String HomePageTitle()
	{
		LoggingManager.log.info("HomePage Title has been returned");
		return driver.getTitle();
	}
	
	public void ContactsLink()
	{
		LoggingManager.log.info("Contact Links has been clicked Successfully");
		homePageLocators.ContactsLink.click();
	}
	public String getLoggedInUserName()
	{
		LoggingManager.log.info("Username has been selected");
		return homePageLocators.userNameLabel.getText();
	}
	
	public void TasksLink()
	{
		LoggingManager.log.info("Task Links has been clicked");
		homePageLocators.TasksLink.click();
	}
	
}
