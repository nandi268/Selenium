package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gclid=EAIaIQobChMItJfJmvHl9wIVgU5gCh0wBQK2EAAYASAAEgLvPvD_BwE&gclsrc=aw.ds");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		//Login to the application
		
		driver.findElement(By.id("name")).sendKeys("Robot");
		
		driver.findElement(By.id("email")).sendKeys("Robo");
		driver.findElement(By.id("password")).sendKeys("Robot");
		driver.findElement(By.id("mobile")).sendKeys("Robo");
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		//driver.findElement(By.cssSelector("input#u_4_d_UN")).sendKeys("Robo");
		//driver.findElement(By.name("login")).click();
//		driver.findElement(By.cssSelector("input[type='submit'][class='button']")).click();
		Thread.sleep(10000);
		driver.close();

}
}