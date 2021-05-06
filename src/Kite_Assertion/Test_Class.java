package Kite_Assertion;

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
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_Class 
{
	WebDriver driver;
	FileInputStream file;
	Sheet excsheet;
	
	
	@BeforeClass
	public void login() throws FileNotFoundException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@BeforeMethod
	public void Login() throws EncryptedDocumentException, IOException 
	{
		//Login Page
		file = new FileInputStream("E:\\Software Testing\\Selenium\\Frameworks\\Excel data\\Zerodha.xlsx");
		excsheet = WorkbookFactory.create(file).getSheet("Login");
		Kite_LoginPage log = new Kite_LoginPage(driver);
		try
		{
			log.setUsername(excsheet.getRow(3).getCell(6).getStringCellValue());
		}
		catch(Exception e)
		{
			
		}
		
		log.setPassword(excsheet.getRow(4).getCell(6).getStringCellValue());
		log.clickSubmitBtn();
		
		//Pin Page
		Login_PinPage pin = new Login_PinPage(driver);
		pin.setpin(excsheet.getRow(6).getCell(6).getStringCellValue());
		pin.clickSubmitBtn();
	}
	
	//Verify UserID
	@Test(priority=1)
	public void verifyUserId()
	{
		SoftAssert soft = new SoftAssert();
		Kite_Homepage home = new Kite_Homepage(driver);
		//home.clickUserId();
		home.verifyUserId(excsheet.getRow(8).getCell(6).getStringCellValue(),soft);
		home.clickUserId();
		soft.assertAll();
	}
	
	//VerifyUserName
	@Test(priority=2)
	public void veifyUsername()
	{
		SoftAssert soft = new SoftAssert();
		Kite_Homepage home = new Kite_Homepage(driver);
		home.clickUserId();
		home.verifName(excsheet.getRow(9).getCell(6).getStringCellValue(),soft);
		//home.clickUserId();
		soft.assertAll();
	}
	
	
	@AfterMethod
	public void logout() throws InterruptedException
	{
		Kite_Homepage  home = new Kite_Homepage(driver);
		home.clickLogoutBtn();
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
}
