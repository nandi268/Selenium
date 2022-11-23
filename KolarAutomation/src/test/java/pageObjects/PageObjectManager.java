package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public WebDriver driver;
	public HomePage homePage;	
	public OfferPage offerPage;

	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}


	public HomePage getHomePage(){
		HomePage homePage=new HomePage(driver);
		return homePage;
	}


	public OfferPage getOfferPage(){
		OfferPage	offerPage=new OfferPage(driver);
		return offerPage;
	}
}
