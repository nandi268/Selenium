package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "@target/failed_scenario.txt", glue = "stepDefinations", 
          monochrome = true, plugin = {
		"html:target/cucumer.html", "json:target/cucumber.json", 
		"rerun:target/failed_scenario.txt"
		  })
public class FailedTestRunner extends AbstractTestNGCucumberTests {

}
