package stepdefinations;

import com.crm.base.TestBase;
import com.crm.pages.ContactsPage;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactsPageTest {
	public static LoginPage loginPage;
	public static HomePage homePage;
	public static ContactsPage contactsPage;
	public static Logger log =LogManager.getLogger(ContactsPageTest.class.getName());
	@Given("^user logged in to the CRM website$")
	public void user_logged_in_to_the_crm_website() {
		loginPage = new LoginPage();
		homePage = new HomePage();
		contactsPage = new ContactsPage();
		TestBase.openPage();
	}

	@When("^User enter the Username as \"([^\"]*)\" as Password as \"([^\"]*)\" in Logginpage$")
	public void user_enter_the_username_as_something_as_password_as_something_in_logginpage(String userName,
			String passWord) {
		loginPage.clickOnUsername(userName);
		loginPage.clickonPassword(passWord);
		loginPage.clickOnLoginBtn();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@And("^user should be able to enter HomePage and user should click on ContactsPage$")
	public void user_should_be_able_to_enter_homepage_and_user_should_click_on_contactspage() {
		System.out.println("Logged In User" + homePage.getLoggedInUserName());
		homePage.ContactsLink();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@And("^User lands on ContactsPage$")
	public void user_lands_on_contactspage() {
		System.out.println("User Landed on Contacts Page");
	}

	@And("^User clicks on the New Contact button$")
	public void user_clicks_on_the_new_contact_button() {
		contactsPage.clickoncreateNewContact();
	}

	@And("^enters the FirstName LastName and EmailID and Clicks on Save$")
	public void enters_the_firstname_lastname_and_emailid_and_clicks_on_save(DataTable table) {

		for (Map<Object, Object> data : table.asMaps(String.class, String.class)) {
			String firstName = (String) data.get("FirstName");
			String lastName = (String) data.get("LastName");
			String eMail = (String) data.get("EmailID");
			contactsPage.createContactwithDetails(firstName, lastName, eMail);
			contactsPage.clickonSaveButton();

		}
	}

	@Then("^Contact should be created$")
	public void contact_should_be_created() {
		System.out.println("New Contact is created");
	}

	@And("^User clicks on selectall contacts radiobutton$")
	public void user_clicks_on_selectall_contacts_radiobutton() throws InterruptedException {
		Thread.sleep(3000);
		contactsPage.selectContactList();
		
	}

	@And("^User clicks on dropdown$")
	public void user_clicks_on_dropdown() {
		contactsPage.clickonDropDown();
	}

	@Then("^Contacts on firstpage should be deleted$")
	public void contacts_on_firstpage_should_be_deleted() {
		contactsPage.selectDeleteDropDown();
		contactsPage.deleteContacts();
	}

	@And("^click on Search Filter with LastName$")
	public void click_on_search_filter_with_lastname() {
		contactsPage.clickonSearchFilter();
	}

	@And("^selects the filter with StartsWith$")
	public void selects_the_filter_with_startswith() {
		contactsPage.clickonSearchTypeFilter();
	}

	@And("^Enter the Search Keyword as \"([^\"]*)\" and clicks on Search button$")
	public void enter_the_search_keyword_as_something_and_clicks_on_search_button(String Name) {
		contactsPage.enterSearchKeyword(Name);
		contactsPage.clickonSearchButton();
	}

	@Then("^Contacts with name starting with \"([^\"]*)\" should display$")
	public void contacts_with_name_starting_with_something_should_display(String strArg1) {
		System.out.println("Names displayed with lastname Starts with"+strArg1);
	}

}
