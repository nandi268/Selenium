package com.dashboard;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91900\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();
		ref.get("https://demoqa.com/frames");
		ref.manage().window().maximize();
		Thread.sleep(1000);
		
		List<WebElement> iframes=ref.findElements(By.tagName("iframe"));
		System.out.println("no of frames are:"+iframes.size());
		Thread.sleep(100);
		WebElement elementframe=ref.findElement(By.xpath("//iframe[@id='frame1']"));
		ref.switchTo().frame(elementframe);
		Thread.sleep(1000);
		String str=ref.findElement(By.id("sampleHeading")).getText();
		System.out.println("content inside frameis:"+str);
		Thread.sleep(1000);
		ref.quit();
	}
}
		

