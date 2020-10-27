package stepDefinations;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import base.TestBase;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;


public class AfterActions {
	
	@After
	public static void tearDown(Scenario scenario)
	{
		WebDriver driver = TestBase.getDriver();
		System.out.println(scenario.isFailed());
		if(scenario.isFailed())
		{
			byte[] screenshotBytes = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshotBytes, "image/png");
		}
		TestBase.tearDown();
	}

}
