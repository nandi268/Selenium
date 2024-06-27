package com.dashboard;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91900\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
	List<WebElement> radio=driver.findElements(By.cssSelector("input[type='radio']"));
		System.out.println("size of the wwebpage elements are"+radio.size());
//		driver.findElement(By.cssSelector("form>input[type='radio'][value='green']")).click();
		Thread.sleep(1000);
		
		for(WebElement ref:radio) {
			System.out.println("radio buton name is"+ref.getAttribute("value"));
			System.out.println("radio button name and status"+ref.isSelected());
			String s="yellow";
			String s1=ref.getText();
		
			if(s.equalsIgnoreCase(s1)) {
			ref.click();
			}
			Thread.sleep(1000);
					
		}
		driver.close();
	}

}
