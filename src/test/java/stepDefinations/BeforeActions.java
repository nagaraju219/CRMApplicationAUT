package stepdefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;

import com.crm.base.TestBase;
import com.crm.pages.ContactsPage;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.utils.ExtentManager;
import com.crm.utils.LoggingManager;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.Before;


public class BeforeActions {
	
	private static boolean isReporterRunning;
	@Before
	public static void setUp(Scenario scenario)
	{	
		LoggingManager.log = LoggingManager.LoggingManager(BeforeActions.class.getName());
		TestBase.setDriver();
		if(!isReporterRunning)
		{
			ExtentManager.ReportInitialization("C:\\Users\\lenovo\\workspace\\CRMApplicationAUT\\src\\main\\resources\\extent\\TestReport.html");
			isReporterRunning =true;
			LoggingManager.log.info("Chrome Driver is set");
	}
		
	}

	
}
