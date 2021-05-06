package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNG_Annotations 
{
	
	@BeforeClass
	public void  openBrowser()
	{
		Reporter.log("--Opening Browser--", true);
	}
	
	@BeforeMethod
	public void LoginApp()
	{
		Reporter.log("Login successfully",true);
	}
	@Test
	public void EnterPIN()
	{
		Reporter.log("Enter PIN",true);
	}
	@AfterMethod
	public void LogoutApp()
	{
		Reporter.log("Logout Successfully");
	}
	@AfterClass
	public void  closeBrowser()
	{
		Reporter.log("--Closing Browser--", true);
	}
}
