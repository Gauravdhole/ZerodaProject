package HomePageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardHomePage {

	WebDriver driver;

	@FindBy(xpath = "//img[@class='brand-image-xl logo-xl']")
	WebElement logoNOPCommerce;
	@FindBy(xpath = "//p[normalize-space()='Promotions']")
	WebElement clickPromotion;
	@FindBy(xpath = " //p[normalize-space()='Newsletter subscribers']")
	WebElement newLetterscbscberier;

	public DashBoardHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement verifylogoNOPCommerce() {
		return logoNOPCommerce;
	}
	
	public WebElement  verifyclickPromotion() {
	return	clickPromotion;
	}
	public WebElement verifynewLetterscbscberier() {
	return	newLetterscbscberier;
		
	}
}
