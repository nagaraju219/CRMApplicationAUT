package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import locators.HomePageLocators;

public class HomePage {
	private WebDriver driver = TestBase.getDriver();
	HomePageLocators homePageLocators = new HomePageLocators();
	public HomePage()
	{
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
