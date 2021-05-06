package Kite_Zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Homepage 
{
	String ExpUserId ="DV1510";
	@FindBy(xpath="//span[@class='user-id']") private WebElement userId;
	
	
	public Kite_Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Verify_UserId()
	{
		String ActUserid = userId.getText();
		if(ActUserid.equals(ExpUserId))
		{
			System.out.println(ActUserid + ": User Id Verify");
		}
		else
		{
			System.out.println(ActUserid +": User id not verified");
		}
	}
	
	
}
