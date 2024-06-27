package com.welcomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseandKeyboardAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		Thread.sleep(10000);

		driver.findElement(By.id("firstName")).sendKeys("GRT");
		// Creating the object of Actions class

		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(5000);
		driver.findElement(By.id("lastName")).sendKeys("Bangalore");
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.TAB).perform();

		driver.findElement(By.id("currentAddress")).sendKeys(
				"AAAAAAAAAAAA4544444444777777777777AAAAAABBBBBBBBBBBBBBBBBBBBCCCCCCCCCCCCCCCCCCCCCCCDDDDDDDDDDD");

		act.sendKeys(Keys.ARROW_UP).build().perform();
		Thread.sleep(10000);
		act.sendKeys(Keys.ARROW_UP).build().perform();
		act.sendKeys(Keys.ARROW_RIGHT).build().perform();
		act.keyDown(Keys.SHIFT).build().perform();
		Thread.sleep(10000);
		// Moving mouse to the first name text box

		WebElement firstName = driver.findElement(By.id("firstName"));
		act.moveToElement(firstName).build().perform();
		Thread.sleep(4000);
//		act.contextClick().build().perform();
		Thread.sleep(5000);
		// Double click
		WebElement checkbox = driver.findElement(By.xpath("//label[text()='Sports']"));
		act.doubleClick(checkbox).build().perform();

		// Click and wait...and Release
		WebElement choseFile = driver.findElement(By.id("uploadPicture"));
		Thread.sleep(10000);
		act.clickAndHold(choseFile).build().perform();
		Thread.sleep(8000);
		act.release();
		Thread.sleep(15000);
		driver.close();

	}

}
