package Kite_testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_PIN_VerifyPage 
{
	@FindBy(xpath="//input[@type='password']") private WebElement EnterPIN;
	@FindBy(xpath="//button[@type=\"submit\"]") private WebElement ContinueBtn;
	@FindBy(xpath="//a[contains(text(),'Forgot')]") private WebElement ForgotPIN;
	
	
	public Kite_PIN_VerifyPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	


	public void setPin(String pin)
	{
		EnterPIN.sendKeys(pin);
	}
	
	public void ClickContinueBtn()
	{
		ContinueBtn.click();
	}
	
	public void clickForgotPin()
	{
		ForgotPIN.click();
	}
}
