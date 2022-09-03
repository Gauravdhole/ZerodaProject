package snippet;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class class5 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\src\\snippet\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_4d1ohbptwj_e&adgrpid=58490306106&hvpone=&hvptwo=&hvadid=486391490878&hvpos=&hvnetw=g&hvrand=401919255439363404&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302118&hvtargid=kwd-298187295805&hydadcr=5657_2175734&gclid=CjwKCAjwt7SWBhAnEiwAx8ZLap4ZPXL8ha7OWZMWzJFi6OQgAfgAoTC9Ux5ExjXnQCvo6QYvaJ6MnRoC6FsQAvD_BwE");
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\screenshot_all\\amazon22.png");
		FileHandler.copy(source ,destination);
		
	}
	
	
	
}
