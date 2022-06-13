package pageObjets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObject {

	WebDriver driver;

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	By username = By.id("userName");
	By password = By.id("password");
	By loginButton = By.xpath("//button[text()='Login']");
	By logout = By.xpath("//button[text()='Log out']");

	public void enterUsername(String userName) {

		driver.findElement(username).sendKeys(userName);
	}

	public void enterPassword(String passWord) {

		driver.findElement(password).sendKeys(passWord);
	}

	public void loginButton() {

		driver.findElement(loginButton).click();
	}

	public boolean logoutButton() {

		boolean logout1 = driver.findElement(logout).isDisplayed();
		return logout1;
	}

}
