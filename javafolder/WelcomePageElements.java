package com.welcomepage;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
//This test scripts will validates Welcome page of all elements
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WelcomePageElements {
	static String expectedlTitle = "ParaBank | Welcome | Online Banking";
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		// Verify the Title
		String actualTitle = driver.getTitle();
		System.out.println("Title of the Parabank web page is : " + actualTitle);
		if (actualTitle.equalsIgnoreCase(expectedlTitle)) {
			System.out.println("Title of the Parabank is matched - Pass");
		}
		// Verify few welcome page text and buttons
		List<String> actuallist=new ArrayList<String>();		
		List<WebElement> elements = driver.findElements(By.cssSelector("div[id='headerPanel']>ul>li"));
		for (WebElement element : elements) {			
			String s1=element.getText();
			actuallist.add(s1);			
			System.out.println("Welcome Page Left Webelements are:" + s1);
		}
		
		List<String> expectedList1=new ArrayList<String>();
		expectedList1.add("Solutions");
		expectedList1.add("About Us");
		expectedList1.add("Services");
		expectedList1.add("Products");
		expectedList1.add("Locations");
		expectedList1.add("Admin Page");
		expectedList1.add("home");
		expectedList1.add("about");
		expectedList1.add("contact");
		
		System.out.println("Size of my list1 is :" + expectedList1.size());
	
		boolean isEqual=expectedList1.equals(actuallist);
		System.out.println("Validing the Welcome page elements : " + isEqual);
			
		driver.close();
	}

}
