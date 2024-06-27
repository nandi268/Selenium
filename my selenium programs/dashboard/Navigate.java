package com.dashboard;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91900\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
//	System.setProperty("webdriver.chrome.driver","C:\\Users\\91900\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
Thread.sleep(10000);
driver.navigate().forward();
Thread.sleep(10000);
driver.navigate().refresh();
Thread.sleep(10000);
driver.navigate().to("http://demoqa.com/frames");
Thread.sleep(10000);
driver.close();


	}

}
