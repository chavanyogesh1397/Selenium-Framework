package Kite_Zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_LoginPage 
{
	@FindBy(xpath ="//input[@type='text']") private WebElement Username;
	@FindBy(xpath="//input[@type='password']") private WebElement Password;
	@FindBy(xpath="//button[@type='submit']") private WebElement LoginButtton;
	@FindBy(xpath="//a[text()='Forgot password?']") WebElement ForgotPass;
	
	public Kite_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername()
	{
		Username.sendKeys("DV1510");
	}
	
	public void setPassword()
	{
		Password.sendKeys("Vijay@123");
	}
	
	public void clickLoginbtn()
	{
		LoginButtton.click();
	}
	
	public void clickFogotPass()
	{
		ForgotPass.click();
	}
	
	public void clickForgotPass()
	{
		ForgotPass.click();
	}
	
}
