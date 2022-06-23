package utils;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFor {

	/*
	 * WebDriver driver;
	 * 
	 * WaitFor(WebDriver driver) { this.driver = driver; }
	 * 
	 * public void waitForElelmentToBeVisible(WebElement element, int
	 * timeOutInSeconds) { WebDriverWait wait = new WebDriverWait(driver,
	 * Duration.ofSeconds(timeOutInSeconds));
	 * wait.until(ExpectedConditions.visibilityOf(element)); }
	 * 
	 * public void waitForElelmentToBeClickable(WebElement element, int
	 * timeOutInSeconds) { WebDriverWait wait = new WebDriverWait(driver,
	 * Duration.ofSeconds(timeOutInSeconds));
	 * wait.until(ExpectedConditions.elementToBeClickable(element)); }
	 * 
	 * public void waitForPageToLoad(Duration timeOutInSeconds) {
	 * driver.manage().timeouts().pageLoadTimeout(timeOutInSeconds); }
	 * 
	 * // Fluentwait
	 * 
	 * public WebDriverWait getWait(int timeOutInSeconds, int
	 * pollingTimeOutWaitInMiliSeconds) { WebDriverWait wait = new
	 * WebDriverWait(driver, Duration.ofSeconds(timeOutInSeconds));
	 * wait.pollingEvery(Duration.ofMillis(pollingTimeOutWaitInMiliSeconds));
	 * wait.ignoring(NoSuchElementException.class);
	 * wait.ignoring(StaleElementReferenceException.class); return wait; }
	 * 
	 * public void waitForElementByFluentWait(WebElement element, int
	 * timeOutInSeconds, int pollingTimeOutWaitInMiliSeconds) { WebDriverWait wait =
	 * getWait(timeOutInSeconds, pollingTimeOutWaitInMiliSeconds);
	 * wait.until(ExpectedConditions.visibilityOf(element)); }
	 */

}
