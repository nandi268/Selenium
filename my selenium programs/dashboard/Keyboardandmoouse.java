package com.dashboard;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardandmoouse {

	public static void main(String[] args)throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91900\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
	driver.findElement(By.id("firstName")).	sendKeys("GRT");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		driver.findElement(By.id("lastName")).sendKeys("bangalore");
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		driver.findElement(By.id("currentAddress")).sendKeys("AAAAA8888888BBBBgfkfkkfgggggggggghfgrsgnhgj64778fdjhvgiktydkmfyudkmfuttf");
		act.sendKeys(Keys.ARROW_UP).build().perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_UP).build().perform();
		Thread.sleep(1000);									    
		act.sendKeys(Keys.ARROW_RIGHT).build().perform();
		Thread.sleep(1000);
		act.keyDown(Keys.SHIFT);
		Thread.sleep(1000);
		WebElement sports=driver.findElement(By.id("hobbies-checkbox-1"));
		Thread.sleep(1000);
		act.moveToElement(sports).build().perform();
		Thread.sleep(1000);
		WebElement firstname=driver.findElement(By.id("firstName"));
		Thread.sleep(1000);
		act.moveToElement(firstname).build().perform();
		Thread.sleep(1000);
		act.contextClick().build().perform();
		Thread.sleep(1000);
		WebElement checkbox=driver.findElement(By.xpath("//label[Text()='Sports']]"));
		act.doubleClick(checkbox).build().perform();
		WebElement choosefile=driver.findElement(By.id("uploadPicture"));
		Thread.sleep(1000);
		act.doubleClick(choosefile).perform();
		act.clickAndHold(choosefile).perform();
		Thread.sleep(1000);
		act.release();
		Thread.sleep(1000);
//		act.dragAndDrop(firstname, sports);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
