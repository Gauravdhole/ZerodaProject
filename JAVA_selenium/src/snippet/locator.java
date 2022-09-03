package snippet;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.w3c.dom.Text;

import io.netty.channel.ChannelId;
import net.bytebuddy.dynamic.loading.ByteArrayClassLoader.ChildFirst;

public class locator {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gaura\\eclipse-workspace\\JAVA_selenium\\src\\snippet\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://money.rediff.com/gainers/bse/daily/groupa");

		driver1.manage().window().maximize();
		// self--- selected the current node

		String text = driver1.findElement(By.xpath("//a[normalize-space()='Dalmia Bharat L']/self::a")).getText();
		System.out.println(text);// Dalmia Bharat L

		// parent-- selected the parent of the current node( always one )

		String Text = driver1.findElement(By.xpath("//a[normalize-space()='ABB India']/parent::td")).getText();
		System.out.println(Text);// ABB India
		// child-- selected the child of the current node( one or many )
		List<WebElement> chids = driver1
				.findElements(By.xpath("//a[normalize-space()='ABB India']/ancestor::tr/child::td"));
		System.out.println("number of child element:: " + chids.size());

		// ancestor--- selected all ancestor ( parent, grandprant ,.etc )

		String TeSt = driver1.findElement(By.xpath(" //a[normalize-space()='Jyothy Labs']/ancestor::tr")).getText();
		System.out.println(TeSt);

		// descendant -- selected all decendent ( children , grandchildre etc ) of the
		// current node

		List<WebElement> descendant = driver1
				.findElements(By.xpath(" //a[normalize-space()='Jyothy Labs']//ancestor ::tr /descendant::*"));

		System.out.println("number of descendant nodes ::" + descendant.size());

		// following
		List<WebElement> followingNode = driver1
				.findElements(By.xpath(" //a[normalize-space()='Jyothy Labs']/ancestor::tr/following ::*"));
		System.out.println("number of folloing node ::" + followingNode.size());

		// following_sibling
		List<WebElement> following_sibling = driver1
				.findElements(By.xpath(" //a[normalize-space()='Jyothy Labs']/ancestor::tr/following-sibling::tr"));
		System.out.println("number of following_sibling" + following_sibling.size());

		// preceding
		List<WebElement> preceding = driver1
				.findElements(By.xpath(" //a[normalize-space()='Jyothy Labs']/ancestor::tr/preceding::*"));
		System.out.println("number of preceding :: " + preceding.size());
		// preceding_sibling
		List<WebElement> preceding_sibling = driver1
				.findElements(By.xpath(" //a[normalize-space()='Jyothy Labs']/ancestor::tr/preceding-sibling::tr"));
		System.out.println("number of preceding_sibling  :::" + preceding_sibling.size());
		driver1.close();

	}

}
