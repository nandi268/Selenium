package com.dashboard;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91900\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(10000);

		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(8000);
		Alert alert = driver.switchTo().alert();
		String alertText1 = alert.getText();
		System.out.println("Alert text is :" + alertText1);
		alert.accept();
		

		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(8000);
		alert.dismiss();
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(8000);
		Alert confirmalert=driver.switchTo().alert();
		String confirmalert1=confirmalert.getText();
		System.out.println("Alert text is :" +confirmalert1);
		confirmalert.accept();
		Thread.sleep(8000);


			
		driver.findElement(By.id("promtButton")).click();
		
		Thread.sleep(8000);
		Alert promptalert = driver.switchTo().alert();
		String promptalert1=promptalert.getText();
		
		System.out.println("prompt text is"+promptalert1);
		
		Thread.sleep(8000);
		promptalert.sendKeys("divya");
		promptalert.accept();
         driver.quit();
	}
}

	


