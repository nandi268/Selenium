package com.dashboard;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91900\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("clicking on the start timer");
		driver.findElement(By.xpath("//button[@onclick='timedText()']"));
		System.out.println("clicking on the start timer");
		try {
			WebElement elementdriver=driver.findElement(By.xpath("//*[text()='WebDriver']"));
			boolean elemented=elementdriver.isDisplayed();
			if(elemented==true) {
				System.out.println("webdriver element displayed on the page");
			}
			else {
				System.out.println("webdriver element is not displayed on the page");
				
			}
		}
		catch(NoSuchElementException e) {
			e.printStackTrace();
			System.out.println("webdriver element is is not visible on the page 1.1");
			
			
		}
		
		finally {
			driver.close();
		}

	}

}
