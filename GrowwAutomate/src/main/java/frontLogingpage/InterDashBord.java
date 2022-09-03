package frontLogingpage;

import javax.swing.text.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BasecClass.base;

public class InterDashBord extends base {
	public WebDriver driver;
	By pin = By.xpath("   //div[@title='Click if you want to reset your PIN']");
	By forgetpin = By.xpath("//div[@id='otpinput88parent']");

	public InterDashBord(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement verifypin() {
		return driver.findElement(pin);
	}

	public WebElement verifyforgetpin() {
		return driver.findElement(forgetpin);
	}
}
