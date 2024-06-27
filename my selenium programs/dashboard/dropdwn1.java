package com.dashboard;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdwn1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91900\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();
		ref.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		ref.manage().window().maximize();
		Thread.sleep(1000);
		
	WebElement dropdwn=	ref.findElement(By.id("ide"));
		Select drop=new Select(dropdwn);
List	<WebElement> dropdown1=	drop.getOptions();
		for(WebElement dropdo:dropdown1) {
	System.out.println(dropdo.getText());
			
		}
		drop.selectByIndex(0);
		Thread.sleep(1000);
		drop.selectByValue("ij");
		Thread.sleep(1000);
		drop.selectByVisibleText("Visual Studio");
		Thread.sleep(1000);
		drop.deselectByIndex(3);
	List<WebElement> ref3=	drop.getAllSelectedOptions();
	for(WebElement re:ref3) {
String refer=	re.getText();
System.out.println("selected option"+refer);
		
		
		

	}

}}
