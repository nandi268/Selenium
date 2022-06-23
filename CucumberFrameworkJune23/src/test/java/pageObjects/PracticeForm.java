package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PracticeForm {
	public WebDriver driver;
	public PracticeForm(WebDriver driver) {
		this.driver=driver;
	}	
	
	By firstName=By.id("firstName");	
	By lastName=By.id("lastName");	
	By email=By.id("userEmail");
	
	public void enterFirstName(String firstname){
		driver.findElement(firstName).sendKeys(firstname);
	}
	
	public void enterLastName(String lastname){
		driver.findElement(lastName).sendKeys(lastname);
	}
	
	public void enterEmailId(String emailId){
		driver.findElement(email).sendKeys(emailId);
	}
	
	

}
