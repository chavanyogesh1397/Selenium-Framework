package Kite_Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class Kite_Homepage 
{
	
	@FindBy(xpath="//span[@class='user-id']") private WebElement UserId;
	@FindBy(xpath = "//h4[@class='username']")  private WebElement Username;
	@FindBy(xpath = "//a[contains(text(),'Logout')]") private WebElement LogoutBtn;
	@FindBy(xpath = "//input[@id='search-input']") private WebElement SearchBox;
	
	
	public Kite_Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyUserId(String ExcUserID, SoftAssert soft)
	{
		String ActUserID = UserId.getText();
		
		soft.assertEquals(ActUserID, ExcUserID);
		//Assert.assertEquals(ActUserID, ExcUserID);
		Reporter.log( ActUserID +"User id Verify",true);

	}
	
	public void clickUserId()
	{
		UserId.click();
	}
	
	public void verifName(String ExpUserName, SoftAssert soft)
	{
		String Actusrnme = Username.getText();
	
		soft.assertEquals(Actusrnme, ExpUserName);
		//Assert.assertEquals(Actusrnme, ExpUserName);
		Reporter.log( Actusrnme +" Username Verify",true);

	}
	
	
	
	public void clickLogoutBtn()
	{
		LogoutBtn.click();
	}
	
}
