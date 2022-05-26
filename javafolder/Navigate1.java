package com.welcomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[text()='Sign in']")).click();
		
		Thread.sleep(8000);
		
		driver.navigate().back();
		
		Thread.sleep(8000);
		
		driver.navigate().refresh();
		
		Thread.sleep(8000);
		driver.navigate().forward();
		Thread.sleep(8000);
		
		driver.navigate().to("https://demoqa.com/frames");
		Thread.sleep(8000);
		driver.close();
		
		
		
		
	}

}
