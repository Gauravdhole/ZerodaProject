package HomePageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepageObejct  {

	
	WebDriver  driver;
	@FindBy(xpath = " //h1[normalize-space()='Admin area demo']")
	WebElement FrontLargeLogo;
	@FindBy(xpath = "//strong[normalize-space()='Welcome, please sign in!']")
	WebElement frontsmalllogo;
	@FindBy(xpath = " //label[@for='RememberMe']")
	WebElement remebermr;
	@FindBy(xpath = " //h2[normalize-space()='Defaults for admin area']")
	WebElement defaultadmin;
	@FindBy(xpath = " //p[1]")
	WebElement allEmailpassword;
	
	public homepageObejct(WebDriver  driver) {
		this.driver=driver;
				PageFactory.initElements(driver, this);;
	}
	public   WebElement verifyFrontLargeLogo() {
		return  FrontLargeLogo;
	}
	public   WebElement verifyfrontsmalllogo() {
		return  frontsmalllogo;
	}public   WebElement verifyremebermr() {
		return  remebermr;
	}public   WebElement verifydefaultadmin() {
		return  allEmailpassword;
	}

}
