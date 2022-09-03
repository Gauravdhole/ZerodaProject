package snippet;

import java.io.File;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_141 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\src\\snippet\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(
				"https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=58075519359&hvpone=&hvptwo=&hvadid=486462777326&hvpos=&hvnetw=g&hvrand=4704534311096845303&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302118&hvtargid=kwd-64107830&hydadcr=14452_2154371&gclid=Cj0KCQjwlK-WBhDjARIsAO2sErTORWihu6fijZpAYc8B82nlQOLpsCVQM1uo6DFUcqXNXcY_b3dnEgcaAn_cEALw_wcB");

		WebElement TravelElement = driver.findElement(By.xpath("//div[@id='nav-xshop']/child::a[7]"));
		TravelElement.click();
		Thread.sleep(2000);

		WebElement TravelElement1 = driver.findElement(By.xpath("//div[@id='nav-xshop']/child::a[9]"));
		TravelElement1.click();
		Thread.sleep(2000);

		WebElement TravelElement11 = driver.findElement(By.xpath("//div[@id='nav-xshop']/child::a[5]"));
		TravelElement11.click();
		Thread.sleep(2000);

		WebElement TravelElement411 = driver.findElement(By.xpath("//div[@id='nav-xshop']/child::a/child::*[2]"));
		TravelElement411.click();
		Thread.sleep(2000);

		WebElement TravelElement511 = driver.findElement(By.xpath("//div[@id='nav-xshop']/child::a[4]"));
		TravelElement511.click();
		Thread.sleep(2000);

		WebElement TravelElement911 = driver.findElement(By.xpath("//div[@id='nav-xshop']/child::a[1]"));
		TravelElement911.click();
		Thread.sleep(2000);

		WebElement SearchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        SearchBox.sendKeys("camera");
		SearchBox.click();

		WebElement ClickButton = driver.findElement(By.xpath(" //input[@id='nav-search-submit-button']"));
		ClickButton.click();

		WebElement ScroDownn = driver.findElement(By.xpath(" //spam[@class ='a-size-medium a-color-base a-text-normal']"));
		ScroDownn.click();
		
		// File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//System.out.println(source);
	//	File destination =new File("C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\screenshot_all");
		//FileHandler.copy()
	//	driver.findElement(By.xpath("//a[@id='nav-global-location-popover-link']")).click();

		WebElement buyCamer = driver.findElement(By.xpath(" //div[@class='a-box-inner']"));
		buyCamer.click();

		WebElement buyCamera = driver.findElement(By.xpath(" //input[@id='buy-now-button']"));
		buyCamera.click();

	}

	
	}


