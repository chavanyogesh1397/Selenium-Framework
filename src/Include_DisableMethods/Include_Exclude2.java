package Include_DisableMethods;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Include_Exclude2 
{
	@Test
	public void sample11()
	{
		Reporter.log("Sample1");
	}

	@Test
	public void sample12()
	{
		Reporter.log("Sample2");
	}
	
	@Test
	public void sample13()
	{
			Reporter.log("Sample3");
	}
	
	@Test
	public void sample14()
	{
			Reporter.log("Sample4");
	}
}
