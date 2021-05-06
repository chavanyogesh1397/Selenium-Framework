package ToRun_FailTestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToRun_FailTestCases3 
{
	@Test
	public void sample20()
	{
		Reporter.log("Test21 Pass",true);
	}
	
	@Test
	public void sample21()
	{
		Reporter.log("Test22 Pass",true);
	}
	
	@Test
	public void sample22()
	{
		Reporter.log("Test22 Fail",true);
		
	}
	
	@Test
	public void sample23()
	{
		Reporter.log("Tes23 Fail",true);
		
	}
	
	@Test
	public void sample24()
	{
		Reporter.log("Tes24 Fail",true);
		
	}
}

