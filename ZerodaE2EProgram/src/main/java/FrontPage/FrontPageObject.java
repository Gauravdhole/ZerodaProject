package FrontPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FrontPageObject {
	
	WebDriver driver;

	@FindBy(xpath = " //img[@alt='Kite']")
	    WebElement FrontLogo;
	@FindBy(xpath = " //h2[normalize-space()='Login to Kite']")
	WebElement TextLoginkite;
	@FindBy(xpath = " //a[@class='text-light forgot-link']")
	WebElement TextFrorgetUserid;
	@FindBy(xpath = " //img[@alt='Zerodha']")
	WebElement TextZeroda;
	@FindBy(xpath = " //a[@class='text-light']")
	WebElement testSingIn;
	@FindBy(xpath = " //p[@class='text-light text-xxsmall exchanges-info dim']")
	WebElement TextSomefooter;

	
	
	
	public FrontPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement VerifyFrontLogo() {
		return FrontLogo;
	}

	public WebElement VerifyTextLoginkite() {
		return TextLoginkite;
	}

	public WebElement VerifyTextFrorgetUserid() {
		return TextFrorgetUserid;
	}

	public WebElement VerifyTextZeroda() {
		return TextZeroda;
	}

	public WebElement VerifytestSingIn() {
		return testSingIn;
	}

	public WebElement VerifyTextSomefooter() {
		return TextSomefooter;
	}
}
