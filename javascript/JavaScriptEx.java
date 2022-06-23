package javascript;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptEx {
	public static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\LENOVO\\Documents\\Param\\Softwares\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			Thread.sleep(5000);

			// JavascriptExecutor is a interface and can't be creaeted the object
			// So type casting it
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("alert('Hello Nandi')");
			driver.switchTo().alert().accept();
			Thread.sleep(3000);

		} catch (NoAlertPresentException e) {
			e.printStackTrace();
			System.out.println("Alert is not present ");
		}

		finally {
			driver.quit();
		}

	}

}
