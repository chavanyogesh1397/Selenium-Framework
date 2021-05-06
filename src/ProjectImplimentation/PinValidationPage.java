package ProjectImplimentation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinValidationPage 
{
	@FindBy(xpath = "//input[@id='pin']") private WebElement Pin;
	@FindBy(xpath = "//button[@type='submit']") private WebElement PibBtn;
	
	public PinValidationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setPin(String pin)
	{
		Pin.sendKeys(pin);
	}
	
	public void clickPibBtn()
	{
		PibBtn.click();
	}
	
	
}
