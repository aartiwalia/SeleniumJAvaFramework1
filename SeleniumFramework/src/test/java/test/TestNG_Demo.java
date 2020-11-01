package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.ProeprtiesFile;

public class TestNG_Demo {
WebDriver driver=null;
static String path1=System.getProperty("user.dir");
public static String browserName=null;
//we dont need main method here as we are using testng annotations
@BeforeTest
	public void setupTest() throws IOException
	{ProeprtiesFile.getProperties();
	
	if(browserName.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", path1+ "\\Drivers\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(browserName.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", path1 +"\\Drivers\\gickodriver\\geckodriver.exe");
		driver=new FirefoxDriver();

	}

	}
@Test
	public void googleSearch()
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aashish Walia\\eclipse-workspace\\SeleniumFramework\\Drivers\\chromedriver\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN); // try this as by. name("butnK") didnt work for me
		
			}
@AfterTest	
public void tearDown()
	{
		driver.close();
		System.out.println("Test successfully run");

	}

}
