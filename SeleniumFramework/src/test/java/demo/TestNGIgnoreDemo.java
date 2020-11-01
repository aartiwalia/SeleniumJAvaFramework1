package demo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore   //at class level
public class TestNGIgnoreDemo {
	@Test
	public void test1()
	{
		System.out.println("I am in test1");
	}
	@Ignore //can be written above or below Test annotation
	@Test
	public void test2()
	{
		System.out.println("I am in test2");
	}
	}
