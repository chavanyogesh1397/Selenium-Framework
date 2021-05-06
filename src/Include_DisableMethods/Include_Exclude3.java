package Include_DisableMethods;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Include_Exclude3 
{
	@Test
	public void sample21()
	{
		Reporter.log("Sample1");
	}

	@Test
	public void sample22()
	{
		Reporter.log("Sample2");
	}
	
	@Test
	public void sample23()
	{
			Reporter.log("Sample3");
	}
	
	@Test
	public void sample24()
	{
			Reporter.log("Sample4");
	}
}
