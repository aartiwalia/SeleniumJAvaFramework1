package demo;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {
	//@Test(dependsOnMethods = {"test2"},priority=1) //priority takes second preference here
	@Test(dependsOnGroups = {"sanity1"})
	public void test1()
	{
		System.out.println("I am inside test 1");
	}
	@Test(groups={"sanity1"})
	public void test2()
	{
		System.out.println("I am inside test 2");
	}
	

}
