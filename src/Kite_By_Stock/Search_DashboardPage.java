package Kite_By_Stock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_DashboardPage 
{
	@FindBy(xpath = "//input[@id='search-input']") private WebElement SearchBox;
	@FindBy(xpath="//li[@class='search-result-item selected isadded']") private WebElement TcsNSE;
	@FindBy(xpath = "//button[text()='B ']") private WebElement BuyBtn;
	
	public Search_DashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setSearchBox(String StockName)
	{
		SearchBox.click();
		SearchBox.sendKeys(StockName);
	}
	
	public void moveTcsNSE(Actions act) throws InterruptedException
	{
		Thread.sleep(3000);
		act.moveToElement(TcsNSE).perform();
		act.moveToElement(BuyBtn).perform();
	}
	
	public void clickBuyBtn(Actions act)
	{
		act.click(BuyBtn).perform();
	}
}
