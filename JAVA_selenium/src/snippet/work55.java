package snippet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class work55 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\src\\snippet\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://is.rediff.com/signup/register");
		WebElement dayDropDownBox = driver.findElement(By.xpath("//select[@id='date_day']"));
		Thread.sleep(2000);

		Select s = new Select(dayDropDownBox);
		Thread.sleep(2000);
		s.selectByVisibleText("15");
		
		
		WebElement monthDropDownBox1 = driver.findElement(By.xpath("//select[@name='date_mon']"));
		Thread.sleep(2000);

		Select s1 = new Select( monthDropDownBox1);
		Thread.sleep(2000);
		s1.selectByVisibleText("JAN");
		
		
		WebElement yEARDropDownBox1 = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		Thread.sleep(2000);

		Select s15 = new Select( yEARDropDownBox1);
		Thread.sleep(2000);
		s15.selectByVisibleText("1996");

	}
}
