package snippet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class demo5 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\src\\snippet\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
	
	  driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
      WebElement LoginButton = driver.findElement(By.id("btnLogin"));
	  driver.findElement(RelativeLocator.with(By.tagName("input")).above("LoginButton")).sendkey("abcd");
	  Thread.sleep(500);
	  
}
}
