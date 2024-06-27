package com.welcomepage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		Thread.sleep(10000);

		// Validating content of other window
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(10000);

		String mainWindow = driver.getWindowHandle();
		System.out.println("Window unique is :" + mainWindow);
		Thread.sleep(8000);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it1 = windows.iterator();
		while (it1.hasNext()) {
			String child = it1.next();
			if (!mainWindow.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				Thread.sleep(6000);
				WebElement windowText = driver.findElement(By.id("sampleHeading"));
				System.out.println("New window text is : " + windowText.getText());
				Thread.sleep(6000);
				driver.close();
			}
		}
		driver.switchTo().window(mainWindow);
		Thread.sleep(6000);
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(6000);
		driver.quit();

	}

}
