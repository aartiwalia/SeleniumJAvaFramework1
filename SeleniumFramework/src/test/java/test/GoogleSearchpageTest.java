package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchpageTest {
	static WebDriver driver=null;
	public static void main(String[] args) {
		
		googleSearchTest();
	}
	public static void googleSearchTest()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aashish Walia\\eclipse-workspace\\SeleniumFramework\\Drivers\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		

		GoogleSearchPageObjects googleobj=new GoogleSearchPageObjects(driver); //created object of constructor class to refer its driver instance
		driver.get("https://google.com");
		googleobj.settext_textbox("Automation");
		googleobj.search();
		driver.close();
		System.out.println("Test run succesfully");
	}

}
