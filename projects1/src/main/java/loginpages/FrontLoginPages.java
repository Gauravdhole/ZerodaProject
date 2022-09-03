package loginpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseclass.testbase;

public class FrontLoginPages extends testbase {
	public WebDriver driver;
	
	By finalusername = By.xpath(" //input[@id='userid']");
	By Finalpassword = By.xpath(" //input[@id='password']");
	By FinalLogin = By.xpath(" //button[@type='submit']");
	
	public FrontLoginPages(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement vrifyfinalusername() {
		return driver.findElement(finalusername);
	}

	public WebElement  verifyFinalpassword() {
		return driver.findElement(Finalpassword);
	}

	public WebElement verifyinalLogin() {
		return driver.findElement(FinalLogin);
	}

	
	}
	

