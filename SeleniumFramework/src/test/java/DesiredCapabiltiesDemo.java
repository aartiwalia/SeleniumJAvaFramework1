import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabiltiesDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability("browserName", "chrome");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aashish Walia\\eclipse-workspace\\SeleniumFramework\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(caps);
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automatiomn");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		

	}

}
