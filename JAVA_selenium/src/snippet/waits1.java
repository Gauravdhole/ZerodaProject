package snippet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waits1 {

	// -----explicit wait ---
	// useful when there you need to wait until some codition is met make webdriver
	// to wait until a certain condition is true
	
	// import otg.openqa.selenium.support.ui.expectedcondition ;
	// import org.openqa.selenium.support.ui.webdriverwait;
	
	
	public static void main(String[] args) {
		
		
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		// wait.(ExpectedConditions.elementToBeClickable(By.xpath(""));
		 wait.until(ExpectedConditions.visibilityOf(webElement))	
		 
	
	}

}
