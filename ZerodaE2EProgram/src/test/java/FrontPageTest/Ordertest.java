package FrontPageTest;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseClases.BasedClassBrowsers;
import FrontPage.FrontPageLoginPages;
import FrontPage.OrderPage;

public class Ordertest extends BasedClassBrowsers {
	public WebDriver driver;

	public static Logger Log = LogManager.getLogger(DahBoardTest.class.getName());

	@BeforeClass
	public void LetGo() throws IOException {
		driver = initalization();
		Log.info("Driver to inialzes and move to url ");
		driver.get(prop.getProperty("url"));
		Log.info("Then  login  Page is open  in it ");
	}

	@Test(priority = 1)

	public void VerifyFrontPageTest() {
		FrontPageLoginPages kk = new FrontPageLoginPages(driver);
		Log.info(kk);
		kk.verifyTextUserName().sendKeys("PGP313");

		Log.info(" automated types url and move to password");

		kk.verifyTextPassword().sendKeys("Gaurav@1996");
		Log.info("Password is hide in it");
		kk.verifyClickSumited().click();
		Log.info("click on LoginButton", kk);
		kk.verifyTextPIN().sendKeys("111996");
		Log.info("pin typing");
		kk.verifyClickContinues().click();

	}

	@Test(priority = 2)
	public void VerifyOrding() {

		OrderPage npn = new OrderPage(driver);
		Log.info("moves to OrderElemet", npn);
		npn.verifyClickOnOrder().click();
		Log.info("after click on order element then click on start");
		npn.verifyclickOnstart().click();
		npn.verifyGetORDERforit().sendKeys("Microsoft");

	}

	@AfterClass

	public void end12() {
		driver.close();
	}

}
