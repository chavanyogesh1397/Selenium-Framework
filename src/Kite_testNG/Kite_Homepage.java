package Kite_testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Homepage 
{

	@FindBy(xpath="//span[@class='user-id']") private WebElement userId;
	
	
	public Kite_Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Verify_UserId(String ExpUserId)
	{
		String posresult = "User verify";
		String Negativeresult = "User not verify";
		String ActUserid = userId.getText();
		if(ActUserid.equals(ExpUserId))
		{
			System.out.println(ActUserid + posresult);
		}
		else
		{
			System.out.println(ActUserid + Negativeresult);
		}
	}
	
	public void clickuserId()
	{
		userId.click();
	}
	
	
}
