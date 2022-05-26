package New;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Frames {

		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://demoqa.com/frames");
			driver.manage().window().maximize();
			Thread.sleep(10000);

			List<WebElement> iframes = driver.findElements(By.tagName("iframe"));

			System.out.println("No of frames are :" + iframes.size());
			Thread.sleep(10000);
			WebElement elementFrame=driver.findElement(By.xpath("//iframe[@id='frame1']"));
			driver.switchTo().frame(elementFrame);
			
			Thread.sleep(10000);
			String str = driver.findElement(By.id("sampleHeading")).getText();
			System.out.println("Content inside of the frame is :" + str);
			Thread.sleep(10000);

			//driver.quit();
		}

	}



