package New;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbcreate {
			public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/?stype=lo&jlou=AfdBI6EZPYVbv5p0W3NnX2MpDNmBvIP_gj04aYCPHQcSUET_IzOaRVYDvT5z-GT-xs6NmWAxttK7TtVZnBMEJpUrVQaLC7TwJoolJ45G0TQTvg&smuh=36481&lh=Ac-gt5g6IPuK9RfTXiI");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		//Login to the application
		//div[text()='First name']

		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\']")).click();
		//driver.findElement(By.xpath("input#u_4_b_4Q")).sendKeys("Robot");

		
		
		//WebElement element= driver.findElement(By.xpath("//*[@id=\"u_4_b_+N\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(document.getElement(By.xpath("//*[@id='u_4_b_+N']")).sendKeys('deepak'));
		//js.executeScript("arguments[0].sendKeys('deepak')", element);
		Thread.sleep(10000);
		driver.close();


}
}
