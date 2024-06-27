package com.dashboard;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbxs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91900\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
	List<WebElement> check=driver.findElements(By.cssSelector("input[type='checkbox']"));
	System.out.println(check.size());
	for(int i=0;i<check.size();i++) {
		boolean b=check.get(i).isSelected();
		
		if(b=true) {
			System.out.println("check box is:"+i);
			check.get(i).click();
//			i++;
			Thread.sleep(1000);
		}
		
	}
//		for(int i=1;i<check.size();i++) {
//			check.get(i).click();
//			i++;
//			Thread.sleep(1000);
//		}
		
driver.close();
	}

}
