package stepDefinations;

import org.openqa.selenium.WebDriver;

import base.TestBase;
import io.cucumber.java.Before;


public class BeforeActions {
	
	@Before
	public static void setUp()
	{
		TestBase.setDriver();
		System.out.println("In Before Method");
		
	}
}
