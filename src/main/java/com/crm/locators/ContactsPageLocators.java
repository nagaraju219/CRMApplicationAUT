package com.crm.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPageLocators {
	
	@FindBy(xpath="//button[text()='New']")
	public WebElement NewContact;
	
	@FindBy(xpath="//input[@name='first_name']")
	public WebElement FirstName;
	
	@FindBy(xpath="//input[@name='last_name']")
	public WebElement LastName;
	
	@FindBy(xpath="//input[@placeholder='Email address']")
	public WebElement Email;
	
	@FindBy(xpath="//button[text()='Save']")
	public WebElement SaveBtn;
	
	@FindBy(xpath="//table[@class='ui celled sortable striped table custom-grid table-scroll']//thead//tr/th[@class='collapsing']")
	public WebElement SelectContactsList;
	
	@FindBy(xpath="//div[@name='action']")
	public WebElement DropDownSelect;
	
	@FindBy(xpath="//div[@class='ui basic icon left attached button']")
	public WebElement DeleteClick;
	
	@FindBy(xpath="//div[@class='ui small modal transition visible active']//div[@class='actions']//button[text()='Delete']")
	public WebElement DeleteButton;
	
	@FindBy(xpath="//button[@class='ui linkedin button' and text()='Show Filters']")
	public WebElement ShowFilter;
	
	@FindBy(xpath="//div[@class='field']//div[@name='name'][1]")
	public WebElement NameFilter;
	
	@FindBy(xpath="//div[@class='ui active visible search selection dropdown']//div//div//span[text()='Last Name']")
	public WebElement LastNameFilter;
	
	@FindBy(xpath="//div[@class='ui active visible selection dropdown']//div/div//span[text()='Starts with']")
	public WebElement TypeFilterStartsWith;
	
	@FindBy(xpath="//div[@class='field']//div[@name='operator']")
	public WebElement TypeFilter;
	
	@FindBy(xpath="//input[@name='value']")
	public WebElement TypeSearch;
	
	@FindBy(xpath="//button[@class='ui small icon button' and @style='float: right;']")
	public WebElement SearchButton;
	
	
}
