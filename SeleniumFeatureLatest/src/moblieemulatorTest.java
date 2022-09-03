import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v95.emulation.Emulation;


public class moblieemulatorTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gaura\\eclipse-workspace\\SeleniumFeatureLatest\\chromedriver.exe");
	 ChromeDriver	 driver = new ChromeDriver();
	
	    DevTools devTools = driver.getDevTools();
	    
	    
	    devTools.createSession();
	    
	    //send coomand to cdp method ->cdp method will invoked and get access to chrome dev tools
	    
	    devTools.send(Emulation.setDeviceMetricsOverride(600, 1000, 50, true, null, null, null, null, null, null, null, null, java.util.Optional.empty()));
	    driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458755421&hvpos=&hvnetw=g&hvrand=1188077918549233272&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302118&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=Cj0KCQjw3eeXBhD7ARIsAHjssr8faEoJ7mmE1tdrwwwAuO1qPE6t1_nJQt3JBkGe4nfvF4ByAFl6vXkaAnKsEALw_wcB");
	    driver.findElement(By.xpath(" //span[@class='hm-icon-label']")).click();
	    
	    Thread.sleep(3000);
	    
	    
	    
	} 
	
}  		//width height deviceScaleFactor mobile scale screenWidth screenHeight positionX positionY dontSetVisibleSize screenOrientation viewport displayFeature 