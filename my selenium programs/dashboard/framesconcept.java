package com.dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class framesconcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91900\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		driver.findElement(By.id("name")).sendKeys("divya");//main document
		driver.switchTo().frame("frm1");//frame1
		
		Select sel=new Select(driver.findElement(By.id("course")));
		sel.selectByVisibleText("java");
		Thread.sleep(5000);
		
		
		driver.switchTo().defaultContent();//main document
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("divya123");
		
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frm1");
		sel.selectByVisibleText("Dot Net");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("divya123");
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frm2");
		driver.findElement(By.id("firstName")).sendKeys("chandu");
		
		
		
		
		
		
		
		
		
		
		

	}

}
