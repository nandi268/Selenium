package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public LoginPage loginPage;
	public PracticeForm practiceForm;
	public HomePage homePage;
	public WebDriver driver;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public LoginPage getLoginPage() {
		loginPage = new LoginPage(driver);
		return loginPage;
	}

	public PracticeForm getPracticeForm() {
		practiceForm = new PracticeForm(driver);
		return practiceForm;
	}

	public HomePage getHomePage() {
		homePage = new HomePage(driver);
		return homePage;
	}

}
