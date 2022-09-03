package loginpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePage.testbase;

public class loginpage {

	public WebDriver driver;

	By frontlogo = By.xpath("//h2[normalize-space()='Login to Kite']");

	By useridText = By.xpath("//input[@id='userid']");

	By passwordtext = By.xpath("//input[@id='password']");

	By loginPage = By.xpath("//button[@type='submit']");
	 
	By forgetUsernam = By.xpath("//a[text()='Forgot user ID or password?']");
			
	
	By idontHaveAcount = By .xpath("//a[@class='text-light']");
	
	By logo =By.xpath("//img[@alt='Kite']");
	
	
	public loginpage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement verifyfrontlogo1() {
		return driver.findElement(frontlogo);

	}

	public WebElement verifyuseridText() {
		return driver.findElement(useridText);
	}

	public WebElement verifyPassword() {
		
        return  driver.findElement(passwordtext);
	}
        
	
	public WebElement verifyloginPage() {
	    return	driver.findElement(loginPage);
	}
	
	public  WebElement verifyforgetUsernam() {
		
		return  driver.findElement(forgetUsernam);
	}

	 public WebElement verifyidontHaveAcount() {
		return   driver.findElement(idontHaveAcount);
	 }
	  public WebElement verifylogo() {
		  return   driver.findElement(logo);
	  }

	  


}
