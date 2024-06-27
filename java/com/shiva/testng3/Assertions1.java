package com.shiva.testng3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions1 {

	@Test
	public void validateEquals() {

		String var1 = "bangalore";
		String var2 = "bangalore";
		Assert.assertEquals(var1, var2, "Both the city name are not matched:Failed");
	}
	
	@Test
	public void validateBooleans() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Documents\\Param\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		// Verify the Title
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		boolean login=driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]")).isDisplayed();
		Assert.assertTrue(login, "Login button is not displayed :Failed ");
		
		System.out.println(" Pass");
		driver.quit();
	}

}
