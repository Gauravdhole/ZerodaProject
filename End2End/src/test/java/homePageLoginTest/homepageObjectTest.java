package homePageLoginTest;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import HomePageObject.homepageObejct;
import basedClass.BaseClassLogin;

public class homepageObjectTest extends BaseClassLogin {

	@BeforeClass
	
	
	public void start() throws IOException {
		driver=initalization();
		driver.get(prop.getProperty("url"));
	}
	
	
	
	
	@Test
	public void ObjectFind() {
		
		
		
		
		homepageObejct oo=new homepageObejct(driver);
		
		System.out.println(oo.verifyFrontLargeLogo().getText());
		System.out.println(oo.verifyfrontsmalllogo().isSelected());
		oo.verifyremebermr().click();
		System.out.println(oo.verifydefaultadmin().isDisplayed());
		
	}
	@AfterClass
	public void end() {
		driver.close();
	}
}
