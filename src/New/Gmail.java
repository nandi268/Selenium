package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		//Login to the application
		
		driver.findElement(By.name("identifier")).sendKeys("deepaknpatil121@gmail.com");
		driver.findElement(By.xpath("//span[text()= 'Next']")).click();
//		driver.findElement(By.cssSelector("input[type='submit'][class='button']")).click();
		Thread.sleep(10000);
		driver.close();
		
}
}
