package ToRun_FailTestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RunOnlyFailTestCases2 
{
	@Test
	public void sample31()
	{
		Reporter.log("Test31 Pass",true);
		
	}
	
	@Test
	public void sample32()
	{
		Reporter.log("Test32 Pass",true);
	}
	
	@Test
	public void sample33()
	{
		Reporter.log("Test33 Fail",true);
		
		
	}
	
	@Test
	public void sample44()
	{
		Reporter.log("Test34 Fail",true);
		
	}
	
	@Test
	public void sample55()
	{
		Reporter.log("Test35 Fail",true);
		
	}
}
