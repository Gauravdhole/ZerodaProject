package logintestcase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseclass.testbase;
import io.github.bonigarcia.wdm.managers.VoidDriverManager;
import loginpages.Frontloginpage;

public class frontLogintest extends testbase {
	
	@BeforeMethod
	public void frontIntialtion() throws IOException {
		driver = initalization();
		driver.get(prop.getProperty("url"));
	}

	@Test(dataProvider = "getData")

	public void intiallogingMethod(String usename, String password) throws IOException {
		
		Frontloginpage FL = new Frontloginpage(driver);
		FL.verifyusername11().sendKeys(usename);
		FL.verifypassword11().sendKeys(password);
		FL.verifylogin11().click();
	}

	
	
	@AfterMethod
	
	public void Atest() {
		driver.close();
	}
	
	
	@DataProvider

	public Object[][] getData() {

		// Row Stan for how many different data types should run
		// colun stand for how many value per test
// 
		Object[][] data = new Object[5][2];
		data[0][0] = "WWM@AD.COM";
		data[0][1] = "12345";
		// 1 row
		data[1][0] = "Gaurav@#$%.com";
		data[1][1] = "578742";
		// 2 row 
		data [2][0]= "ETVHJ4542.com";
		data [2][1]= "HJGUB5";
		//data 3 row
		data[3][0]="podgfhb@jf.%%^$$ckf";
		data[3][1]="vfdhf888**WE";
		//4 ROW
		data [4][0]="!@#$%^&*()";
		data[4][1]="ppood";
		return data;
	}

}
