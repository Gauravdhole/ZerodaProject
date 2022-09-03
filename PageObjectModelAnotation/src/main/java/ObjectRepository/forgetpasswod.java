package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class forgetpasswod {

	WebDriver driver;
	public  forgetpasswod(WebDriver driver) {
		this.driver=driver;}



By types= By.xpath(" //input[@id='txtlogin']");
By clickButton = By.xpath(" //input[@name='next']");
public  WebElement verifytypes() {
	return  driver.findElement(types);
}
public WebElement VerifyclickButton() {
return	 driver.findElement(clickButton);
}



}




