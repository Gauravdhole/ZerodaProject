package snippet;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\src\\snippet\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	
	      WebElement ges = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[5]"));
	System.out.println(ges.getText());
	
//	              List<WebElement> ab = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
//	             
//	              for (WebElement cd : ab) {
//					System.out.println(cd.getText());
//				}
//	              
	              
	              
	              
	              
	              
	              
	              
	              
	              
	              
	              
	              
}
}
