package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNG_Priority 
{
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("Opening browser",true);
		Reporter.log("Login successfully",true);
	}
	
	@Test(priority=0)
	public void EnterPIN()
	{
		Reporter.log("Enter pin",true);
	}
	@Test(priority=1)
	public void Clickcarerr()
	{
		Reporter.log("clicking on home",true);
	}
	@Test(priority=2)
	public void ClickAbout()
	{
		Reporter.log("clicking on About",true);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("logout successfully",true);
		Reporter.log("Closing Browser", true);
	}
}
