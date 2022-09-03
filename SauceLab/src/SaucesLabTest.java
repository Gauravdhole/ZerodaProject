import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.fasterxml.jackson.annotation.JacksonInject.Value;

public class SaucesLabTest {

	public static final String USERNAME = "rahul2";

	  public static final String ACCESS_KEY = "xxxxx";

	  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";



	public static void main(String[] args) throws MalformedURLException {

	// TODO Auto-generated method stub



	DesiredCapabilities caps = DesiredCapabilities.chrome();

	caps.setCapability("platform", "Windows 7");

	caps.setCapability("version", "51.0");

	WebDriver driver=new RemoteWebDriver(new java.net.URL(URL), caps);

	driver.get("http://google.com");

	System.out.println(driver.getTitle());

	}



	}
