package Kite_testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page 
{
	@FindBy(xpath ="//input[@type='text']") private WebElement Username;
	@FindBy(xpath="//input[@type='password']") private WebElement Password;
	@FindBy(xpath="//button[@type='submit']") private WebElement LoginButtton;
	@FindBy(xpath="//a[text()='Forgot password?']") WebElement ForgotPass;
	
	public Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String Uname)
	{
		Username.sendKeys(Uname);
	}
	
	public void setPassword(String pass)
	{
		Password.sendKeys(pass);
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
