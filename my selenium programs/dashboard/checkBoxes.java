package com.dashboard;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class checkBoxes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91900\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver ref=new ChromeDriver();
		ref.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		ref.manage().window().maximize();
		Thread.sleep(1000);
		
		List<WebElement> checkboxes = ref.findElements(By.cssSelector("input[type='checkbox']"));
		System.out.println("Total no of check boxed are: " + checkboxes.size());


		
//		
//		for (int i = 1; i < checkboxes.size(); i++) {
//
//		boolean b= checkboxes.get(i).isSelected();
//			
//			if (b == true) {
//				System.out.println(" Selected check box no is" + i);
//				checkboxes.get(i).click();
//				Thread.sleep(10000);
//			}
//			
//		}
	for(int i = 1; i < checkboxes.size(); i++) {
//		i++;
//		i++;
//		
			checkboxes.get(i).click();
			i++;
		
			Thread.sleep(10000);
	}
	
		
		
		
	
		ref.close();
			
		
		
		}
	}
	
		
		
	



		

	


