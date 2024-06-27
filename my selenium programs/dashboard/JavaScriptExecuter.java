package com.dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Document;

public class JavaScriptExecuter {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91900\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.id("login-username")).sendKeys("divya123");
		//WebElement element = driver.findElement(By.id("persistent"));
		
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('persistent').click()");
		//js.executeScript("arguments[0].click()",element);
		Thread.sleep(5000);
		driver.quit();

	}

}
