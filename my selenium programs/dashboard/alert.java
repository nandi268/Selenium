package com.dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91900\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//alert box
		System.out.println(driver.findElement(By.id("output")).getText());
		driver.findElement(By.id("alertBox")).click();
	System.out.println(	driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	System.out.println(driver.findElement(By.id("output")).getText());
	
	Thread.sleep(3000);
	
	//confirm box
	driver.findElement(By.id("confirmBox")).click();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
System.out.println(	driver.findElement(By.id("output")).getText());
driver.switchTo().alert().dismiss();
System.out.println(driver.switchTo().alert().getText());
System.out.println(	driver.findElement(By.id("output")).getText());
Thread.sleep(10000);

//prompt box
System.out.println(	driver.findElement(By.id("output")).getText());
driver.findElement(By.id("promptBox")).click();
System.out.println(driver.switchTo().alert().getText());
driver.switchTo().alert().sendKeys("divya");
driver.switchTo().alert().accept();
System.out.println(	driver.findElement(By.id("output")).getText());

Thread.sleep(3000);
driver.quit();


	
		

	}

}
