package frontBaseClases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sdetBasePage {

	
	public   WebDriver driver;
    public Properties prop;
	 public WebDriver intial() throws IOException {
		 Properties pp= new Properties();
		FileInputStream FrontFile= new FileInputStream("C:\\Users\\gaura\\eclipse-workspace\\AchePOISelenium\\src\\main\\resources\\sdetData.properties");
		 pp.load(FrontFile);
		 String browserName = pp.getProperty("Browser");
	 
	 System.out.println(browserName);
	 if(browserName.equals("chrome")) 
	 {
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\gaura\\eclipse-workspace\\AchePOISelenium\\geckodriver.exe");
		 
		WebDriver driver =new  FirefoxDriver();
		 
	 }else	if(browserName.equals("chrome"))
	 {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\gaura\\eclipse-workspace\\AchePOISelenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
			 	
				
		} 
	 driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS);	
		
		return driver;
	 
	 
}
}
