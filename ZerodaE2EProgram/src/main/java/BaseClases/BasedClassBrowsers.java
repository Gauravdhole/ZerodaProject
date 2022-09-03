package BaseClases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasedClassBrowsers {

	public WebDriver driver;
	public Properties prop;

	public WebDriver initalization() throws IOException {
		

		prop = new Properties();
		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir")+"\\src\\main\\resources\\DataBased.properties");

		prop.load(file);
		String BrowserName = prop.getProperty("Browser");

		System.out.println(BrowserName);

		if (BrowserName.contains("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					
					System.getProperty("user.dir")+"\\chromedriver.exe");
			ChromeOptions options= new ChromeOptions();
			if(BrowserName.contains("headless")) 
			{
			options.addArguments("headless");
			}
			driver = new ChromeDriver(options);

		} else if (BrowserName.contains("firefox")) {
			

			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir")+"\\geckodriver.exe");
			
         ChromeOptions options1= new ChromeOptions();
			
         if(BrowserName.contains("headless")) 
			{
        	 options1.addArguments("headless");
			}
			driver = new FirefoxDriver(options1);
		}

		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);

		return driver;
	}

	public void GetScreenShrot(String testCaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts = ((TakesScreenshot) driver);

		File socrce = ts.getScreenshotAs(OutputType.FILE);
		String desyinationFile = System.getProperty("user.dir")+"\\FailureScreenShort\\" +testCaseName+ " .png";

		FileUtils.copyFile(socrce, new File(desyinationFile));
	}

}