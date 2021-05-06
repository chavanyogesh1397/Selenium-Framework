package POM_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Homepage 
{
	//find Element and store in global varibale
	@FindBy(xpath="//span[@class='user-id']") private WebElement UserId;
	String ActUserID= "DV1510";
	//Create global constructor with parameter
	public Kite_Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Create Methods for perform task
	public void UserIdVerified()
	{
		String usr = UserId.getText();
		if(ActUserID.equals(usr))
		{
			System.out.println(usr +": User Id verified");
		}
		else 
		{
			System.out.println("User Id not verified");
		}
	}
}
