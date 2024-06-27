package New;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_4b3e4wrxds_e&adgrpid=60639568242&hvpone=&hvptwo=&hvadid=294102729729&hvpos=&hvnetw=g&hvrand=4747908048394328076&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007768&hvtargid=kwd-316976912080&hydadcr=5841_1914865&gclid=EAIaIQobChMIjJ-z5rTp9wIVFhwrCh24FgyBEAAYASAAEgJ7cvD_BwE");
			driver.manage().window().maximize();
			//Thread.sleep(10000);
			
			//Login to the application
			
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("motorola");
			driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.linkText("Motorola")).click();
		driver.findElement(By.partialLinkText("G60")).click();
		//WebElement element=driver.findElement(By.xpath("//*[@id=\"wishListMainButton\"]/span/a"));
		//driver.findElement(By.className("a-input-text a-span12 askDPSearchTextInput askDPSearchPostTextInput")).sendKeys("battery");
		
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector(\"#wishListMainButton > span > a\").click()");
		//js.executeScript("arguments[0].click()" , element);
		
		

			//Thread.sleep(10000);
			driver.quit();
			
	}
}
