package stepDefinations;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.SessionId;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
public class LoginPageTest  {
	LoginPage loginPage = new LoginPage();
	WebDriver driver;
	@Given("^user login in to the \"([^\"]*)\" website$")
    public void user_login_in_to_the_something_website(String webSite) {
		driver = TestBase.getDriver();
		System.out.println("Iam in the WebSite Page");
		TestBase.openPage(driver,webSite);
		System.out.println("In LoginUser Method");
		
    }
   
    @When("^user enters login credentials$")
    public void user_enters_login_credentials()  {
        String userName = System.getenv("CRM_USERNAME");
        String passWord = System.getenv("CRM_PASSWORD");
        if (userName == null || passWord == null) {
            throw new RuntimeException("CRM_USERNAME or CRM_PASSWORD environment variable not set");
        }
        loginPage.clickOnUsername(userName);
        loginPage.clickonPassword(passWord);
        loginPage.clickOnLoginBtn();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("^user should be able to enter HomePage$")
    public void user_should_be_able_to_enter_homepage()  {
    	System.out.println("User is on LoginPage");
    }
    
    @When("^User click on ForgetPasswork Link$")
    public void user_click_on_forgetpasswork_link() throws Throwable {
    	loginPage.clickonForgetPasswordLink();
    	System.out.println("In LoginUser Method");
    }

    @Then("^User should be able to Navigate to \"([^\"]*)\"$")
    public void user_should_be_able_to_navigate_to_something(String strArg1) throws Throwable {
        System.out.println("Logged In to ::"+strArg1);
    }

}
