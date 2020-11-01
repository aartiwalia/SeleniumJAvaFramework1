package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowserDemo {
	WebDriver driver=null;
	String path=System.getProperty("user.dir");
	@BeforeTest
	@Parameters({"browserName"})
	public void setUp(String browserName)
	{
		System.out.println("Browser name is" + browserName);
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aashish Walia\\eclipse-workspace\\SeleniumFramework\\Drivers\\chromedriver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", path + "\\Drivers\\gickodriver\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
	}
	@Test
	public void test1() throws InterruptedException
	{
		driver.get("https://google.com");
		Thread.sleep(4000);
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
		System.out.println("Test completed succesfully");
	}
	
	

}
