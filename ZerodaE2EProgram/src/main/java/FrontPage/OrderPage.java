package FrontPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {

	public WebDriver driver;

	@FindBy(xpath = "//span[normalize-space()='Orders']")
	WebElement ClickOnOrder;

	@FindBy(xpath = " //button[@type='button']")
	WebElement clickOnstart;

	@FindBy(xpath = "//div[@class='instrument-search']//input[@placeholder='Search eg: infy bse, nifty fut, nifty weekly, gold mcx']")
	WebElement GetORDERforit;
	

	public OrderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement verifyClickOnOrder() {
		return ClickOnOrder;
	}

	public WebElement verifyclickOnstart() {
		return clickOnstart;
	}

	public WebElement verifyGetORDERforit() {
		return GetORDERforit;
	}

}
