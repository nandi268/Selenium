package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestSetup {

	// Some times it is working with static webdriver
	public WebDriver driver;
	public TestBase testBase;
	public PageObjectManager pageObjectManager;
	public GenericUtils genericUtils;

	public TestSetup() throws IOException {
		testBase = new TestBase();
		pageObjectManager = new PageObjectManager(testBase.webDriverManager());
		genericUtils = new GenericUtils(testBase.webDriverManager());
	}

}
