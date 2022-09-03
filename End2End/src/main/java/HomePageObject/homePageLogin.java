package HomePageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basedClass.BaseClassLogin;

public class homePageLogin extends BaseClassLogin {

	
	public WebDriver driver;
	
	@FindBy(xpath = "  //input[@id='Email']")
	WebElement UserName;
	@FindBy(xpath  = " //input[@id='Password']")
	WebElement Password;
	@FindBy(xpath = " //button[@type='submit']")
	WebElement sumitt;
	
	public homePageLogin(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	public   WebElement verifyUserName() {
		return  UserName;
	}
	public   WebElement verifyPassword() {
		return  Password;
	}
	public   WebElement verifysumitt() {
		return  sumitt;
	}
}
