package snippet;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3 {
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\src\\snippet\\chromedriver.exe");
		WebDriver driver11 = new ChromeDriver();

		driver11.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver11.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		driver11.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

		driver11.get("https://www.google.co.in/");
		// WebElement searchBox =driver11.findElement(By.name("q"));
		// searchBox.sendKeys("powerlifting",Keys .ENTER);

		driver11.navigate().to("https://trytestingthis.netlify.app/");
		List<WebElement> options = driver11.findElements(By.name("Optionwithcheck[]"));

		for (WebElement element : options) {
			System.out.println(element.getText());

		}

		Thread.sleep(1000);
		driver11.close();
		driver11.quit();
		;

	}

}
