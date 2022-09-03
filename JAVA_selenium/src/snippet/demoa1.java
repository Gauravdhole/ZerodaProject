package snippet;

import java.sql.Driver;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

public class demoa1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\src\\snippet\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver1.get(
				"https://www.amazon.in/b/?_encoding=UTF8&node=4188827031&ref_=sv_top_ap_mega_6");
		
		driver1.findElement(By.xpath("//a[@href='/gp/bestsellers/?ref_=nav_cs_bestsellers']")).click();
		
		driver1.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("paragonsliper");
		
		driver1.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
	   driver1.findElement(By.xpath("//img[@alt='Men Sandals']")).click();
	   
	WebElement staticDropdown = driver1.findElement(By.xpath("  //div[@id='header']//li[1]//a[1]"));
		
	Select dropdown = new Select (staticDropdown);
	
	dropdown.selectByVisibleText("Casul Shoes"); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		driver1.findElement(By.id("email")).sendKeys("gauravdhole2016@gmail.com");
//
//		driver1.findElement(By.name("password")).sendKeys("gauravdhole2016@gmail.com");
//
//		// driver1.findElement(By.className("button")).click() ;
//
//		driver1.findElement(By.cssSelector("input.button")).click();
//
//		// driver1.findElement(By.cssSelector("input[submit='value']")).click() ;
//
//		System.out.println(driver1.findElement(By.cssSelector("div.bodySmall")).getText());
//
//		
//		
		
		
		
		
		
		
		
		
		
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\src\\snippet\\chromedriver.exe");
//		WebDriver driver1 = new ChromeDriver();
//
//		String[] itemsneededStrings = { "cucumber", "brocolli" };
//
//		// check wether name you extracted is present in array or not
//		// converted array into arraylist
//
//		driver1.get("https://www.facebook.com/");
//
//		List<WebElement> products = driver1.findElements(By.cssSelector("product-name"));
//
//		for (int i = 0; i < products.size(); i++) {
//
//			String name = products.get(i).getText();
//
//			// List itemsneededList = ArrayIndexOutOfBoundsException
//			// .aslist(itemsneededStrings);
//			if (name.contains("cucumber")) {
//				// CLICK ON ADD TO CART
//				((List<WebElement>) driver1.findElement(By.xpath("//button[text()='ADD TO CART']"))).get(i).click();
//				break;
//			}
//		}

		// System.setProperty("webdriver.gecko.driver",
		// "C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\src\\snippet\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();
		// driver.get("https://www.facebook.com/");

		// drop down select tag.
		// WebElement StaticDropdown =
		// driver1.findElement(By.id("dropdown-class-example"));
		// Select driver11 = new Select(StaticDropdown);
		// driver11.selectByIndex(2);
		// System.out.println(driver11.getFirstSelectedOption().getText());
		// driver11.selectByVisibleText("Option3");

	}

}
