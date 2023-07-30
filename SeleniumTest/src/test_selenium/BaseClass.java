package test_selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jacki\\eclipse-workspace\\Shoban\\SeleniumTest\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	public void url(String url) {
		//this is shoban url
		driver.get(url);
	}
	
	public void typeText(WebElement element,String text) {
		//this is shoban sendkeys
		element.sendKeys(text);
	}
	
	
	public void elementClick(WebElement element) {
	
		element.click();
	}
	
	public String pro(String Key) throws IOException {
	

	}
	
}
