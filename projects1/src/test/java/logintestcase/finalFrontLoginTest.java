package logintestcase;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseclass.testbase;
import loginpages.FrontLoginPages;
import loginpages.Frontloginpage;

public class finalFrontLoginTest extends testbase {
	private static  Logger  Log=LogManager.getLogger(testbase.class.getName());
	@BeforeMethod

	public void InitialtizationLL() throws IOException {
		driver = initalization();
		Log.info("Driver to inialzes");
		driver.get(prop.getProperty("url"));
		Log.info("navigate to home pages");
	}

	@Test(dataProvider = "GetData")

	public void finalDataHardcore(String user, String Pssword) {

		FrontLoginPages PPl = new FrontLoginPages(driver);

		PPl.vrifyfinalusername().sendKeys(user);

		PPl.vrifyfinalusername().sendKeys(Pssword);
	
		PPl.verifyinalLogin().click();
		Log.info("sucessfull  unsucessfull ");

	}

	@DataProvider
	public String[][] GetData() {
		String[][] data = new String[1][2];
		data[0][0] = "UR8844";
		data[0][1] = "Shaktiman1@";

		return data;
	}

}
