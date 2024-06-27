package com.dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91900\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("tv9");
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("91008429618");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("divya123");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.quit();
		

	}

}
