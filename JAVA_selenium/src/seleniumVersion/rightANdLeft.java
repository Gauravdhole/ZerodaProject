package seleniumVersion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

import org.openqa.selenium.By;

public class rightANdLeft {
 public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\src\\snippet\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
	 WebElement  IceCream  	=driver.findElement(By.xpath(" //label[@for='exampleCheck1']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(IceCream  )).click();
		
		 WebElement  azsx  	=driver.findElement(By.xpath(" //label[@for='exampleFormControlRadio1']"));
			driver.findElement(with(By.tagName("label")).toRightOf( azsx )).click();
			
		
		
		
		
		
		
		
		
}
}
