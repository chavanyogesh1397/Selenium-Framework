package Kite_testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_UserProfilePage 
{
	@FindBy(xpath="//span[@class='user-id']") private WebElement userId;
	@FindBy(xpath="//a[text()=' Logout']") private WebElement Logout;
	@FindBy(xpath="//h4[@class='username']") private WebElement Username;
	
	public Kite_UserProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickUserId()
	{
		userId.click();
	}
	
	public void VerifyUsername(String ExpeUsername)
	{
		String Uname = Username.getText();
		if(ExpeUsername.equals(Uname))
		{
			System.out.println(Uname + ": Username verify");
		}
		else
		{
			System.out.println(Uname +"Username not verify");
		}
	}
	
	public void clickLogoutBtn()
	{
		Logout.click();
	}
}
