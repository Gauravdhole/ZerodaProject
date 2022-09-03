package seleniumVersion;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Relative_locator {


	public static void main(String[] args) {

		//above(): Element located above with respect to the specific element
		//syntax::
		// driver.findElement(withTagName("eee").above(WebElement))
		
		// find the unix box
		//go and find the lable
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\src\\snippet\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		WebElement  nameEditBox =  driver.findElement(By.cssSelector("[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox )).getText());
		
		
		
		
		
		
		
		
		
		
	}

	}

	

