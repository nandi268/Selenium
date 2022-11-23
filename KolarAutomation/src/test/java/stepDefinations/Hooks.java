package stepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class Hooks {
//	TestContextSetup testContextSetup;
//	
//	public Hooks(TestContextSetup testContextSetup){
//		this.testContextSetup=testContextSetup;
//	}
//	
//	//This method will quite the browser after every scenario
//	@After
//	public void AfterScenario() {
//		testContextSetup.testBase.webDriverManager().quit();
//	}
//	
//	
//	//This method will take the screenshot after step got failed
//	
//	@AfterStep
//	public void AddScreenshot(Scenario scenario) throws IOException {
//		WebDriver driver=testContextSetup.testBase.webDriverManager();
//		
//		if(scenario.isFailed()) {
//		File filecontent=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		byte[] file = FileUtils.readFileToByteArray(filecontent);
//		scenario.attach(file, "image/png", "image");
//		
//		}
//		
//	}
//	

}
