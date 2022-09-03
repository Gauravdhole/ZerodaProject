package snippet;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class waits {
	public static void main(String[] args) {

		// what is waits---- function in selenium to make webdriver wait for a specific
		// time or fo some condition to be true

		// ------------------------------------------------------------
		// 2)-- why wait are requried in automation testing
		// sometime the automation script is faster than the browser loading time or
		// object render time on browser-- no such element
		// different element may load at different time interval
		// se webdriver script and browser event may not be synhchromosu at all the time
		// -----------------------------------------------------------

		// 1_ impliciit wait -----
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		// default setting is 0;
		// ***** once set , the implicit wIT IS SET FOR THE ENTIRE LIFE OF THE SEDDION
      //  polling frequency is -500milesecound
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\src\\snippet\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("automation step by step" + Keys.ENTER);

		driver.close();
		driver.quit();

	}
}
