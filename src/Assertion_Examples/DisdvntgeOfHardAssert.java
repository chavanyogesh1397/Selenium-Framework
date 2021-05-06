package Assertion_Examples;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DisdvntgeOfHardAssert 
{
	@Test
	public void MultipleVerifications()
	{
	
		String s3="Hello";
		String s4="Hii";
		Assert.assertNotEquals(s3, s4);
		Reporter.log("Pass",true);
		
		boolean s5= false;
		Assert.assertFalse(s5);
		Reporter.log("Pass",true);
		
		String s1="Hello";
		String s2 ="Hii";
		Assert.assertEquals(s1, s2);
		Reporter.log("Fail",true);
		
	}
	@Test
	public void SecondClass()
	{
		
		boolean s6=true;
		Assert.assertTrue(s6);
		Reporter.log("Pass",true);
		
		String s7=null;
		Assert.assertNull(s7);
		Reporter.log("Pass",true);
		
	}
	
	@Test
	public void Thirdclass()
	{
		String s8="ABC";
		Assert.assertNotNull(s8);
		
		String s9="India";
		Reporter.log(s9,true);
		Assert.fail();
	}
}
