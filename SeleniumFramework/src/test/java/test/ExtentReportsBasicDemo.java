package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class ExtentReportsBasicDemo {
	static WebDriver driver=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentHtmlReporter htmlreporter=new ExtentHtmlReporter("extentreport.html");
		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test = extent.createTest("googlesearch test", "This is a test to validate google search");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aashish Walia\\eclipse-workspace\\SeleniumFramework\\Drivers\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		test.log(Status.INFO, "starting testcase");
		driver.get("https://google.com");
		test.pass("Navigated succesfully");
		driver.findElement(By.name("q")).sendKeys("Automatiomn");
		test.pass("Entered text");
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		test.pass("Pressed keyboard");
		driver.close();
		test.pass("Closed the browser");
		test.info("Test Completed");
		extent.flush(); // to add everything in report
		


	}

}
