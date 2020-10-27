package stepDefinations;

import org.junit.runner.RunWith;

import base.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pages.LoginPage;
public class LoginPageTest {
	LoginPage loginPage = new LoginPage();
    @Given("^When user login in to the \"([^\"]*)\" website$")
    public void when_user_login_in_to_the_something_website(String webSite)  {
    	TestBase.openPage(webSite);
    }

    @When("^User enter the Username as \"([^\"]*)\" as Password as \"([^\"]*)\"$")
    public void user_enter_the_username_as_something_as_password_as_something(String userName, String passWord)  {
    	loginPage.clickOnUsername(userName);
    	loginPage.clickonPassword(passWord);
    	loginPage.clickOnLoginBtn();
    	try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @Then("^user should be able to enter HomePage$")
    public void user_should_be_able_to_enter_homepage()  {
    	System.out.println("User is on LoginPage");
    }

}
