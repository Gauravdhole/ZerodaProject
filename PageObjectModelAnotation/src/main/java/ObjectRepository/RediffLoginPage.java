package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	WebDriver driver;
	
	
	By userNmae= By .xpath("//input[@id='login1']");
	By Paaword=By.xpath(" //input[@id='password']");
	By  serach= By.xpath(" //input[@title='Sign in']");
	By Ckickforgetlogin= By.xpath(" //u[normalize-space()='Forgot Password?']");
	
	public RediffLoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
	public WebElement Email() {
	return	driver.findElement(userNmae);
	}
	public WebElement password() {
 return		driver.findElement(Paaword);
	}
	public WebElement searchBox() {
	 return	driver.findElement(serach);
	}
	public WebElement verifyCkickforgetlogin() {
	return	 driver.findElement(Ckickforgetlogin);
	}
	
}
