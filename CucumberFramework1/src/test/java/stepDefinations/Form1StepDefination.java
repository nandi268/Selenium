package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestSetup;


public class Form1StepDefination  {
	 TestSetup testSetup;
	
	public Form1StepDefination(TestSetup testSetup) {
		this.testSetup=testSetup;
	}
	
	@Then("Verify the login is success1")
	public void verify_the_login_is_success() throws InterruptedException {
//		testSetup.driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("mahi");
		Thread.sleep(8000);
		
	 Boolean logout=testSetup.driver.findElement(By.xpath("//button[text()='Log out']")).isDisplayed();
	 Assert.assertTrue(logout, "User is not logged to the application");
	 System.out.println("Logout is" + logout);
	 Thread.sleep(5000);
	
	}
	
	@Given("Navigate to the practice form")
	public void navigate_to_the_practice_form() throws InterruptedException {
		Thread.sleep(18000);
		testSetup.driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/span/div/div[2]")).click();
        testSetup.driver.findElement(By.xpath("//*[@id=\"item-0\"]/span[text()='Practice Form']")).click();
//		Thread.sleep(8000);
	}
	
	@When("Enter the firstname {string} and lastname {string}")
	public void enter_the_firstname_and_lastname(String firstname, String lastname) throws InterruptedException {
		testSetup.driver.findElement(By.id("firstName")).sendKeys(firstname);
		testSetup.driver.findElement(By.id("lastName")).sendKeys(lastname);
		Thread.sleep(5000);
	}
	@And("Enter the emailid {string}")
	public void enter_the_emailid(String emailid) throws InterruptedException {
		testSetup.driver.findElement(By.id("userEmail")).sendKeys(emailid);
		Thread.sleep(5000);
	}
	@Then("Verify the successfully filled")
	public void verify_the_successfully_filled() throws InterruptedException {
		String firstname = testSetup.driver.findElement(By.xpath("//*[@id=\"firstName\"]")).getText();
		System.out.println("First name is" + firstname);
		Thread.sleep(5000);
		testSetup.driver.quit();
	}

}
