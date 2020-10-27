package stepDefinations;

import base.TestBase;
import io.cucumber.java.Before;


public class BeforeActions {

	@Before
	public static void setUp()
	{
		TestBase.setDriver();
	}
}
