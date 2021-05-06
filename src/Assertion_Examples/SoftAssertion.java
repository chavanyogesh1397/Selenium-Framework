package Assertion_Examples;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion 
{
	@Test
	public void Sample1()
	{

		String s3="Hello";
		String s4="Hii";
		SoftAssert soft = new SoftAssert();
		soft.assertNotEquals(s3, s4);
		Reporter.log("Pass",true);
		
		
		String s1="Hello";
		String s2 ="Hii";
		soft.assertEquals(s1, s2);
		Reporter.log("Fail",true);
		
		
		boolean s5= false;
		soft.assertFalse(s5);
		Reporter.log("Pass",true);
		soft.assertAll();
	}
	
	@Test
	public void Sample2()
	{	
		String s8="ABC";
		Assert.assertNotNull(s8);
	}
}
