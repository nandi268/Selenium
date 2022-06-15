package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By userName = By.id("userName");
	By password = By.id("password");
	By login = By.xpath("//button[text()='Login']");
	By logout=By.xpath("//button[text()='Log out']");

	public void enterUserName(String user) {
		driver.findElement(userName).clear();
		driver.findElement(userName).sendKeys(user);
	}

	public void enterPassword(String passWord) {
		driver.findElement(By.id("password")).clear();
		driver.findElement(password).sendKeys(passWord);
	}

	public void loginButton() {
		driver.findElement(login).click();
	}
	
	public boolean logoutButton() {
		return driver.findElement(logout).isDisplayed();
	}
}
