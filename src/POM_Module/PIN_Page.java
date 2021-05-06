package POM_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIN_Page 
{
	//Find WebElement and stored in global variable
	@FindBy(xpath="//input[@type='password']") private WebElement PIN;
	@FindBy(xpath="//button[@type='submit']") private WebElement ContineuBtn;
	
	//creating public Constructor
	public PIN_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//creating methods for storing values
	public void EnterPIN()
	{
		PIN.sendKeys("959594");
	}
	public void Contbn()
	{
		ContineuBtn.click();
	}
}
