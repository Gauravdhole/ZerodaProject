package basePage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class basePage {

	public   WebDriver driver;
	    public Properties prop;
	    
		public WebDriver initalization() throws IOException {
	
		    prop= new Properties();
		 	FileInputStream file = new FileInputStream ("C:\\Users\\gaura\\eclipse-workspace\\Project2\\src\\main\\resources\\database.properties");
			
			prop.load(file);
			 String BrowserName = prop.getProperty("Browser");
			
			System.out.println(BrowserName);
			
			if(BrowserName.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\gaura\\eclipse-workspace\\Project2\\chromedriver.exe");
				 driver = new ChromeDriver();
				 	
					
			}
			else  if (BrowserName.equals("firfox")) {
				
				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\gaura\\eclipse-workspace\\Project2\\geckodriver.exe");
				 driver = new FirefoxDriver();
			}
			
			
			
			
		driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS);	
		
		return driver;
		}

}
