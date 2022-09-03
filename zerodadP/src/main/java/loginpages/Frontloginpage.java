package loginpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import baseclass.testbase;

public class Frontloginpage  extends testbase{
	public WebDriver driver;
	//// input[@id='userid']
	By username11 = By.xpath(" //input[@id='userid']");
	By password11 = By.xpath(" //input[@id='password']");
	By login11 = By.xpath(" //button[@type='submit']");

	public Frontloginpage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement verifyusername11() {
		return driver.findElement(username11);
	}

	public WebElement verifypassword11() {
		return driver.findElement(password11);
	}

	public WebElement verifylogin11() {
		return driver.findElement(login11);
	}

}
