package logintestcase;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basePage.basePage;
import basePage.testbase;
import loginpages.FrontLoginPages;
import loginpages.Frontloginpage;

public class finalFrontLoginTest extends basePage {

	@BeforeMethod

	public void InitialtizationLL() throws IOException {
		driver = initalization();
		driver.get(prop.getProperty("url"));
	}

	@Test(dataProvider = "GetData")

	public void finalDataHardcore(String user, String Pssword) {

		FrontLoginPages PPl = new FrontLoginPages(driver);

		PPl.vrifyfinalusername().sendKeys(user);

		PPl.vrifyfinalusername().sendKeys(Pssword);
		PPl.verifyinalLogin().click();

	}

	@DataProvider
	public String[][] GetData() {
		String[][] data = new String[1][2];
		data[0][0] = "UR8844";
		data[0][1] = "Shaktiman1@";

		return data;
	}

}
