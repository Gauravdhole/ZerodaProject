package FrontPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HoldingPage {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//span[normalize-space()='Holdings']")
	WebElement ClickOnHoldingElement;
	
	@FindBy(xpath = "//button[@type='button']")
	WebElement clickOnStardButton;
	
	@FindBy(xpath = "//div[@class='instrument-search']//input[@placeholder='Search eg: infy bse, nifty fut, nifty weekly, gold mcx']")
	WebElement TypedButton;
	
	
	
	public  HoldingPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement verifyClickOnHoldingElement() {
		return ClickOnHoldingElement;
	}
	
	public WebElement verifyclickOnStardButton() {
		return clickOnStardButton;
	}
	
	public WebElement verifyclickTypedButton() {
		return TypedButton;
	
	}
}
	

