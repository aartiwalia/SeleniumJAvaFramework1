package listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listeners.TestNGListeners.class) //if we have to use multiple listener classes, we can use {,} format
//as we added listener tag in .xml file we can remove above tag
public class TestNGListenerDemo{
	@Test
	public void test1()
	{
		System.out.println("I am inside test1");
	}
	@Test
	public void test2()
	{
		System.out.println("I am inside test2");
	}
	@Test
	public void test3()
	{
		System.out.println("I am inside test3");
	}

}
