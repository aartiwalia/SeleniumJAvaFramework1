import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
public static void main(String[] args) {
	String path=System.getProperty("user.dir");
	//System.setProperty("webdriver.gecko.driver", path + "\\Drivers\\gickodriver\\geckodriver.exe");
	//WebDriver driver=new FirefoxDriver();
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aashish Walia\\eclipse-workspace\\SeleniumFramework\\Drivers\\chromedriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.selenium.dev/");
	driver.findElement(By.xpath("//input[@id='gsc-i-id1']")).sendKeys("Webdriver");
	
	//driver.close();
	
}
}
