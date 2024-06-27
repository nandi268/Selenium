package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class new1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		//Login to the application
		
		driver.findElement(By.name("username")).sendKeys("deepaknp");
		driver.findElement(By.name("password")).sendKeys("nandi123");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//a[text()='Accounts Overview']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//tr[@ng-repeat='account in accounts']/td[1]/a")).click();
		Thread.sleep(10000);
		//Select by options
		WebElement selectElement=driver.findElement(By.id("month"));
		Select sel=new Select(selectElement);
//		sel.deselectAll();
		sel.selectByIndex(0);
		Thread.sleep(10000);
		sel.selectByIndex(1);
		Thread.sleep(10000);
		sel.selectByValue("June");
		Thread.sleep(10000);
		sel.selectByVisibleText("December");
		Thread.sleep(10000);
		driver.close();
	}

	}




