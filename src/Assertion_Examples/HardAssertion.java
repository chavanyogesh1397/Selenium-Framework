package Assertion_Examples;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssertion 
{
	@Test
	public void ExAssertEqual()
	{
		String s1="Hello";
		String s2 ="Hii";
		Assert.assertEquals(s1, s2);
		Reporter.log("Fail",true);
	}
	
	@Test
	public void ExAssertNotEqual()
	{
		String s3="Hello";
		String s4="Hii";
		Assert.assertNotEquals(s3, s4);
		Reporter.log("Pass",true);
	}
	
	@Test
	public void EXAssertFalse()
	{
		boolean s5= false;
		Assert.assertFalse(s5);
		Reporter.log("Pass",true);
	}
	
	@Test
	public void ExAssertTrue()
	{
		boolean s6=true;
		Assert.assertTrue(s6);
		Reporter.log("Pass",true);
	}
	
	@Test
	public void ExAssertNull()
	{
		String s7=null;
		Assert.assertNull(s7);
		Reporter.log("Pass",true);
	}
	
	@Test
	public void ExAssertNotNull()
	{
		String s8="ABC";
		Assert.assertNotNull(s8);
	}
	
	@Test
	public void ExAssertFail()
	{
		String s9="India";
		Reporter.log(s9,true);
		Assert.fail();
	}
	
}
