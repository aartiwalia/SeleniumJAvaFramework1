package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class ExtentReportsTestNGDemo {
	static WebDriver driver=null;
	ExtentHtmlReporter htmlreporter;
	ExtentReports extent;
	
	@BeforeSuite
	public void setUp()
	{
		htmlreporter=new ExtentHtmlReporter("extentreport.html");
		// create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		// creates a toggle for the given test, adds all log events under it    


	}
	@BeforeTest
	public void setUpTest()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aashish Walia\\eclipse-workspace\\SeleniumFramework\\Drivers\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	@Test
	public void test1()
	{
		ExtentTest test = extent.createTest("googlesearch test", "This is a test to validate google search");
		driver.get("https://google.com");
		test.pass("Navigated succesfully");
		driver.findElement(By.name("q")).sendKeys("Automatiomn");
		test.pass("Entered text");

		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		test.pass("Pressed keyboard");
		test.info("Test Completed");
		test.pass("Closed the browser");

	}
	@AfterTest
	public void tearDownTest()
	{
		driver.close();
	}
	@AfterSuite //will run once in case of multiple test cases
	public void tearDown()
	{
		extent.flush(); // to add everything in report

	}







}
