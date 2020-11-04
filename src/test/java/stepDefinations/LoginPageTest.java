package stepdefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.crm.base.TestBase;
import com.crm.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageTest {
	public static Logger log =LogManager.getLogger(LoginPageTest.class.getName());
	LoginPage loginPage = new LoginPage();

	@Given("^user login in to the CRM  website$")
	public void user_login_in_to_the_crm_website() {
		TestBase.openPage();
	}
	@When("^User enter the Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
    public void user_enter_the_username_as_something_and_password_as_something(String userName, String passWord) {
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
	@When("^User click on ForgetPasswork Link$")
	public void user_click_on_forgetpasswork_link() {
		loginPage.clickonForgetPasswordLink();
		System.out.println("In LoginUser Method");
	}

	@Then("^user should be able to enter HomePage$")
	public void user_should_be_able_to_enter_homepage() {
		System.out.println("User is on LoginPage");
	}

	@Then("^User should be able to Navigate to passwordreset$")
	public void user_should_be_able_to_navigate_to_passwordreset() {
		System.out.println("Logged In to ::");
	}

}
