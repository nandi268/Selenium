package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.JavaScriptExecutors;
import utils.WaitHelper;


public class LoginPage {

	public WebDriver driver;
	 WaitHelper waitHelper;
	 public JavaScriptExecutors javaScriptExecutor;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		javaScriptExecutor=new JavaScriptExecutors(driver);
	}

	@FindBy(xpath="//*[@id='email']")
	WebElement emailAddress;
	
	By userName = By.id("userName");
	By password = By.id("password");
	By login = By.xpath("//button[text()='Login']");
	By logout=By.xpath("//button[text()='Log out']");
	By errorLoginMessage=By.xpath("//*[text()='Invalid username or password!']");

	public void enterUserName(String user) {
		driver.findElement(userName).clear();		
		driver.findElement(userName).sendKeys(user);
	}

	public void enterPassword(String passWord) {
		driver.findElement(By.id("password")).clear();
		driver.findElement(password).sendKeys(passWord);
	}

	public void loginButton() throws InterruptedException {
		WebElement login1=driver.findElement(login);
		javaScriptExecutor.executeScriptByXpath(login1);
//		driver.findElement(login).click();
	}
	
	
	
	public boolean logoutButton() {
//		waitHelper.WaitForElementVisibleWithPollingTime(this.driver.findElement(logout), 15, 3);
//		waitHelper.waitForElementToVisible(driver.findElement(logout), 100);
		return driver.findElement(logout).isDisplayed();
	}
	
	public boolean verifyLoginErrorMessage() {
		return driver.findElement(errorLoginMessage).isDisplayed();
	}
	

}
