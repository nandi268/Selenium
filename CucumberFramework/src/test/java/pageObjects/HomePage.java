package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	By logout=By.xpath("//button[text()='Log out']");
	
	By formExapnd=By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/span/div/div[2]");
	
	By practiveForm=By.xpath("//*[@id=\"item-0\"]/span[text()='Practice Form']");
	
	public boolean logoutDisplayed(){
		 boolean logoutButton = driver.findElement(logout).isDisplayed();
		return logoutButton;
	}
	
	public void formExapnd(){
		driver.findElement(formExapnd).click();
	}
	
	public void practiveForm(){
		driver.findElement(practiveForm).click();
	}
	

}
