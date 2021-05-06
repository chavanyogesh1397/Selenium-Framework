package BaseCLass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
	@FindBy(xpath = "//span[@class='user-id']") private WebElement userId;
	
	
	Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyUid()
	{
		String Uid = userId.getText();
		return Uid;
	}
}
