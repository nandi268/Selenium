package utils;

import java.time.Duration;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {

	/*
	 * public WebDriver driver;
	 * 
	 * public WaitHelper(WebDriver driver) { this.driver = driver; }
	 * 
	 *//**
		 * This method will wait for Element to be visible
		 * 
		 * @param element
		 * @param timeOutInSeconds
		 */
	/*
	 * 
	 * public void waitForElementToVisible(WebElement element, int timeOutInSeconds)
	 * { WebDriverWait wait = new WebDriverWait(driver,
	 * Duration.ofSeconds(timeOutInSeconds));
	 * wait.until(ExpectedConditions.visibilityOf(element));
	 * System.out.println("Waiting for the visiblity of element");
	 * 
	 * }
	 * 
	 *//**
		 * This method will wait for page to load
		 * 
		 * @param element
		 * @param timeOutInSeconds
		 */
	/*
	 * 
	 * public void pageLoadTime(int timeOutInSeconds) {
	 * driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(
	 * timeOutInSeconds)); }
	 * 
	 *//**
		 * This method will wait for frameToBeAvailableAndSwitchToIt
		 * 
		 * @param element
		 * @param timeOutInSeconds
		 */
	/*
	 * public void waitForframeToBeAvailableAndSwitchToIt(WebElement element, long
	 * timeOutInSeconds) { WebDriverWait wait = new WebDriverWait(driver,
	 * Duration.ofSeconds(timeOutInSeconds));
	 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element)); }
	 * 
	 * 
	 * // Fluentwait
	 * 
	 *//**
		 * This will help us to get WebDriverWait object
		 * 
		 * @param timeOutInSeconds
		 * @param pollingEveryInMiliSec
		 * @return
		 */
	/*
	 * private WebDriverWait getWait(int timeOutInSeconds, int
	 * pollingEveryInMiliSec) { WebDriverWait wait = new WebDriverWait(driver,
	 * Duration.ofSeconds(timeOutInSeconds));
	 * wait.pollingEvery(Duration.ofMillis(pollingEveryInMiliSec));
	 * wait.ignoring(NoSuchElementException.class);
	 * wait.ignoring(ElementNotInteractableException.class);
	 * wait.ignoring(NoSuchElementException.class);
	 * wait.ignoring(StaleElementReferenceException.class); return wait; }
	 * 
	 * public WebDriverWait getWait1(int timeOutInSeconds, int pollingEverySeconds){
	 * 
	 * WebDriverWait wait=new WebDriverWait(driver,
	 * Duration.ofSeconds(timeOutInSeconds));
	 * wait.pollingEvery(Duration.ofMillis(pollingEverySeconds));
	 * wait.ignoring(NoSuchElementException.class);
	 * 
	 * return wait; }
	 * 
	 *//**
		 * This method will make sure element is visible
		 * 
		 * @param element
		 * @param timeOutInSeconds
		 * @param pollingEveryInMiliSec
		 *//*
			 * public void WaitForElementVisibleWithPollingTime(WebElement element, int
			 * timeOutInSeconds, int pollingEveryInMiliSec) { WebDriverWait wait =
			 * getWait(timeOutInSeconds, pollingEveryInMiliSec);
			 * wait.until(ExpectedConditions.visibilityOf(element)); }
			 */
}
