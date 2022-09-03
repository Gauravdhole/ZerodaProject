package seleniumVersion;


import java.io.File;
import java.time.Duration;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.commons.compress.compressors.FileNameUtil;
import org.apache.commons.compress.utils.FileNameUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.apache.commons.io.FileUtils;
public class InvoKing_maltipleWindow {
	
	

	public static void main(String[] args) {
	

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\src\\snippet\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));

		driver.switchTo().newWindow(WindowType.WINDOW);

		Set<String> handles = driver.getWindowHandles();
		java.util.Iterator<String> it = handles.iterator();
		String ParentWindowid = it.next();
		String childWindo = it.next();
		driver.switchTo().window(childWindo);
		driver.get("https://rahulshettyacademy.com/");
		    String courseName=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();

		driver.switchTo().window(ParentWindowid);
WebElement	name	=driver.findElement(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-invalid']"));
name.sendKeys(courseName);
//  File file=name.getScreenshotAs(OutputType.FILE);
//	FileUtils.copyValueOf(file,new File("logo.png"));


		
		
		
		
		
		
		
		
	}
}
