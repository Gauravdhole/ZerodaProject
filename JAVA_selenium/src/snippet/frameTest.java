package snippet;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class frameTest {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\src\\snippet\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		//driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver1.get("https://jqueryui.com/droppable/");
	//	driver1.switchTo().frame(0); 
	//	driver1.switchTo().frame(null);// string id
		driver1.switchTo().frame(driver1.findElement(By.xpath(" //iframe[@class='demo-frame']")));//web element frame element
		driver1.findElement(By.id("draggable")).click();
		 Actions abc =new Actions(driver1);
		 
		 WebElement source = driver1.findElement(By.xpath("//div[@id='draggable'] "));
		 WebElement target = driver1.findElement(By.xpath("  //div[@id='droppable']"));
		 
		abc.dragAndDrop(source, target).build().perform();
     driver1.switchTo().defaultContent();
	}

}
