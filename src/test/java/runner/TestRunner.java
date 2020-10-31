package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src\\test\\java\\features"
 ,glue={"stepdefinations"},plugin = {"json:target/positive/cucumber.json", "pretty","html:target/positive/cucumber.html"},monochrome=true )
public class TestRunner {
	
	

}
