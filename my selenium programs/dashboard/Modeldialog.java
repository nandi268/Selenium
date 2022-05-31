package com.dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Modeldialog {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91900\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/modal-dialogs");
        Thread.sleep(10000);
        
        //reading the data from small model
    String    expectedmodeltext="This is a small Model.It has very less content";
        driver.findElement(By.id("showSmallModal")).click();
String  Actualmodeltext=driver.findElement(By.className("model-body")).getText();
System.out.println("modl text is:"+Actualmodeltext);
 if(expectedmodeltext.equalsIgnoreCase(Actualmodeltext)) { 
	 System.out.println("model text is match with the expected text:-pass");
 }
        driver.findElement(By.id("closeSmallModal")).click();
//        driver.findElement(By.className("close")).click();
        driver.quit();
     
	}

	
	
}
