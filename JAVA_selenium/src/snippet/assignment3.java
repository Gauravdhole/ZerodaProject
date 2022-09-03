package snippet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\src\\snippet\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]/input")).click();
		String getText = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();

		WebElement DropDown = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(DropDown);
		s.selectByVisibleText(getText);
		driver.findElement(By.name("enter-name")).sendKeys(getText);
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		String textString = driver.switchTo().alert().getText();
		if (textString.contains(getText)) {
			System.out.println("alert messages is sucessful");
		} else {
			System.out.println("somethig is wrong is hapen");
		}

	}
}
