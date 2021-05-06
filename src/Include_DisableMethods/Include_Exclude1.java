package Include_DisableMethods;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Include_Exclude1 
{
	@Test
	public void sample1()
	{
		Reporter.log("Sample1");
	}

	@Test
	public void sample2()
	{
		Reporter.log("Sample2");
	}
	
	@Test
	public void sample3()
	{
			Reporter.log("Sample3");
	}
	
	@Test
	public void sample4()
	{
			Reporter.log("Sample4");
	}
}
