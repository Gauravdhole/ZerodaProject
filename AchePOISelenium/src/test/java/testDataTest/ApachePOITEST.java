package testDataTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import net.jodah.failsafe.internal.util.Assert;

public class ApachePOITEST {
	WebDriver driver;

	@BeforeClass

	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gaura\\eclipse-workspace\\AchePOISelenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Test(dataProvider = "LoginData")

	public void LoginTest(String user, String pasword, String exp) {

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		WebElement textelement = driver.findElement(By.id("Email"));
		textelement.clear();
		textelement.sendKeys(user);

		WebElement textpassword = driver.findElement(By.id("Password"));
		textpassword.clear();
		textpassword.sendKeys(pasword);

		WebElement clickLogin = driver.findElement(By.xpath(" //button[@type='submit']"));
		clickLogin.click();

		String Exp_titel = "dashbord/nopcommerces adminstresation";
		String Exp_titel1 = driver.getTitle();
		if (exp.equals("valid")) {
			if (Exp_titel.equals(Exp_titel1)) {
				org.testng.Assert.assertTrue(true);
			} else {
				org.testng.Assert.assertTrue(false);
			}
		} else if (exp.equals("invalid")) {
			if (Exp_titel.equals(Exp_titel1)) {
				driver.findElement(By.xpath(" //a[normalize-space()='Logout']")).click();
				org.testng.  Assert.assertTrue(false);
			} else {
				org.testng.Assert.assertTrue(true);
			}

		}
	}

	@DataProvider(name = "LoginData")
	public String[][] detData() {
		String Data[][] = {

				{ "admin@yourstore.com", "admin", "valid" }, { "admin@yourstore.com", "admn", "invalid" },
				{ "admin@yourstore.com", "admn", "invalid" }, { "admin@yourstore.com", "admi", "invalid" }, };
		return Data;
	}

	@AfterClass
	void teraDown() {
		driver.close();
	}

}//C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\src\\snippet\\chromedriver.exe
