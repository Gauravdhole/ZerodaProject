package snippet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class my_all_used_locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\src\\snippet\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver1.get("https://www.amazon.in/");
		driver1.findElement(By.xpath("//a[@href='javascript: void(0)']")).click();
		driver1.findElement(By.xpath(" //b[normalize-space()='Hello, Sign in']")).click();
		driver1.findElement(By.xpath("//input[@type ='email']")).sendKeys("gauravdhole2016@gmail.com");
		driver1.findElement(By.xpath("//input[@id='continue']")).click();
		driver1.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("11121996");
		driver1.findElement(By.xpath(" //input[@id='signInSubmit']")).click();
		driver1.findElement(By.xpath("//a[@id='auth-fpp-link-bottom']")).click();
		driver1.findElement(By.xpath("//input[@id='continue']")).click();
		

	}

}
