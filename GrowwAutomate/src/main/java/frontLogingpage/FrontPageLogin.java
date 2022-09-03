package frontLogingpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrontPageLogin {
	public WebDriver driver;

	By ClickMethod = By.xpath("//span[contains(text(),'Login/Register')]");
	By username = By.xpath("//input[@id='login_email1']");
	By continous = By.xpath(" //div[@class='lils382ContinueBtn']//div//div[@class='absolute-center btn51ParentDim");
	By password = By.xpath("//input[@id='login_password1']");
	By sumit = By.xpath("//div[@class='absolute-center btn51ParentDimension']");

	public FrontPageLogin(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement verifyClickMethod() {
		return driver.findElement(ClickMethod);
	}

	public WebElement verifyusername() {
		return driver.findElement(username);
	}

	public WebElement verifycontinous() {
		return driver.findElement(continous);
	}

	public WebElement verifypassword() {
		return driver.findElement(password);
	}

	public WebElement verifysumit() {
		return driver.findElement(sumit);
	}

}
