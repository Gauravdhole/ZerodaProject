package FrontPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashBoard {
	public WebDriver driver;

	@FindBy(xpath = " //span[normalize-space()='Dashboard']")
	WebElement clickdashBoard;

	@FindBy(xpath = " //button[normalize-space()='Start investing']")
	WebElement ClickDashBoard;

	@FindBy(xpath = " //div[@class='instrument-search']//input[@placeholder='Search eg: infy bse, nifty fut, nifty weekly, gold mcx']")
	WebElement ClickOnElement;
	
	
	

	public dashBoard(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement verifyclickdashBoard() {
		return clickdashBoard;
	}

	public WebElement verifyClickDashBoard() {
		return ClickDashBoard;
	}

	public WebElement verifyClickOnElement() {
		return ClickOnElement;
	}
	
}
