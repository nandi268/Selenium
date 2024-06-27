package com.dashboard;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandline {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91900\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
String windowhandle=driver.getWindowHandle();
System.out.println("Window Handle is:"+windowhandle);
//System.out.println(driver.getTitle());
driver.findElement(By.id("windowButton")).click();
Thread.sleep(8000);

Set<String> window=driver.getWindowHandles();
for(String windows:window) {
	System.out.println("all windows"+windows);//printing all windows
}

Iterator<String> it1=window.iterator();
while(it1.hasNext()) {
	String parant=it1.next();
	String child1=it1.next();
	System.out.println("child wind:"+parant);
	System.out.println("child wind:"+child1);
	if(!windowhandle.equalsIgnoreCase(child1)) {
		driver.switchTo().window(child1);
WebElement windowText=driver.findElement(By.id("sampleHeading"));
System.out.println("new window text is:"+windowText.getText());
Thread.sleep(10000);
driver.close();

driver.switchTo().window(windowhandle);
Thread.sleep(10000);
driver.findElement(By.id("windowButton")).click();
Thread.sleep(10000);
driver.quit();

		
	
	}
	
	
}


		
		 
		
		
		
		
	}

}
