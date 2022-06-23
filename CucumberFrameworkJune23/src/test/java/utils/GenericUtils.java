package utils;

import org.openqa.selenium.WebDriver;

public class GenericUtils  {
	
	public WebDriver driver;
	
	public GenericUtils(WebDriver driver) {
		this.driver=driver;
	}
	
	public void switchToWindow(){
		System.out.println("Test");
	}

}
