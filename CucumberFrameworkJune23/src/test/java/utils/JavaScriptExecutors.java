package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutors {

	WebDriver driver;

	public JavaScriptExecutors(WebDriver driver) {
		this.driver = driver;
	}

	public void executeScriptById(String id) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('id').click()");
		Thread.sleep(8000);

	}

	public void executeScriptByXpath(WebElement element) throws InterruptedException {
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement stayCheckbox = driver.findElement(By.xpath("//input[@id='persistent']"));
//		js.executeScript("document.getElementById('persistent').click()");
		js.executeScript("arguments[0].click()", element);

	}

	public void enterTextByExceutor(String value1, WebElement element) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='nandisoftwarestudycircle@gmail.com'", element);
		Thread.sleep(8000);

	}

}
