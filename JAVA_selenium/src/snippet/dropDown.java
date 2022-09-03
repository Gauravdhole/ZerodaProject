package snippet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\src\\snippet\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://register.rediff.com/register/register.php");
		driver.manage().window().maximize();
		
		
		
		WebElement dayDropdown = driver.findElement(By.tagName("select"));
		Thread.sleep(2000);
		Select d = new Select(dayDropdown);
		Thread.sleep(2000);
		d.selectByIndex(05);
		Thread.sleep(2000);
		d.selectByValue("05");
		d.selectByVisibleText("09");

		WebElement MonthDropDown = driver.findElement(By.xpath(" //select[@name='DOB_Month03227dc0']"));
		Select f = new Select(MonthDropDown);
		f.selectByVisibleText("APR");
		Thread.sleep(2000);
		f.selectByIndex(0);

		WebElement YearDropDown = driver.findElement(By.xpath("//option[@value='2022']"));
		Select Y = new Select(YearDropDown);
		Y.selectByIndex(1);
		Y.selectByVisibleText("1995");
		Thread.sleep(2000);
		Y.selectByValue("1996");

//   	driver1.findElement(By.xpath("  //input[@name='name03227dc0']")).sendKeys("gaurav");
//		
//		driver1.findElement(By.xpath("//input[@name='login03227dc0']")).sendKeys("gauravdhole");
//		
//		driver1.findElement(By.xpath("//td[normalize-space()='Password']")).sendKeys("9578631");
//		
//		driver1.findElement(By.xpath("//td[normalize-space()='Password']")).sendKeys("9578631");
//		
//		driver1.findElement(By.xpath(" //td[normalize-space()='Alternate Email Address']")).sendKeys("gauravdhole138@gmail.com");
//		
//		driver1.findElement(By.xpath("//td[@id='mob_txt']")).sendKeys("9503183279");
//		
//		driver1.findElement(By.xpath(" //input[@value='m']")).click();
//		

//		List<WebElement>  objecTlink  =driver1.findElements(By.tagName("td"));
//		for (WebElement obkCurrentLink : objecTlink)
//		
//		
//		{
//				String stringtextString = obkCurrentLink .getText();
//			System.out.println(stringtextString);
//		}
	}

	private static void selectByVisibleText(String string) {
		// TODO Auto-generated method stub

	}
}
