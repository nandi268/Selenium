package com.dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModeldialogL {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91900\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/modal-dialogs");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		String expectedmodeltext="Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
		driver.findElement(By.id("showLargeModal")).click();
	String actualmodeltext=	driver.findElement(By.className("modal-body")).getText();
	System.out.println("model text is:"+actualmodeltext);
	
if(expectedmodeltext.equalsIgnoreCase(actualmodeltext)) {
	System.out.println("Big Model text is matching:pass");
}
driver.findElement(By.className("close")).click();
driver.findElement(By.id("closeLargeModal")).click();
	
	driver.quit();

}
}