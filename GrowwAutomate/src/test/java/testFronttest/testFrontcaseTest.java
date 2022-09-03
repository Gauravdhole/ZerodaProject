package testFronttest;




import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BasecClass.base;

import frontLogingpage.FrontPageLogin;


public class testFrontcaseTest extends base {

	@BeforeClass
	
	public void Start() throws IOException {
	driver	=initalization();
	driver.get(prop.getProperty("url"));
	}
	
@Test(priority = 1)
public void LoginPage() {
	
	
	FrontPageLogin  kk= new FrontPageLogin(driver);
	kk.verifyClickMethod().click();
	kk.verifyusername().sendKeys("gauravdhole2016@gmail.com");
	kk.verifycontinous().click();
	kk.verifypassword().sendKeys("G@111996");
	kk.verifysumit().click();
	
	
}
@Test (priority = 2)
public void loginPge() {
	FrontPageLogin LoginPage= new FrontPageLogin(driver); 
	  
	  LoginPage.verifypassword().click();
}

	

}
