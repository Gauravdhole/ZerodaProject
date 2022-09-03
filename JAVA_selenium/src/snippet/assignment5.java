package snippet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\src\\snippet\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	//WebElement text	 =driver.findElement(By.xpath("//tr[@class='odd']/td[5]"));
		//System.out.println(text.getText());
		//driver.findElement(By.id("ohrmList_chkSelectRecord_39")).click();
	   // driver.findElement(By.id("ohrmList_chkSelectAll")) .click();
		  List<WebElement>  TagName = driver.findElements(By.xpath("//tr[@class='odd']"));
		  

		  for (WebElement obCurrentLink : TagName ) {
				String stringtextString = obCurrentLink.getText();
				System.out.println(stringtextString);
	
		  }
	}
}
		
		
		
		
		
		
		
		
		
		
		
	

