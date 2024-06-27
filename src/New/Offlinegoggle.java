package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Offlinegoggle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		
		
		driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("gaja kannada movie") ;
		driver.findElement(By.name("btnK")).click();
//		driver.findElement(By.cssSelector("input[type='submit'][class='button']")).click();
		Thread.sleep(10000);
		driver.close();

}
}
