package com.welcomepage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(10000);

		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(8000);
		Alert alert = driver.switchTo().alert();
		
	 

		String alertText1 = alert.getText();
		System.out.println("Alert text is :" + alertText1);

		alert.accept();

		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(8000);
		alert.dismiss();
		driver.findElement(By.id("confirmButton")).click();
		alert.accept();
		Thread.sleep(8000);

//		driver.findElement(By.id("promtButton")).click();

		//		WebElement element = driver.findElement(By.id("promtButton"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
	
			
		driver.findElement(By.id("promtButton")).click();
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(8000);
		alert1.sendKeys("Nandi454545");
		Thread.sleep(10000);
		alert1.accept();
		Thread.sleep(8000);
		driver.quit();
	}
}
