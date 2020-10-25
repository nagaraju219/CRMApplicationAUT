package stepDefinations;

import org.junit.runner.RunWith;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
public class LoginPageTest {
	
    @Given("^When user login in to the \"([^\"]*)\" website$")
    public void when_user_login_in_to_the_something_website(String webSite)  {
    	System.out.println(webSite);
    }

    @When("^User enter the Username as \"([^\"]*)\" as Password as \"([^\"]*)\"$")
    public void user_enter_the_username_as_something_as_password_as_something(String userName, String passWord)  {
        System.out.println(userName+" "+passWord);
    }

    @Then("^user should be able to enter HomePage$")
    public void user_should_be_able_to_enter_homepage()  {
        System.out.println("Logged into Home Page");
    }

}
