package stepdefinations;

import com.crm.base.TestBase;
import com.crm.utils.ExtentManager;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.Before;


public class BeforeActions {
	private static boolean isReporterRunning;
	@Before
	public static void setUp(Scenario scenario)
	{
		
		TestBase.setDriver();
		if(!isReporterRunning)
		{
			ExtentManager.ReportInitialization("C:\\Users\\lenovo\\workspace\\CRMApplicationAUT\\src\\main\\resources\\extent\\TestReport.html");
			isReporterRunning =true;
	}
		
	}
	
}
