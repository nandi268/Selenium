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
import utils.TestSetup;

public class Hooks {
	public TestSetup testSetup;

	public Hooks(TestSetup testSetup) {
		this.testSetup = testSetup;
	}

	@After
	public void AfterScenario() throws IOException {
		testSetup.testBase.webDriverManager().quit();

	}

	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {

			WebDriver driver = testSetup.testBase.webDriverManager();
			// Screenshot
			File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
			scenario.attach(fileContent, "image/png", "image");

		}

	}

}
