package Kite_By_Stock;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Kite_Test 
{
	

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\chromedriver_win32new\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		
		FileInputStream file = new FileInputStream("E:\\Software Testing\\Selenium\\Frameworks\\Excel data\\Zerodha.xlsx");
		Sheet Excsheet = WorkbookFactory.create(file).getSheet("Login");
		
		Kite_LoginPage login = new Kite_LoginPage(driver);
		login.setUsername(Excsheet.getRow(3).getCell(6).getStringCellValue());
		login.setPassword(Excsheet.getRow(4).getCell(6).getStringCellValue());
		login.clickSubmitBtn();
		
		Login_PinPage pin = new Login_PinPage(driver);
		pin.setpin(Excsheet.getRow(6).getCell(6).getStringCellValue());
		pin.clickSubmitBtn();
		
		Kite_Homepage home = new Kite_Homepage(driver);
		home.verifyUserId(Excsheet.getRow(8).getCell(6).getStringCellValue());
		
		Search_DashboardPage search = new Search_DashboardPage(driver);
		search.setSearchBox(Excsheet.getRow(11).getCell(6).getStringCellValue());
		Thread.sleep(2000);
		search.moveTcsNSE(act);
		search.clickBuyBtn(act);
		
		Kite_BuyStock_Page buy = new Kite_BuyStock_Page(driver);
		buy.setQuantity(Excsheet.getRow(12).getCell(6).getStringCellValue());
		buy.setPrice(Excsheet.getRow(13).getCell(6).getStringCellValue());
		Thread.sleep(3000);
		buy.clickSlRadioBtn();
		buy.setTriggerPrice(Excsheet.getRow(14).getCell(6).getStringCellValue());
		buy.clickBuyBtn();
		
		home.clickUserId();
		home.verifName(Excsheet.getRow(9).getCell(6).getStringCellValue());
		Thread.sleep(4000);
		
		home.clickLogoutBtn();
		
		
	
	}
}
