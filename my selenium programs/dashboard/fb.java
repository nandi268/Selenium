package com.dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91900\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("91008429618");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("divya123");
		driver.findElement(By.id("loginbutton")).click();
		
				

	}

}
