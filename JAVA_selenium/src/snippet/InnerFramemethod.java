package snippet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerFramemethod {
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\src\\snippet\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		// driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver1.get("http://demo.automationtesting.in/Frames.html");

		driver1.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();

		WebElement outerFrame = driver1.findElement(By.xpath("  //iframe[@src='MultipleFrames.html']"));
		driver1.switchTo().frame(outerFrame);

		WebElement innerFramne = driver1
				.findElement(By.xpath(" //iframe[normalize-space()='<p>Your browser does not support iframes.</p>']"));
		driver1.switchTo().frame(innerFramne);

		driver1.findElement(By.xpath(" //input[@type='text']")).sendKeys("gaurav");

	}
}
