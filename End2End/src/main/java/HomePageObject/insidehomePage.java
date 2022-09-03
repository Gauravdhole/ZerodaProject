package HomePageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class insidehomePage {
	WebDriver driver;

	@FindBy(xpath = " //i[@class='nav-icon fas fa-book']")
	WebElement clickcatalog;
	
	@FindBy(xpath = " //input[@id='CreatedOnFrom']")
	WebElement clickcreatefrom;
	@FindBy(xpath = " //input[@id='CreatedOnTo']")
	WebElement clickcretedto;
	@FindBy(xpath = " //input[@id='SearchText']")
	WebElement clicKmessage;
	@FindBy(xpath = " //select[@id='SearchApprovedId']")
	WebElement clickapproved;
	@FindBy(xpath = "//input[@id='search-product-name']")
	WebElement clickproduct;

	public insidehomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement verifyclickcatalog() {
		return clickcatalog;
	}



	public WebElement verifyclickcreatefrom() {
		return clickcreatefrom;
	}

	public WebElement verifyclickcretedto() {
		return clickcretedto;
	}

	public WebElement verifyclicKmessage() {
		return clicKmessage;
	}

	public WebElement verifyclickapproved() {
		return clickapproved;

	}



	public WebElement verifyclickproduct() {
		return clickproduct;

	}
}
