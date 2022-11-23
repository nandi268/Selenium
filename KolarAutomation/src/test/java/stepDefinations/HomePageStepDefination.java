package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class HomePageStepDefination {

	public WebDriver driver;	
//	PageObjectManager pageObjectManager;
	TestContextSetup testContextSetup;
	HomePage homePage;
	public HomePageStepDefination(TestContextSetup testContextSetup){
		this.testContextSetup=testContextSetup;
		this.homePage =testContextSetup.pageObjectManager.getHomePage();
	}

	@Given("Launch the wepage")
	public void launch_the_wepage() {
		System.out.println("Launch the wepage");
		//		System.setProperty("webdriver.chrome.driver", "C:\\NovemberWorkSpace\\KolarAutomation\\src\\test\\java\\drivers\\chromedriver.exe");
		//		testContextSetup.driver=new ChromeDriver();
		//		testContextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//		testContextSetup.driver.manage().window().maximize();
		//		testContextSetup.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Assert.assertTrue(homePage.getHomeageTitle().contains("GreenKart"));


		//		Assert.assertTrue(homePage.getHomeageTitle().contains("GreenKart"));
	}
	@When("Search the product {string}")
	public void search_the_product(String productName) {
		System.out.println("Search the product" +productName );
		HomePage homePage=testContextSetup.pageObjectManager.getHomePage();		
		homePage.searchItem(productName);

	}
	@Then("Verify the product is diplayed")
	public void verify_the_product_is_diplayed() {
		System.out.println("Verify the product is diplayed");
		HomePage homePage=testContextSetup.pageObjectManager.getHomePage();
		String actualProductName = homePage.getProductName();
		String expectedProdcutName="Brocolli - 1 Kg";
		Assert.assertEquals(actualProductName, expectedProdcutName);
	}

}
