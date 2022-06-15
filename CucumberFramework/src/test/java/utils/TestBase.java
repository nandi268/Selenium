package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public  WebDriver driver;

	public WebDriver webDriverManager() throws IOException {

		// Read the data from the properties
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("qa");

		if (driver == null) {

			if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
//				create the firefox instance
			}
			
			if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
//				create the firefox instance
			}


			driver.get(url);
//			testSetup.driver.get("https://parabank.parasoft.com/parabank/index.htm");
			driver.manage().window().maximize();
		}
		return driver;
	}

}
