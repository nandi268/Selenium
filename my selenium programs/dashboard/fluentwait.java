package com.dashboard;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91900\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.manage().window().maximize();

		System.out.println(" Clicking on the start timer ");
		driver.findElement(By.xpath("//button[@onclick='timedText()']")).click();
		System.out.println(" Clicking on the start timer ");
		try {
			System.out.println(" Started the fluentwait timer ");
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(5))
					.pollingEvery(Duration.ofSeconds(3))
					.ignoring(NoSuchElementException.class);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='WebDriver']")));
			System.out.println("Webdriver element is visible on the page 2");

		} catch (NoSuchElementException e) {
			e.printStackTrace();
			System.out.println("Webdriver element is not visible on the page 2.1");
		} catch (TimeoutException e) {
			e.printStackTrace();
			System.out.println(" Time out for the webdriver element ");

		} finally {
			driver.close();
		}

	}



	}

