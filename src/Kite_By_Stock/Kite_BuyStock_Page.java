package Kite_By_Stock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_BuyStock_Page 
{
	@FindBy(xpath="//input[@type='number']") private WebElement Quantity ;
	@FindBy(xpath="//input[@label='Price']") private WebElement Price;
	@FindBy(xpath="//label[text()='SL']") private WebElement SlRadioBtn;
	@FindBy(xpath="//input[@label='Trigger price']") private WebElement TriggerPrice ;
	@FindBy(xpath="//button[@type='submit']") private WebElement BuyBtn ;
	
	
	public Kite_BuyStock_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setQuantity(String Qty)
	{
		Quantity.sendKeys(Qty);
	}
	
	public void setPrice(String price)
	{
		Price.clear();
		Price.sendKeys(price);
	}
	
	
	public void clickSlRadioBtn()
	{
		SlRadioBtn.click();
	}
	
	public void setTriggerPrice(String Trgprice)
	{
		TriggerPrice.click();
		TriggerPrice.clear();
		TriggerPrice.sendKeys(Trgprice);
	}
	
	public void clickBuyBtn()
	{
		BuyBtn.click();
	}

	
}
