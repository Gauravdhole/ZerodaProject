package baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import com.google.j2objc.annotations.Property;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testbase {
	public   WebDriver driver;
    public Properties prop;
    
	public WebDriver initalization() throws IOException {

	    prop= new Properties();
	 	FileInputStream file = new FileInputStream ("C:\\Users\\gaura\\eclipse-workspace\\zerodadP\\src\\main\\resources\\Data.properties");
		
		prop.load(file);
		 String BrowserName = prop.getProperty("Browser");
		
		System.out.println(BrowserName);
		
		if(BrowserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\gaura\\eclipse-workspace\\projects1\\chromedriver.exe");
			 driver = new ChromeDriver();
			 	
				
		}
		else  if (BrowserName.equals("firfox")) {
			
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\gaura\\eclipse-workspace\\projects1\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}else if(BrowserName.equals("opera"))
		{
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		
		}
		
		
	driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS);	
	
	return driver;
	}
	
}//C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\src\\snippet\\chromedriver.exe
