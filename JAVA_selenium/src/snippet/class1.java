package snippet;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\src\\snippet\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		addItems(driver, itemsNeeded);
		String[] nameElemet = { "Cucumber", "Mango ", "Grapes", "Almonds " };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(2000);
		List<WebElement> Product = driver.findElements(By.cssSelector("h4.product-name"));
		Thread.sleep(2000);
		for (int i = 0; i < Product.size(); i++) {

			String[] name = Product.get(i).getText().split(" - ");
			String FormatSpace = name[0].trim();
			// check wheather name is extracted is present in array or not
			// converted array into array list
			List al = Arrays.asList(FormatSpace);
			int j = 0;
			if (al.contains(name)) {
				j++;
				// add to card
				driver.findElements(By.xpath(" //div[@class='products']//div[1]//div[3]//button[1]")).get(i).click();
				if (j == 3) {
					break;

				}
			}

		}
	}
}
////button[text()='ADD TO CART']