package stepDefinations;

import base.TestBase;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.Before;


public class BeforeActions {
	
	@Before
	public static void setUp(Scenario scenario)
	{
		
		TestBase.setDriver();
		
	}
}
