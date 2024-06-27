package com.dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\91900\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://parabank.parasoft.com/parabank/index.htm");
Thread.sleep(1000);

driver.findElement(By.name("usrname")).sendKeys("divya11223");
driver.findElement(By.name("password")).sendKeys("chandan");
driver.findElement(By.cssSelector("input[type='submit'][class='button']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//a[text()='Acounts Overview']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tr[@ng-repeat='acount in accounts']/td[1]/a")).click();
		Thread.sleep(1000);
		WebElement selectElement=driver.findElement(By.id("month"));
		Select sel=new Select(selectElement);
		Thread.sleep(1000);
		sel.selectByIndex(0);
		Thread.sleep(1000);
		sel.selectByIndex(1);
		Thread.sleep(1000);
		sel.selectByValue("june");
		Thread.sleep(1000);
		sel.selectByVisibleText("december");
		Thread.sleep(1000);
		driver.close();
		
		
		
		



	}

}
