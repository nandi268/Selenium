package com.dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxesRadiobuttons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91900\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();
		ref.get("https://www.hyrtutorials.com/p/basic-controls.html");
		ref.manage().window().maximize();
		Thread.sleep(1000);
		
		//handle radiobuttons,checkboxes,buttons,link
		
		WebElement radio=ref.findElement(By.id("femalerb"));
		radio.click();
		Thread.sleep(1000);
		radio.isSelected();
		Thread.sleep(1000);
		//checkboxes
		
		WebElement checkbox=ref.findElement(By.id("englishchbx"));
		checkbox.click();
		Thread.sleep(1000);
//		checkbox.isSelected();
//		Thread.sleep(1000);
		
		WebElement checkbox1=ref.findElement(By.id("hindichbx"));
		checkbox1.click();
		
		//buttons
		
		WebElement button=ref.findElement(By.id("registerbtn"));
		button.click();
	System.out.println(	button.getText());
	
	//Link
	WebElement link=ref.findElement(By.id("navigateHome"));
	link.click();
	System.out.println(link.getText());
	
		
		
		
		

	}

	}
