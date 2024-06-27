package com.welcomepage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkLists {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		// List links of the webpage
				List<String> actuallist=new ArrayList<String>();		
				List<WebElement> elements = driver.findElements(By.tagName("a"));
				
				//Total links size
				
				System.out.println("Total no of links are: " + elements.size());
				
				for (WebElement element : elements) {			
					String s1=element.getAttribute("href");
					String s2=element.getText();
					actuallist.add(s1);			
					System.out.println("Welcome Page links  are:" + s1);
					System.out.println("Welcome Page links  texts is :" + s2);
					
				}
				
				driver.close();
		
	}

}
