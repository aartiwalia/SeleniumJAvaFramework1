package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;
public class GoogleSearchTest {
	static WebDriver driver=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		googleSearch();

	}
	public static void googleSearch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aashish Walia\\eclipse-workspace\\SeleniumFramework\\Drivers\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://google.com");
		//driver.findElement(By.name("q")).sendKeys("Automation step by step");
		// for POM reference, we will use below command
		
		//driver.findElement(By.name("q")).sendKeys(Keys.RETURN); // try this as by. name("butnK") didnt work for me
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step");
		GoogleSearchPage.search_button(driver).sendKeys(Keys.RETURN);
		driver.close();
		System.out.println("Test successfully run");
	}

}
