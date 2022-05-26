package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/?stype=lo&jlou=AfdBI6EZPYVbv5p0W3NnX2MpDNmBvIP_gj04aYCPHQcSUET_IzOaRVYDvT5z-GT-xs6NmWAxttK7TtVZnBMEJpUrVQaLC7TwJoolJ45G0TQTvg&smuh=36481&lh=Ac-gt5g6IPuK9RfTXiI");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		//Login to the application
		
		driver.findElement(By.name("email")).sendKeys("8095668115");
		driver.findElement(By.name("pass")).sendKeys("dnpm1999");
		driver.findElement(By.name("login")).click();
//		driver.findElement(By.cssSelector("input[type='submit'][class='button']")).click();
		Thread.sleep(10000);
		driver.close();


}
}