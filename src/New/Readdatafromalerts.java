package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readdatafromalerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/modal-dialogs");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		//Login to the application
		String Expecteddata= "This is a small modal. It has very less content";
		driver.findElement(By.id("showSmallModal")).click();
		Thread.sleep(5000);
		
		String Actualdata = driver.findElement(By.className("modal-body")).getText();

		Thread.sleep(5000);
		
		driver.findElement(By.id("closeSmallModal")).click();
		Thread.sleep(5000);

		System.out.println("the read data is :" + Actualdata); 
		if(Actualdata.equalsIgnoreCase(Expecteddata))
		{
			System.out.println("data is true");
		}
		
		String ExpectedBigmodeldata= "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
		driver.findElement(By.id("showLargeModal")).click();
		Thread.sleep(5000);
		
		String ActualBigmodeldata = driver.findElement(By.className("modal-body")).getText();

		Thread.sleep(5000);
		
		driver.findElement(By.id("closeLargeModal")).click();
		Thread.sleep(5000);

		System.out.println("the read data is :" + ActualBigmodeldata); 
		if(ActualBigmodeldata.equalsIgnoreCase(ExpectedBigmodeldata))
		{
			System.out.println("data is true");
		}
		
		/*
		 * driver.findElement(By.linkText("Motorola")).click();
		 * driver.findElement(By.partialLinkText("G60")).click();
		 * driver.findElement(By.xpath("//a[text()=\" Add to Wish List \"]")).click();
		 */

		Thread.sleep(10000);
		//driver.close();
		
}
}
