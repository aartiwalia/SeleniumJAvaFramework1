package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	private static WebElement element=null; //elemnt object will be used by every function of this class only.
	public static WebElement textbox_search(WebDriver driver)
	{
		element=driver.findElement(By.name("q"));
		return element;
	}
	public static WebElement search_button(WebDriver driver)
	{
		element=driver.findElement(By.name("q"));
		return element;
	}

}
