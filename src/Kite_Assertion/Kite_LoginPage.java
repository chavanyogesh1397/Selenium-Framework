package Kite_Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_LoginPage 
{
	@FindBy(xpath="//input[@id='userid']") private WebElement Username;
	@FindBy(xpath = "//input[@id='password']") private WebElement Password ;
	@FindBy(xpath = "//button[@type='submit']") private WebElement SubmitBtn ;
	@FindBy(xpath="//a[text()='Forgot password?']") private WebElement ForgotPass;
	
	public Kite_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String userid)
	{
		Username.sendKeys(userid);
	}
	
	public void setPassword(String password2)
	{
		Password.sendKeys(password2);
	}
	
	public void clickSubmitBtn()
	{
		SubmitBtn.click();
	}
	
	public void clickForgotPass()
	{
		ForgotPass.sendKeys();
	}
}
