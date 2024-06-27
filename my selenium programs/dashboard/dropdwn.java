package com.dashboard;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdwn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91900\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();
		ref.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		ref.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement dropdown=ref.findElement(By.id("dropdowm-menu-1"));
		Select drop=new Select(dropdown);
        List<WebElement>	dropdwn=	drop.getOptions();
		for(WebElement dropdo:dropdwn) {
		System.out.println(	dropdo.getText());
		}
		drop.selectByIndex(1);
		Thread.sleep(1000);
		drop.selectByValue("python");
		Thread.sleep(1000);
		drop.selectByVisibleText("SQL");
		Thread.sleep(1000);
	WebElement ref2=	drop.getFirstSelectedOption();
String re=	ref2.getText();
System.out.println("selected option:"+re);
	
		drop.deselectByIndex(1);
		
		
		
		
		
	}

}
