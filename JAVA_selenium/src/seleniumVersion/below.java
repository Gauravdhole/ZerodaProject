package seleniumVersion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.sql.Date;

import org.openqa.selenium.By;
public class below {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\src\\snippet\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("https://rahulshettyacademy.com/angularpractice/");
	
	      WebElement  DateEditbox  = driver.findElement(By.xpath("//label[@for='dateofBirth']\r\n"));
	    driver.findElement(with(By.tagName("input")).below( DateEditbox)).click();
			
	
	
	
}
}
