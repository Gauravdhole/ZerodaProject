package homePageLoginTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

import HomePageObject.homePageLogin;
import HomePageObject.insidehomePage;
import HomePageObject.ptoductRevies;
import basedClass.BaseClassLogin;

public class HomeTEST extends BaseClassLogin {

	@BeforeClass
	public void Start() throws IOException {
		driver = initalization();

		driver.get(prop.getProperty("url"));
	}

	@Test
	public void StartExcution() {

		homePageLogin ll = new homePageLogin(driver);
		ll.verifyUserName().clear();
		ll.verifyUserName().sendKeys("admin@yourstore.com");
		ll.verifyPassword().clear();
		ll.verifyPassword().sendKeys("admin");
		ll.verifysumitt().click();
		
	}

	@Test
	
	
	public void   insideHome() {
		insidehomePage qq = new insidehomePage(driver);
	 qq.verifyclickcatalog().click();
	}
	 @Test
	 public void   insideHome1() {
	 
	 
   ptoductRevies rr = new ptoductRevies(driver);
    rr.verifyclickProductRevies().click();
	}
	 
	 
	
//	@AfterClass
//	public void end() {
//		driver.close();
//	}
}
