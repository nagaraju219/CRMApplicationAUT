package stepdefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.crm.base.TestBase;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageTest {
	
	public static Logger log =LogManager.getLogger(HomePageTest.class.getName());
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();

	@Given("^user login in to the CRM website$")
	public void user_login_in_to_the_crm_website() {
		
		TestBase.openPage();
	}

	@When("^User enter the Username as \"([^\"]*)\" as Password as \"([^\"]*)\"$")
	public void user_enter_the_username_as_something_as_password_as_something(String userName, String passWord) {
		loginPage.clickOnUsername(userName);
		loginPage.clickonPassword(passWord);
		loginPage.clickOnLoginBtn();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@And("^user should be able to enter HomePage and user should click on ContactsPage Link$")
	public void user_should_be_able_to_enter_homepage_and_user_should_click_on_contactspage_link()
			throws InterruptedException {
		System.out.println("Logged In User" + homePage.getLoggedInUserName());
		homePage.ContactsLink();
		Thread.sleep(3000);
	}

	@Then("^User should land on ContactsPage$")
	public void user_should_land_on_contactspage() {
		System.out.println("User is on Contacts Page");
	}

	@And("^user should be able to enter HomePage and user should click on Tasks Link$")
	public void user_should_be_able_to_enter_homepage_and_user_should_click_on_tasks_link() {
		homePage.TasksLink();
		
	}

	@Then("^User should land on TasksPage$")
	public void user_should_land_on_taskspage() {
		System.out.println("User is on Tasks Page");
		
	}

}
