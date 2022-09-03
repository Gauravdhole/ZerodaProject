package logintestcase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.testbase;
import loginpages.loginpage;
//import pageclass.logginpage;

public class loginTest extends testbase {
	
	@BeforeMethod
	
	public void InitialtizationL() throws IOException {
		driver = initalization();
		driver.get(prop.getProperty("url"));
	}

	@Test
	public void verifyfrontlogo1Test() throws IOException {
		
		loginpage login = new loginpage(driver);

		login.verifyfrontlogo1().click();

	}

	@Test

	public void verifyuseridText() throws IOException {
		
		loginpage login = new loginpage(driver);

		login.verifyuseridText().click();

	}

	@Test

	public void verifyPassword() throws IOException {
		
		loginpage login = new loginpage(driver);

		login.verifyPassword().click();

	}

	@Test

	public void verifyforgetUsernam() throws IOException {
		
		loginpage login = new loginpage(driver);

		login.verifyforgetUsernam().click();

	}

	@Test

	public void verifylogo() throws IOException {
		
		loginpage login = new loginpage(driver);

		login.verifylogo().click();

	}

	@Test

	public void verifyidontHaveAcount() throws IOException {
		
		loginpage login = new loginpage(driver);

		login.verifyidontHaveAcount().click();

	}
	
	@AfterMethod
	public void Atest() {
		driver.close();
	}
	}


