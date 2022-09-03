package FrontEnd;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAloneTest {
public static void main(String[] args) {
	
	
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://rahulshettyacademy.com/client/auth/login");
	driver.findElement(By.id("userEmail")).sendKeys("gauravdhole2016@gmail.com");
	
	driver.findElement(By.id("userPassword")).sendKeys("Gaurav11");
	driver.findElement(By.id("login")).click();
	
	
	
	
}
}
