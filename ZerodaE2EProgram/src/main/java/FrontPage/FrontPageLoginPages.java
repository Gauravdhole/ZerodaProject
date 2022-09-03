package FrontPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class FrontPageLoginPages  {
    public 	WebDriver driver;

	@FindBy(xpath = " //input[@id='userid']")
	private   WebElement TextUserName;
	@FindBy(xpath = " //input[@id='password']")
	private WebElement TextPassword;
	@FindBy(xpath = "//button[@type='submit']")
	 WebElement ClickSumited;
	@FindBy(xpath = "//input[@id='pin']")
	private     WebElement TextPIN;
	@FindBy(xpath = "//button[@type='submit']")
	 WebElement ClickContinues;

	
	 
	   @FindBy(xpath = " //input[@placeholder='Search eg: infy bse, nifty fut, nifty weekly, gold mcx']")
	WebElement clcikElement;
	   
	public FrontPageLoginPages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement verifyTextUserName() {
		return TextUserName;
	}

	public WebElement verifyTextPassword() {
		return TextPassword;
	}

	public WebElement verifyClickSumited() {
		return ClickSumited;
	}

	public WebElement verifyTextPIN() {
		return TextPIN;
	}

	public WebElement verifyClickContinues() {
		return ClickContinues;
	}
	 public WebElement verifyclcikElement() {
			return	 clcikElement;
			 }
}
