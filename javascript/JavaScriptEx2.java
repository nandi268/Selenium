package javascript;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptEx2 {
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
//			org.openqa.selenium.ElementNotInteractableException: element not interactable
//			driver.findElement(By.id("persistent")).click();

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementById('persistent').click()");
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Alert is not present ");
		}

		finally {
			driver.quit();
		}

	}

}
