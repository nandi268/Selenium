package com.dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91900\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://github.com//login");
		WebElement textbox=driver.findElement(By.className("login-fieldd"));
		
		if(textbox.isDisplayed()){
			if(textbox.isEnabled()) {
				textbox.sendKeys("divya");
				String txt=textbox.getAttribute("value");
				System.out.println(txt);
				textbox.clear();
				
				
			}
			
		
		else 
			System.out.println("text bocx is not displayed");
		}
		else 
			System.out.println("text bocx is not enabled");
		}

	}


