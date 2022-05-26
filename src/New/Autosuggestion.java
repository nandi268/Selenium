package New;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//public class Autosuggestion {
	/*public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		

		driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("tv9");
		String val1="tv9 kannada";
		List<WebElement> options=driver.findElements(By.tagName("li"));
		for(WebElement option:options) {
		
			
			String val2=option.getText();
			if(val2.equalsIgnoreCase(val1)) {
				System.out.println(" true :" + val1);
					
				option.click();
				break;
				
					}
		}
		
			}
}
		
//		Thread.sleep(8000);
//		Alert alert = driver.switchTo().alert();
//		
//	 
//
//		String alertText1 = alert.getText();
//		System.out.println("Alert text is :" + alertText1);
//
//		alert.accept();
//
//		driver.findElement(By.id("confirmButton")).click();
//		Thread.sleep(8000);
//		alert.dismiss();
//		driver.findElement(By.id("confirmButton")).click();
//		alert.accept();
//		Thread.sleep(8000);
//
////	driver.findElement(By.id("promtButton")).click();
//
//		//		WebElement element = driver.findElement(By.id("promtButton"));
////		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
//	
//			
//		driver.findElement(By.id("promtButton")).click();
//		Alert alert1 = driver.switchTo().alert();
//		Thread.sleep(8000);
//		alert1.sendKeys("Nandi454545");
//		Thread.sleep(10000);
//		alert1.accept();
//		Thread.sleep(8000);
//		driver.quit();
//	}
//}
//
//}
*/
  public class Autosuggestion {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Selenium\\chromedriver_win32\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			// Open enter the text in the google search i.e TV9
			driver.findElement(By.cssSelector("input[class='gLFyf gsfi']")).sendKeys("TV9");
			Thread.sleep(12000);
			
			String enterText = "tv9 news";
			List<WebElement> displayedOptions = driver.findElements(By.tagName("li"));

			for (WebElement option : displayedOptions) {

				if (option.getText().equalsIgnoreCase(enterText)) {
					System.out.println(" Selecting the autotext" + enterText);
					option.click();
					break;
				}
			}
			
			driver.close();
		}
	}

