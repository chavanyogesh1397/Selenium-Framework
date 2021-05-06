package POM_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_LoginPage 
{
	//
	
	//Step 1: Find Element and Store in Global variable;
	@FindBy(xpath="//input[@id='userid']") private WebElement UN;
	@FindBy(xpath = "//input[@id='password']") private WebElement pw;
	@FindBy(xpath = "//button[text()='Login ']") WebElement Loginbutton;
	
	//Step2: Initialize global variables and in constructor
	public Kite_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Step3: Enter Values in Elements
	public void EnterUn()
	{
		UN.sendKeys("DV1510");
	}
	public void EnterPwd()
	{
		pw.sendKeys("Vijay@123");
	}
	public void LoginButton()
	{
		Loginbutton.click();
	}
	
	
}
