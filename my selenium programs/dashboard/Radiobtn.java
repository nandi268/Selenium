package com.dashboard;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobtn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91900\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
	List<WebElement> radio=driver.findElements(By.xpath("//input[@type='radio']"));
	System.out.println(radio.size());
	WebElement radio1=driver.findElement(By.xpath("//input[@type='radio' and @value='blue']"));
	radio1.click();
	for(WebElement ref:radio) {
	
	
	System.out.println(radio1.isSelected());
	System.out.println(radio1.getAttribute("value"));
	
	
	

	}
	driver.close();

}}
