package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_dependsOnMethods 
{
	@Test
	public void Login1()
	{
		Reporter.log("Login successful",true);
	}
	@Test(timeOut = 5000)
	public void Login2() throws InterruptedException
	{
		Thread.sleep(8000);
		Reporter.log("Pin Entered",true);
	}
	@Test(dependsOnMethods={"Login1","Login2"})
	public void Homepage()
	{
		Reporter.log("Homepage open",true);
	}
	@Test
	public void Logout()
	{
		Reporter.log("logout successfully");
	}
	@Test(timeOut = 5000)
	public void Test20() throws InterruptedException
	{
		Thread.sleep(8000);
		Reporter.log("Running Test 20",true);
		
	}
	@Test
	public void Test30()
	{
		Reporter.log("Running Test 30",true);
	}
}
