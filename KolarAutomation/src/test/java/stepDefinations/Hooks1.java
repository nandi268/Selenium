package stepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class Hooks1 {
	
	TestContextSetup testContextSetup;
	
	public Hooks1(TestContextSetup testContextSetup){
		this.testContextSetup=testContextSetup;
	}
	
	@After
	public void quiteBrowser() {
		testContextSetup.testBase.webDriverManager().quit();
	}
	
	
	
	@AfterStep
	public void addScreenShot(Scenario sceanrio) throws IOException {
		
		
		if(sceanrio.isFailed()) {
			
			
			File source=((TakesScreenshot)testContextSetup.testBase.webDriverManager()).getScreenshotAs(OutputType.FILE);
			byte[] file = FileUtils.readFileToByteArray(source);
			
			sceanrio.attach(file, "image/png", "image");
			
			
		}
	}

}
