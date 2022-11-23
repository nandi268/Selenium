package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	public WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}

	By search = By.xpath("//input[@type='search']");

	public void searchItem(String productName){
		driver.findElement(search).sendKeys(productName);
	}

	By topDeals = By.linkText("Top Deals");
	
	public void clickTopDelas() {
		driver.findElement(topDeals).click();
	}

	By productName=By.cssSelector("h4.product-name");
	public String getProductName() {
		return driver.findElement(productName).getText();
	}


	public String getHomeageTitle(){
		return driver.getTitle();
	}


}
