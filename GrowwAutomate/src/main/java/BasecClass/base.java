package BasecClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base   
{
	       public  WebDriver  driver;
           public Properties prop;
    
	       public WebDriver initalization() throws IOException {

	    prop= new Properties();
	 	FileInputStream file = new FileInputStream ("C:\\Users\\gaura\\eclipse-workspace\\GrowwAutomate\\src\\main\\resources\\base.properties");
		
		prop.load(file);
		 String BrowserName = prop.getProperty("Browser");
		System.out.println(BrowserName);
		
		if(BrowserName.equals(" chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\gaura\\eclipse-workspace\\GrowwAutomate\\chromedriver.exe");
			 driver = new ChromeDriver();
			 	
				
		}
		
		else  if (BrowserName.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\gaura\\eclipse-workspace\\GrowwAutomate\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		
		
		
		
driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS);	
	
	return driver;
	}
}
