package ProjectImplimentation;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteTest 
{
	WebDriver driver;
	KiteLoginPage page;
	PinValidationPage pin;
	Homepage home;
	ProfilePage profile;
	
	FileInputStream file;
	Sheet sheet;
	
	
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\chromedriver_win32new\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(7000, TimeUnit.SECONDS);
		file = new FileInputStream("E:\\Software Testing\\Selenium\\Frameworks\\Excel data\\Zerodha.xlsx");
		sheet = WorkbookFactory.create(file).getSheet("Login");
		page = new KiteLoginPage(driver);
		pin = new PinValidationPage(driver);
		home = new Homepage(driver);
		profile = new ProfilePage(driver);
	}
	
	@BeforeMethod
	public void login() throws InterruptedException
	{
		page.setUserId(sheet.getRow(3).getCell(6).getStringCellValue());
		page.setPassword(sheet.getRow(4).getCell(6).getStringCellValue());
		page.ClickLoginBtn();
		Thread.sleep(3000);
		pin.setPin(sheet.getRow(6).getCell(6).getStringCellValue());
		pin.clickPibBtn();
	}
	
	@Test
	public void verifyPin()
	{
		String Actuid = home.verifyUid();
		String ExpUid = sheet.getRow(8).getCell(6).getStringCellValue();
		Assert.assertEquals(Actuid, ExpUid,"Act and Exp result are matched");
		
	}
	
	@AfterMethod
	public void Logout() throws InterruptedException
	{
		profile.clickLogoutBtn();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
	
}
