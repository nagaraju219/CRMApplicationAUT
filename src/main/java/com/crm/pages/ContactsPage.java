package com.crm.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.TestBase;
import com.crm.locators.ContactsPageLocators;

public class ContactsPage {
	private static WebDriver driver;
	ContactsPageLocators contactsPageLocators = new ContactsPageLocators();
	
	public ContactsPage()
	{
		driver = TestBase.getDriver();
		PageFactory.initElements(driver,contactsPageLocators);
	}
	
	public void clickoncreateNewContact()
	{
		contactsPageLocators.NewContact.click();
	}
	
	public void createContactwithDetails(String firstName,String lastName,String eMail)
	{
		contactsPageLocators.FirstName.sendKeys(firstName);
		contactsPageLocators.LastName.sendKeys(lastName);
		contactsPageLocators.Email.sendKeys(eMail);
	}
	public void clickonSaveButton()
	{
		contactsPageLocators.SaveBtn.click();
	}
	
	public void selectContactList()
	{
		contactsPageLocators.SelectContactsList.click();
	}
	
	public void clickonDropDown()
	{
		contactsPageLocators.DropDownSelect.click();
		
		
	}
	public void selectDeleteDropDown()
	{
		contactsPageLocators.DropDownSelect.sendKeys(Keys.ENTER);
		contactsPageLocators.DeleteClick.click();
	}
	public void deleteContacts()
	{
		contactsPageLocators.DeleteButton.click();
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
