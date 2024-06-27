package com.dashboard;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver","C:\\Users\\91900\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://parabank.parasoft.com/parabank/index.htm");
     driver.manage().window().maximize();
     Thread.sleep(1000);
     
     driver.findElement(By.id("headerPanel"));
     driver.findElement(By.name("username")).sendKeys("divya");
     driver.findElement(By.xpath("//input[@class='input' and @type='password']")).sendKeys("1234");
     List<String> act=new ArrayList<String>();
   List<WebElement> element=driver.findElements(By.cssSelector("div[id='headerPanel']>ul>li"));
   for(WebElement elt:element) {
	String s=elt.getText();
	act.add(s);
   }
     
     driver.findElement(By.xpath("//a[@href='/parabank/index.htm']"));
     
     driver.navigate().forward();
     Thread.sleep(1000);
     driver.navigate().refresh();
     Thread.sleep(1000);
     
     driver.navigate().to("https://demoqa.com/alerts");
     driver.findElement(By.className("mr-3"));
     
     
     driver.close();

}

}