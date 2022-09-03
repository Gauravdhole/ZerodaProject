package snippet;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calender {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\src\\snippet\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://paytm.com/flights");
		// we give to css becouse common attribute for it
		driver.findElement(By.xpath("//div[@class='QbC4']//img[@role='presentation']")).click();

		while (!driver.findElement(By.xpath(
				" //body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/p[1]"))
				.getText().contains("December")) {
			driver.findElement(By.xpath(" //img[@id='moveToNext']")).click();
		}

		List<WebElement> dates = driver.findElements(By.className("_1t1M"));
		int count = driver.findElements(By.className("_1t1M")).size();

		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.className("_1t1M")).get(i).getText();
			if (text.equalsIgnoreCase("25")) {
				driver.findElements(By.className("_1t1M")).get(i).click();
				break;
			}
		}

	}

}
