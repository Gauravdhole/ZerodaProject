package snippet;

import java.sql.DriverAction;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomatAllElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\src\\snippet\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");

		WebElement dayDropdown = driver.findElement(By.xpath("//select[@name='date_day']"));
		Thread.sleep(20);
		Select s = new Select(dayDropdown);
		s.selectByIndex(10);
		Thread.sleep(200);
		s.selectByValue("13");
		Thread.sleep(20);
		s.selectByVisibleText("11");

		WebElement monthDropDown = driver.findElement(By.xpath(" //select[@id='date_mon']"));
		Thread.sleep(200);
		Select f = new Select(monthDropDown);
		Thread.sleep(200);
		f.selectByIndex(9);
		Thread.sleep(200);
		s.selectByIndex(010);
		Thread.sleep(200);
		f.selectByVisibleText("DEC");

		WebElement YearDropDown = driver.findElement(By.xpath(" //select[@name='Date_Year']"));
		Select Y = new Select(YearDropDown);
		Y.selectByValue("1996");
		Thread.sleep(200);
		Y.selectByVisibleText("1995");
		Thread.sleep(200);
		System.out.println("--------------------------------------------------------------------");
		List<WebElement> objecTlink = driver.findElements(By.tagName("a"));
		for (WebElement obCurrentLink : objecTlink) {
			String stringtextString = obCurrentLink.getText();
			System.out.println(stringtextString);

		}

		System.out.println("*********************************************************************");
		List<WebElement> objecTlink1 = driver.findElements(By.className("col1"));
		for (WebElement obCurrentLink : objecTlink1) {
			String stringtextString = obCurrentLink.getText();
			System.out.println(stringtextString);

		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		List<WebElement> objList = driver.findElements(By.tagName("a"));

		System.out.println(objList.size());
		System.out.println("***************************");

		driver.findElements(By.tagName("col1"));
		List<WebElement> OtherobjList = driver.findElements(By.className("col1"));
		System.out.println(OtherobjList.size());

		
	     WebElement YourFullname = driver.findElement(By.id("fullname"));
	     YourFullname .sendKeys("Gaurav Dhole");
		
	     WebElement YourcurrentemailID =driver.findElement(By.id("emailid"));
	     YourcurrentemailID.sendKeys("gauravdhole2016@gmail.com");
	     
	     WebElement Newpassword = driver.findElement(By.xpath("//input[@id='pass']"));
	     Newpassword.sendKeys("654865");
	     
	     WebElement Retypepassword =driver.findElement(By.xpath("//input[@id='repass']"));
	     Retypepassword.sendKeys("654865");
	     
	     WebElement gender = driver.findElement(By.xpath("//input[@id='sex']"));
	     gender.click();
	     
	     WebElement Location = driver.findElement(By.xpath(" //input[@id='signup_city']"));
	     Location .sendKeys("NAGPUR");
	     
	     WebElement School=driver.findElement(By.xpath("//input[@id='school']"));
	     School.sendKeys("saraswat central public school");
        
	     WebElement collage = driver.findElement(By.xpath("//input[@id='college']"))	;
	     collage.sendKeys("dharampeth science college");
	     
	     driver.close();
	}

}
