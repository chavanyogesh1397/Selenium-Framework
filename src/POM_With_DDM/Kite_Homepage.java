package POM_With_DDM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Homepage 
{
	@FindBy(xpath="//span[@class='user-id']") private WebElement UserId;
	@FindBy(xpath = "//h4[@class='username']")  private WebElement Username;
	@FindBy(xpath = "//a[contains(text(),'Logout')]") private WebElement LogoutBtn;
	public Kite_Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyUserId(String ExcUserID)
	{
		String ActUserID = UserId.getText();
		if(ActUserID.equals(ExcUserID))
		{
			System.out.println(ExcUserID + ": User id verified");
		}
		else
		{
			System.out.println(ExcUserID +": User id not verified");
		}
	}
	
	public void clickUserId()
	{
		UserId.click();
	}
	
	public void verifName(String UserName)
	{
		String usrnme = Username.getText();
		
		if(usrnme.equals(UserName))
		{
			System.out.println(usrnme +": Username Verify");
		}
		else
		{
			System.out.println(usrnme +": Username not Verify");
		}
	}
	
	public void clickLogoutBtn()
	{
		LogoutBtn.click();
	}
	
}
