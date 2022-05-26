package New;
	//implicit wait and  explicit wait 

	import java.time.Duration;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.NoSuchElementException;
	import org.openqa.selenium.TimeoutException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Waits {

		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

			System.out.println(" Clicking on the start timer ");
//			Thread.sleep(12000);
			driver.findElement(By.xpath("//button[@onclick='timedText()']")).click();
			System.out.println(" Clicking on the start timer ");

			/*
			 * try { WebElement elementdriver =
			 * driver.findElement(By.xpath("//*[text()='WebDriver']")); boolean elementd =
			 * elementdriver.isDisplayed(); if (elementd == true) {
			 * System.out.println("Webdriver element is displayed on the page"); } else {
			 * System.out.println("Webdriver element is not displayed on the page 1"); } }
			 * catch (NoSuchElementException e) { e.printStackTrace();
			 * System.out.println("Webdriver element is not visible on the page 1.1"); }
			 * 
			 * 
			 * try { System.out.println(" Started the explicit wait timer "); WebDriverWait
			 * wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			 * wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
			 * "//*[text()='WebDriver']")));
			 * System.out.println("Webdriver element is visible on the page 2");
			 * 
			 * } catch (NoSuchElementException e) { e.printStackTrace();
			 * System.out.println("Webdriver element is not visible on the page 2.1"); }
			 * catch (TimeoutException e) { e.printStackTrace();
			 * System.out.println(" Time out for the webdriver element ");
			 * 
			 * }
			 * 
			 * 
			 * finally { //driver.close(); }
			 */
		}
	}


