package snippet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import recording.recording;

public class demo2 {

	public static void main(String[] args) {
		recording.startRecording("navigationTest");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\src\\snippet\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver1.get(
				"https://sso.teachable.com/secure/9521/identity/login/password?wizard_id=uXUllmBZ1yrZ_b7LmhkvB5dXuBScwxcGa0Q8qIioodyr-G3YF_BfNl7_EMPUribwjf51wfqU2IctEt-KEk3Jaw");
		driver1.findElement(By.id("email")).sendKeys("gauravdhole2016@gmail.com");

		driver1.findElement(By.name("password")).sendKeys("gauravdhole2016@gmail.com");

		driver1.findElement(By.cssSelector("input.button")).click();

		System.out.println(driver1.findElement(By.cssSelector("div.bodySmall")).getText());
	
	    driver1.findElement(By.linkText("Forgot Password")).click();
		
	    recording.stopRecording();
		
		
		
	
	
	
	}

}
