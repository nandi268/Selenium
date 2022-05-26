package New;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 public class Javascriptexecutor{ 
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://login.yahoo.com/?");
			driver.manage().window().maximize();
			Thread.sleep(1000);

			driver.findElement(By.id("login-username")).sendKeys("deepak");
			WebElement element= driver.findElement(By.id("persistent"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			//js.executeScript("document.getElementById('persistent').click()");
			js.executeScript("arguments[0].click()" , element);
					
			
			Thread.sleep(10000);
			driver.quit();
		}

	}



