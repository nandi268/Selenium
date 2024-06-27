package com.dashboard;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parabank {
static String expectedTitle="parabank|online|Banking";
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91900\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		String actualTitle=driver.getTitle();
		System.out.println("title of parabank webpage is:"+actualTitle);
		if(actualTitle.equalsIgnoreCase(expectedTitle)){
			System.out.println("title of web page is matchin pass");
			Thread.sleep(1000);
		}
		
		
	List<String> actual=new ArrayList<String>();
		List<WebElement> element=driver.findElements(By.xpath("//div[@id='HeadPanel']/ul/li"));
	for(WebElement element1:element) {
		String s1=element1.getText();
		actual.add(s1);
		Thread.sleep(1000);
		System.out.println("welcome page left web elements are"+s1);
		Thread.sleep(15000);
	}

//	Thread.sleep(1000);
//	List<String> expected=new ArrayList<String>();
//	expected.add("solutions");
//	Thread.sleep(1000);
//	expected.add("about us");
//	expected.add("services");
//	expected.add("products");
//	expected.add("locations");
//	expected.add("Admin page");
//	expected.add("home");
//	expected.add("About");
//	expected.add("contact");
//	Thread.sleep(1000);
//	System.out.println("size of my list is"+expected.size());
//	boolean isEqual=expected.equals(actual);
//	System.out.println("validating the webpage elements are"+isEqual);
	Thread.sleep(1000);
	
	driver.close();
		
		

	}

}
