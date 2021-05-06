package Creating_Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage 
{
	@FindBy(xpath = "//input[@id='userid']") private WebElement UserId;
	@FindBy(xpath = "//input[@id='password']") private WebElement Password;
	@FindBy(xpath="//button[@type='submit']") private WebElement LoginBtn;
	
	public KiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setUserId(String uId)
	{
		UserId.sendKeys(uId);
	}
	
	public void setPassword(String pass)
	{
		Password.sendKeys(pass);
	}
	
	public void ClickLoginBtn()
	{
		LoginBtn.click();
	}
}
