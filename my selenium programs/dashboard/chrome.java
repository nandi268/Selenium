package com.dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91900\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
//		driver.findElement(By.Xpath("//a[text()='Sign in']")).click();
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
		driver.quit();
		
		
		
		

	}

}
