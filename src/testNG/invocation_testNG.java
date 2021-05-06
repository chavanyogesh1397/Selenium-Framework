package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class invocation_testNG 
{
	@BeforeClass
	public void OpenBrowser()
	{
		Reporter.log("Browser open successfully",true);
	}
	@BeforeMethod
	public void Login()
	{
		Reporter.log("Login attempt",true);
	}
	@Test(invocationCount=2)
	public void EnterPin()
	{
		Reporter.log("Enter Pin",true);
	}
	@Test(enabled=false)
	public void Home()
	{
		Reporter.log("Enter Home",true);
	}
	@AfterMethod
	public void Logout()
	{
		Reporter.log("logout attempt",true);
	}
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("Browser closing",true);
	}
	
}
