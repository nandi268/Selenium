package javascript;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Argument;

public class JavaScriptEx3 {

	public static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\LENOVO\\Documents\\Param\\Softwares\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://login.yahoo.com/");
			driver.manage().window().maximize();
			Thread.sleep(8000);

			driver.findElement(By.id("login-username")).sendKeys("Nandisoftwarestudcircle@gmail.com");

			Thread.sleep(4000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement stayCheckbox = driver.findElement(By.xpath("//input[@id='persistent']"));
//			js.executeScript("document.getElementById('persistent').click()");
			js.executeScript("arguments[0].click()", stayCheckbox);
			Thread.sleep(6000);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Alert is not present ");
		}

		finally {
			driver.quit();
		}

	}

}
