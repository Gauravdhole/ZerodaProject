package snippet;

import org.apache.poi.ss.usermodel.Footer;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerFrame2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\src\\snippet\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver1.findElements(By.tagName("a")).size());

		WebElement FooterDriver = driver1.findElement(By.id("gf-BIG"));// limiting webdriver scope
		System.out.println(FooterDriver.findElements(By.tagName("a")).size());

		WebElement columldriver = FooterDriver.findElement(By.xpath("//tbody/tr/td[1]/ul[1]"));
		System.out.println(columldriver.findElements(By.tagName("a")).size());

		for (int i = 1; i < columldriver.findElements(By.tagName("a")).size(); i++) {

			
			String clickLink = Keys.chord(Keys.CONTROL, Keys.ENTER);

			columldriver.findElements(By.tagName("a")).get(i).sendKeys(clickLink);
		}
	}

}
