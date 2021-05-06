package ToRun_FailTestCases;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RunOnlyFailTestCases1 
{
	@Test
	public void sample1()
	{
		Reporter.log("Test1 Pass",true);
	}
	
	@Test
	public void sample2()
	{
		Reporter.log("Test2 Pass",true);
		
	}
	
	@Test
	public void sample3()
	{
		Reporter.log("Test3 Fail",true);
		
	}
	
	@Test
	public void sample4()
	{
		Reporter.log("Test4 Fail",true);
		
	}
	
	@Test
	public void sample5()
	{
		Reporter.log("Test5 Pass",true);
	}
	
	
}
