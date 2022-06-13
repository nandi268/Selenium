package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjets.LoginPageObject;
import utils.TestSetup;

public class LoginStepDefination {
	
	TestSetup testSetup;
	
	public LoginStepDefination(TestSetup testSeetup) {
		this.testSetup=testSetup;
	}
	public WebDriver driver;
	
	@Given("Launched the browser and open the login page")
	public void launched_the_browser_and_open_the_login_page() throws InterruptedException {
	  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Documents\\Param\\Softwares\\chromedriver_win32\\chromedriver.exe");
		testSetup.driver=new ChromeDriver();
		testSetup.driver.get("https://demoqa.com/login");
//		testSetup.driver.get("https://parabank.parasoft.com/parabank/index.htm");
		testSetup.driver.manage().window().maximize();
		Thread.sleep(5000);
		
	}
	
	@When("Login to the application with username {string} and password {string}")
	public void login_to_the_application_with_username_and_password(String username, String password) throws InterruptedException {
		LoginPageObject loginPage=new LoginPageObject(testSetup.driver);		
		loginPage.enterUsername(username);		
		loginPage.enterPassword(password);		
		loginPage.loginButton();		
//		testSetup.driver.findElement(By.id("userName")).clear();
//		testSetup.driver.findElement(By.id("userName")).sendKeys(username);
//		testSetup.driver.findElement(By.id("password")).clear();
//		testSetup.driver.findElement(By.id("password")).sendKeys(password);
//		testSetup.driver.findElement(By.xpath("//button[text()='Login']")).click(); 
//		testSetup.driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys(username);
		Thread.sleep(8000);
	}
	
	@Then("Verify the login is success")
	public void verify_the_login_is_success() throws InterruptedException {
//		testSetup.driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("nandi");
		LoginPageObject loginPage=new LoginPageObject(testSetup.driver);	
		boolean logout1=loginPage.logoutButton();
//		Boolean logout=testSetup.driver.findElement(By.xpath("//button[text()='Log out']")).isDisplayed();
	 Assert.assertTrue(logout1, "User is not logged to the application");
	 
	 Thread.sleep(5000);
	
	}

}
