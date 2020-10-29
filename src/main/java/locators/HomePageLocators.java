package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
	
	
	@FindBy(xpath="//span[@class='user-display']")
	public WebElement userNameLabel;
	@FindBy(xpath="//div//a//span[text()='Contacts']")
	public WebElement ContactsLink;
	@FindBy(xpath="//div//a//span[text()='Deals']")
	public WebElement DealsLink;
	@FindBy(xpath="//div//a//span[text()='Tasks']")
	public WebElement TasksLink;
	
	
}
