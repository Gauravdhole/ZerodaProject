package seleniumGrideE;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class restTest {

	@Test

	public void Homepakage() throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();
//		caps.setBrowserName("firefox");

//		caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	caps.setCapability(CapabilityType.BROWSER_NAME, "firfox");

		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.2:4444"), caps);
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.name(" field-keywords")).sendKeys("tishirt");
		driver.close();
	}
}
