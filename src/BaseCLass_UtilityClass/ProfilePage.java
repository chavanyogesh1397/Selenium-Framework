package BaseCLass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage 
{
	@FindBy(xpath = "//a[text()=' Logout']") private WebElement LogoutBtn;
	@FindBy(xpath = "//span[@class='user-id']") private WebElement userId;
	
	public ProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogoutBtn()
	{
		userId.click();
		LogoutBtn.click();
	}
}
