package Grouping_Tc;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping_TestCase 
{
	@Test(groups = {"login"})
	public void method1()
	{
		Reporter.log("Method 1",true);
	}
	
	@Test(groups= {"login"})
	public void method2()
	{
		Reporter.log("method 2",true);
	}
	
	@Test(groups = {"Homepage"})
	public void method3()
	{
		Reporter.log("method 3", true);
	}
	
	@Test(groups= {"Homepage"})
	public void method4()
	{
		Reporter.log("method4",true);
	}
	
	@Test(groups = {"logout"})
	public void method5()
	{
		Reporter.log("method5",true);
	}
	
}
