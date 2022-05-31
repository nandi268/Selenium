package com.dashboard;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91900\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		String val1="TV9 kannada";
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("TV9");
		Thread.sleep(8000);
		List<WebElement> options=driver.findElements(By.tagName("li"));
		Thread.sleep(8000);
		
		for(WebElement opt:options) {
System.out.println(opt.getSize());
			String val2=opt.getText();
			if(val2.equalsIgnoreCase(val1)) {
				opt.click();
				
				
			}
		
		}
		driver.close();

		
		
		
				
				
		
	
	

}}
