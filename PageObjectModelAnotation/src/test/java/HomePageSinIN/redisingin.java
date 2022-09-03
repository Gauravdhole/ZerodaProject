package HomePageSinIN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.RediffLoginPage;
import ObjectRepository.forgetpasswod;

public class redisingin  {

	
	@Test
	public void Login() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gaura\\eclipse-workspace\\Project2\\chromedriver.exe");
		WebDriver   driver = new ChromeDriver();
		 	
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	RediffLoginPage ll= new RediffLoginPage(driver);
	
	ll.Email().sendKeys("gaurav");
	ll.password().sendKeys("gaurav");
	ll.searchBox().click();
	ll.verifyCkickforgetlogin().click();
	forgetpasswod pp= new forgetpasswod(driver);
	pp.verifytypes().sendKeys("gauravdhole");
	pp.VerifyclickButton().click();
	
	}
}
