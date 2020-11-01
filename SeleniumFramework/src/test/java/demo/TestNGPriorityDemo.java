package demo;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {
	@Test(priority = 1)
	public void test1()
	{
		System.out.println("I am inside test1");
	}
	@Test(priority=3)  //when 2 emthods have same priority, it checks for alphabetical order
	public void test2()
	{
		System.out.println("I am in test2");
	}
	@Test(priority = 2)
	public void test3()
	{
		System.out.println("I am in test 3");
	}
	

}
