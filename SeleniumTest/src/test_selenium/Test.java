package test_selenium;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test extends BaseClass{

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		Test test = new Test();
		test.browserLaunch();
		test.url(test.pro("site"));
		
		WebElement userName = driver.findElement(By.name("username"));
		test.typeText(userName,test.pro("userName"));
		
		WebElement passWord = driver.findElement(By.name("password"));
		
		test.typeText(passWord,test.pro("passWord"));
		
		WebElement login = driver.findElement(By.xpath("//*[@type='submit']"));
		test.elementClick(login);
	
	}
	
}
