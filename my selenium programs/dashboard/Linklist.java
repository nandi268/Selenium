package com.dashboard;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linklist {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91900\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		Thread.sleep(1000);
		
		List<String> actuallist=new ArrayList<String>();
		List<WebElement> elements=driver.findElements(By.tagName("a"));
		System.out.println("total links are"+elements.size());
		for(WebElement element:elements) {
			String s1=element.getAttribute("href");
			String s2=element.getText();
			actuallist.add(s1);
			System.out.println("welcome psge links are"+s1);
			System.out.println("welcome pge link text is"+s2);
			Thread.sleep(1000);
			driver.close();
			
			
		}
		
		
		
		
	}

}
