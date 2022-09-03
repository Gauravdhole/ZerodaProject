package snippet;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.browser.model.Bucket;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class first1 {

	WebDriver driver;

	@BeforeClass

	public void setup() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\src\\snippet\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://admin-demo.nopcommerce.com");

	}

	@Test(dataProvider = "loginData")
	public void login(String user, String pwd, String Exp) {
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		WebElement TestEmail = driver.findElement(By.xpath("Email"));
		TestEmail.clear();
		TestEmail.sendKeys(user);

		WebElement TestPasWord = driver.findElement(By.id("Password"));
		TestPasWord.clear();
		TestPasWord.sendKeys(pwd);

		driver.findElement(By.xpath(" //button[@type='submit']")).click();

		String exp_titel = "dashBoad/nonCommerces adminstration";
		String act_titel = driver.getTitle();

		if (Exp.equals("vaild")) {
			if (exp_titel.equals(act_titel)) {
				driver.findElement(By.linkText("Logout")).click();
				Assert.assertTrue(true);
			} else {
				Assert.assertTrue(false);
			}
		} else if (Exp.equals("Invalid")) {
			if (exp_titel.equals(act_titel)) {

			} else {

			}
		}

	}

	@DataProvider(name = "loginData")
	public String[][] getDate() {
		// always reture two dimemsion array

		String loginData[][] = {

				{ "admin@yourstire.com", "admin", "valid" }, { "admin@yourstire.com", "admi", "Invalid" },
				{ "admi@yourstire.com", "admin", "Invalid" }, { "admi@yourstire.com", "admi", "Invalid" }, };
		return loginData;

	}

	@AfterClass
	void tearData() {
		driver.close();
	}

}
