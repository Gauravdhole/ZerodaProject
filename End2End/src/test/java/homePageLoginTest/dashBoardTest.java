package homePageLoginTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import HomePageObject.DashBoardHomePage;
import HomePageObject.homePageLogin;
import basedClass.BaseClassLogin;

public class dashBoardTest  extends BaseClassLogin{

	@BeforeClass
	
	public void satrt() throws IOException {
	 driver=	initalization();
	 driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void StartExcution1() {

		homePageLogin ll = new homePageLogin(driver);
		ll.verifyUserName().clear();
		ll.verifyUserName().sendKeys("admin@yourstore.com");
		ll.verifyPassword().clear();
		ll.verifyPassword().sendKeys("admin");
		ll.verifysumitt().click();
		
	}
	
	//compare the text from browser with actual  text
	
	@Test
	 public void StarExcution() {
	  DashBoardHomePage pp= new DashBoardHomePage(driver);
System.out.println( pp.verifylogoNOPCommerce().isDisplayed());
     
    
	  	
	}
}
