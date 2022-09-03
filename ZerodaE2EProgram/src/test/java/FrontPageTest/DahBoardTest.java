package FrontPageTest;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Order;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseClases.BasedClassBrowsers;
import FrontPage.FrontPageLoginPages;
import FrontPage.OrderPage;
import FrontPage.dashBoard;

public class DahBoardTest extends BasedClassBrowsers {

	public WebDriver driver;

	public static Logger Log = LogManager.getLogger(DahBoardTest.class.getName());

	@BeforeClass
	public void StartDahBord() throws IOException {
		driver = initalization();
		Log.info("Driver to inialzes and move to url ");
		driver.get(prop.getProperty("url"));
		Log.info("Then  login  Page is open  in it ");
	}

	@Test(priority = 1)

	public void VerifyFrontTest() {
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
	public void VerifyDashBoard() {
		dashBoard ddp = new dashBoard(driver);
		Log.info(ddp);

		ddp.verifyclickdashBoard().click();
		Log.info("click on DashBord");
		ddp.verifyClickDashBoard().click();
		Log.info("Send the DashBoard to hdfc", ddp);

		ddp.verifyClickOnElement().sendKeys("HDFC");
		ddp.verifyClickOnElement().click();
		Log.info("click  on it");

	}


	public void end1() {
		driver.close();
	}
}
