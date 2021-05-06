package Kite_By_Stock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_PinPage 
{
	@FindBy(xpath = "//input[@id='pin']") private WebElement pin;
	@FindBy(xpath = "//button[@type='submit']") private WebElement SubmitBtn;
	@FindBy(xpath = "//a[text()='Forgot 2FA?']") private WebElement ForgotPin;
	
	public Login_PinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setpin(String Password)
	{
		pin.sendKeys(Password);
	}
	
	public void clickSubmitBtn()
	{
		SubmitBtn.click();
	}
	
	public void clickForgotPin()
	{
		ForgotPin.click();
	}
	
	
}
