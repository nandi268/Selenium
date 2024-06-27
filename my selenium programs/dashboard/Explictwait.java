package com.dashboard;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explictwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91900\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.manage().window().maximize();
		
		try {
		System.out.println("started the explicitwait timer");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("\\[text()='WebDriver']")));
		System.out.println("webdriver element is visible on the page 2");
		

	}
		catch(NoSuchElementException e){
			e.printStackTrace();
			System.out.println("web driver element is not visible on the page .1");
		}
		catch(TimeoutException e) {
			e.printStackTrace();
			System.out.println("time out for the webdriver element");
			
			
		}
		finally {
			driver.close();
		}
			
		}
	

}
