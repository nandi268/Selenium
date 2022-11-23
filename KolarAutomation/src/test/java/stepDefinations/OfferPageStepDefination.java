package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.OfferPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class OfferPageStepDefination {

	public String expectedProductName="Tomato";
	String OfferPageProductName ;
	
//	PageObjectManager pageObjectManager;
	TestContextSetup testContextSetup;
	public OfferPageStepDefination(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}

	@When("Search the product from offer page {string}")
	public void search_the_product_from_offer_page(String productName) {
		switchToOfferPage();
		OfferPage offerPage = testContextSetup.pageObjectManager.getOfferPage();
		offerPage.searchItem(productName);
		OfferPageProductName = offerPage.getProductName();
	}


	public void switchToOfferPage() {
		HomePage homePage = testContextSetup.pageObjectManager.getHomePage();
		homePage.clickTopDelas();
		testContextSetup.genericUtils.switchWindowToChild();
	}
	
	@Then("Verify the product is displayed")
	public void verify_the_product_is_displayed() {
		Assert.assertEquals(OfferPageProductName, expectedProductName);
	}

}
