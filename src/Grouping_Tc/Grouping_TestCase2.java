package Grouping_Tc;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping_TestCase2 
{
	@Test(groups = {"Intraday"})
	public void intradaySell()
	{
		Reporter.log("Method 1",true);
	}
	
	@Test(groups= {"Intraday"})
	public void intradayBuy()
	{
		Reporter.log("method 2",true);
	}
	
	@Test(groups = {"Homepage"})
	public void Dashboard()
	{
		Reporter.log("method 3", true);
	}
	
	@Test(groups= {"Homepage"})
	public void Orders()
	{
		Reporter.log("method4",true);
	}
	
	@Test(groups = {"Intraday"})
	public void IntradayFirstBuy()
	{
		Reporter.log("method5",true);
	}
	
	@Test(groups= {"Homepage"})
	public void positions()
	{
		Reporter.log("method4",true);
	}
	
	@Test(groups = {"Intraday"})
	public void IntradayFirstSell()
	{
		Reporter.log("method5",true);
	}
}
