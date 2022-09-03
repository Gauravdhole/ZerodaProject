package snippet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class httPcerification {
public static void main(String[] args) {
	ChromeOptions options = new ChromeOptions() ;
	options.setAcceptInsecureCerts(true);
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\src\\snippet\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(options);
	driver.get("https://expired.badssl.com/");
	System.out.println(driver.getTitle());
	

	
	
}
}
