package FrontPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PositionPage {
	
    public  WebDriver driver;

	@FindBy(xpath = "//span[normalize-space()='Positions']")
	WebElement ClicOnPositionElement;
	@FindBy(xpath = "//button[@type='button']")
	WebElement ClickOnStarButton;

	@FindBy(xpath = "div[@class='instrument-search']//input[@placeholder='Search eg: infy bse, nifty fut, nifty weekly, gold mcx']")
	WebElement TypingOntestBOX;

	public PositionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement verifyClicOnPositionElement() {
		return ClicOnPositionElement;
	}

	public WebElement verifyClickOnStarButton() {
		return ClickOnStarButton;
	}

	public WebElement verifyTypingOntestBOX() {
		return TypingOntestBOX;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
