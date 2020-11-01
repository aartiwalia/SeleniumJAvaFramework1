package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
	WebDriver driver=null; //storing as null saves memory, we can do without null also
	By textbox_search= By.name("q");
	By search_button=By.name("q");
	public GoogleSearchPageObjects(WebDriver driver) // created constructor as without it Webdriver instance will not be used,whereevr object of this class would be called, it will refer this constructor
	{
		this.driver=driver;
		
	}
	
	public void settext_textbox(String text) //for entering text in search box
	{
		driver.findElement(textbox_search).sendKeys(text);
	}
	public void search() //for search_button action
	{
		driver.findElement(search_button).sendKeys(Keys.RETURN);
	}

}
