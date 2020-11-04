package stepdefinations;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.crm.base.TestBase;
import com.crm.utils.ExtentManager;
import com.crm.utils.LoggingManager;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;

public class AfterActions {
	
	
	static String screenshotFileName = "C:\\Users\\lenovo\\workspace\\CRMApplicationAUT\\src\\main\\resources\\screehshots\\"
			+ System.nanoTime() + ".jpeg";

	@After
	public static void tearDown(Scenario scenario) {
		LoggingManager.log = LoggingManager.LoggingManager(AfterActions.class.getName());
		WebDriver driver = TestBase.getDriver();
		System.out.println(scenario.isFailed());
		if (scenario.isFailed()) {
			byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshotBytes, "image/png");
		}
		ExtentManager.createTest(scenario, screenshotFileName);
		ExtentManager.extentreportFlusher();
		LoggingManager.log.info("Driver has been closed");
		TestBase.tearDown();

	}

}
