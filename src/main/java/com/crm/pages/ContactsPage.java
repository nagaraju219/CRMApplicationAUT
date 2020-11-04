package com.crm.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.TestBase;
import com.crm.locators.ContactsPageLocators;
import com.crm.utils.LoggingManager;

public class ContactsPage {
	public static Logger log;
	private static WebDriver driver;
	ContactsPageLocators contactsPageLocators = new ContactsPageLocators();
	
	public ContactsPage()
	{
		driver = TestBase.getDriver();
		PageFactory.initElements(driver,contactsPageLocators);
		LoggingManager.log = LoggingManager.LoggingManager(ContactsPage.class.getName());
	}
	
	public void clickoncreateNewContact()
	{
		LoggingManager.log.info("The click on new contact has been done successfully");
		contactsPageLocators.NewContact.click();
	}
	
	public void createContactwithDetails(String firstName,String lastName,String eMail)
	{
		contactsPageLocators.FirstName.sendKeys(firstName);
		contactsPageLocators.LastName.sendKeys(lastName);
		contactsPageLocators.Email.sendKeys(eMail);
		LoggingManager.log.info("New contact details are entered"+firstName+" "+lastName+" "+eMail);
	}
	public void clickonSaveButton()
	{
		contactsPageLocators.SaveBtn.click();
		LoggingManager.log.info("Contact details are entered on clicked on SaveButton");
	}
	
	public void selectContactList()
	{
		contactsPageLocators.SelectContactsList.click();
		LoggingManager.log.info("Contact list has been selected");
	}
	
	public void clickonDropDown()
	{
		contactsPageLocators.DropDownSelect.click();
		LoggingManager.log.info("DropDown has been selected");
		
		
	}
	public void selectDeleteDropDown()
	{
		contactsPageLocators.DropDownSelect.sendKeys(Keys.ENTER);
		contactsPageLocators.DeleteClick.click();
		LoggingManager.log.info("Delete option has been selected from the dropdown");
	}
	public void deleteContacts()
	{
		contactsPageLocators.DeleteButton.click();
		LoggingManager.log.info("Contacts on the firstrow deleted successfully");
	}
	
	public void clickonSearchFilter()
	{
		contactsPageLocators.ShowFilter.click();
		contactsPageLocators.NameFilter.click();
		contactsPageLocators.LastNameFilter.click();
		
	}
	
	public void clickonSearchTypeFilter()
	{
		contactsPageLocators.TypeFilter.click();
		contactsPageLocators.TypeFilterStartsWith.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void enterSearchKeyword(String Key)
	{
		contactsPageLocators.TypeSearch.sendKeys(Key);
	}
	
	public void clickonSearchButton()
	{
		contactsPageLocators.SearchButton.click();
	}
	

}
