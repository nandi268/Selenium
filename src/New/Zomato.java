package New;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[text()='Order Online']")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[5]/div/div/div[1]/div")).click();
		Thread.sleep(3000);
		
		//WebElement element= driver.findElement(By.xpath("//div[1][@class='sc-ejGVNB hDrpfs']"));
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("document.getElementById('persistent').click()");
		//js.executeScript("arguments[0].click()" , element);
				

		//driver.findElement(By.partialLinkText("Learn more")).click();
driver.quit();
}
}
