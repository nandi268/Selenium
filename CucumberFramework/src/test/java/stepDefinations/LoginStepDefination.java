package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import pageObjects.PageObjectManager;
import pageObjects.PracticeForm;
import utils.TestSetup;

public class LoginStepDefination {
//	public WebDriver driver;
	 TestSetup testSetup;	
	 PageObjectManager pageObjectManager;
	
	public LoginStepDefination(TestSetup testSetup) {
		this.testSetup=testSetup;
	}
	
	
	@Given("Launched the browser and open the login page")
	public void launched_the_browser_and_open_the_login_page() throws InterruptedException {	  
		//Moved this code to the TestBase class 
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Documents\\Param\\Softwares\\chromedriver_win32\\chromedriver.exe");
//		testSetup.driver=new ChromeDriver();
//		testSetup.driver.get("https://demoqa.com/login");
//		testSetup.driver.get("https://parabank.parasoft.com/parabank/index.htm");
//		testSetup.driver.manage().window().maximize();
		
	}
	
	@When("Login to the application with username {string} and password {string}")
	public void login_to_the_application_with_username_and_password(String username, String password) throws InterruptedException {
//		LoginPage loginpage=new LoginPage(testSetup.driver);
		LoginPage loginpage=testSetup.pageObjectManager.getLoginPage();
		loginpage.enterUserName(username);
		loginpage.enterPassword(password);
		loginpage.loginButton();
		
//		testSetup.driver.findElement(By.id("userName")).clear();
//		testSetup.driver.findElement(By.id("userName")).sendKeys(username);
//		testSetup.driver.findElement(By.id("password")).clear();
//		testSetup.driver.findElement(By.id("password")).sendKeys(password);
//		testSetup.driver.findElement(By.xpath("//button[text()='Login']")).click(); 
//		testSetup.driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys(username);
	}
	
	@Then("^Verify the login is success$")
	public void verify_the_login_is_success() throws InterruptedException {
//		testSetup.driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("nandi");
//		Boolean logout=testSetup.driver.findElement(By.xpath("//button[text()='Log out']")).isDisplayed();
//	    Assert.assertTrue(logout, "User is not logged to the application");

		//		LoginPage loginpage=new LoginPage(testSetup.driver);
		LoginPage loginpage=testSetup.pageObjectManager.getLoginPage();
		Boolean logout1=loginpage.logoutButton(); 
		Assert.assertTrue(logout1, "User is not logged to the application");	 
	
	}

}
