package seleniumGrideE;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class googltest {

	@Test

	public void Homepakage() throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("Chrome");

//		caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//		caps.setCapability(CapabilityType.BROWSER_NAME, "chrome");

		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.2:4444"), caps);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("gauravdhole");
		driver.close();
	}
}
