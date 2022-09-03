package snippet;

import java.awt.Desktop.Action;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ACTIONClassdemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\src\\snippet\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Actions  a = new Actions(driver);
		WebElement move =driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		a.moveToElement(move).contextClick().build().perform();
		Thread.sleep(5000);
//		Move to  specific element
		//a[@class ='nav-a nav-a-2   nav-progressive-attribute']//span[@class='nav-icon nav-arrow']//
		WebElement move1 =   driver.findElement(By.xpath(" //input[@id='twotabsearchtextbox']"));
		a.moveToElement(move1).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		Thread.sleep(5000);
		
		
//	  WebElement   ScrowDown  =  driver.findElement(By.xpath("//a[@class ='nav-a nav-a-2   nav-progressive-attribute']//span[@class='nav-icon nav-arrow']"));
//	  ScrowDown.click();
		
		
	}
}
