package FrontPageTest;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BaseClases.BasedClassBrowsers;
import FrontPage.FrontPageObject;

public class FrontObjectTest extends BasedClassBrowsers {
	public WebDriver driver;
	ExtentReports extent;

	public static Logger Log = LogManager.getLogger(DahBoardTest.class.getName());

	@BeforeClass

	public void Config() throws IOException {

		driver = initalization();
		Log.info("Driver to inialzes");
		driver.get(prop.getProperty("url"));
		Log.info("go to url or not");

	}

	@Test

	public void ObjectTest() {

		FrontPageObject object = new FrontPageObject(driver);
		System.out.println(object.VerifyFrontLogo().isDisplayed());
		System.out.println(object.VerifyTextLoginkite().isSelected());
		System.out.println(object.VerifyTextFrorgetUserid().isEnabled());
		System.out.println(object.VerifyTextZeroda().isDisplayed());

		System.out.println(object.VerifytestSingIn().isDisplayed());
		System.out.println(object.VerifyTextSomefooter().isSelected());

	}

	@AfterClass
	public void end() {
		driver.quit();
	}

}
