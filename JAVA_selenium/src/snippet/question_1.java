package snippet;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class question_1 {
// 1)find the sing_up button from the registration from present in facebook application(child)
	public static void main(String[] args) {
// //div[@id='reg_form_box']/child::div[11]/button
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\src\\snippet\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.facebook.com/r.php?locale=en_GB&display=page");

		WebElement text = driver1.findElement(By.xpath("div[@id='reg_form_box']/child::div[11]/button"));
		System.out.println(text);

		// 2)locate firstname field from singup button in facebook(prents)

		// //div[@class='_1lch']/parent::*/parent::*/child::div[1]/div[1]

		// 3) identify the password from moblie number filed in facebook(following)
		//// input[@id='u_0_g_/b']/following::input

		// 4)locate moblie number from newpassword field facebook( precrding)
		//// input[@id='password_step_input']/preceding::input[2]

		// locate surname frome female radio button in facebook[]
		//// input[@id='u_0_4_rq']/ancestor::div[2]/div[1]/div[1]/div[2]

		// identify the search text box from the google seach button present in the
		// google search home
         //div[@class='FPdoLc lJ9FBc']//input[@name='btnK']/parent::*/parent::*/parent::*/div/div[1]
		
		
		//
	}
}
