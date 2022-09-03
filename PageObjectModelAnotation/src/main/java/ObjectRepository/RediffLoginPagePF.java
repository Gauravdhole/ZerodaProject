package ObjectRepository;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagePF {
	WebDriver driver;
	
	
	
	
	@FindBy(xpath ="//input[@id='login1']")
	WebDriver userNmae;
	@FindBy(xpath = " //input[@id='password']")
	WebDriver Paaword;
	
	@FindBy(xpath = "//input[@title='Sign in']")
	WebDriver serach;
	@FindBy (xpath = "//u[normalize-space()='Forgot Password?']")
	WebDriver Ckickforgetlogin;

	public RediffLoginPagePF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebDriver Email() {
	return	userNmae;
	}
	public WebDriver password() {
 return		Paaword;
	}
	public WebDriver searchBox() {
	 return	serach;
	}
	public WebDriver verifyCkickforgetlogin() {
	return	 Ckickforgetlogin;
	}
	
}
