package Kite_testNG;

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
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest 
{
	WebDriver driver;
	FileInputStream file;
	Sheet sh;
	
	@BeforeClass
	public void OpenUrl() throws EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\chromedriver_win32new\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		file = new FileInputStream("E:\\Software Testing\\Selenium\\Frameworks\\Excel data\\Zerodha.xlsx");
		sh = WorkbookFactory.create(file).getSheet("Login");
	}
	
	@BeforeMethod
	public void Login() throws InterruptedException
	{
		Login_Page log = new Login_Page(driver);
		Thread.sleep(3000);
		log.setUsername(sh.getRow(3).getCell(6).getStringCellValue());
		log.setPassword(sh.getRow(4).getCell(6).getStringCellValue());
		log.clickLoginbtn();
		
		Kite_PIN_VerifyPage pin = new Kite_PIN_VerifyPage(driver);
		Thread.sleep(3000);
		pin.setPin(sh.getRow(6).getCell(6).getStringCellValue());
		pin.ClickContinueBtn();
	}
	
//	@BeforeMethod
//	public void enterPIN() throws InterruptedException
//	{
//		
//	}
	
	@Test
	public void verifyUserId()
	{
		Kite_Homepage home = new Kite_Homepage(driver);
		home.Verify_UserId(sh.getRow(8).getCell(6).getStringCellValue());
		Reporter.log("User verify",true);
		home.clickuserId();
		Reporter.log(sh.getRow(8).getCell(6).getStringCellValue() + "User verify");
		
		Kite_UserProfilePage username = new Kite_UserProfilePage(driver);
		username.VerifyUsername(sh.getRow(9).getCell(6).getStringCellValue());
		Reporter.log(sh.getRow(9).getCell(6).getStringCellValue() + "UserName verify");
	}
	
//	@Test(priority=3)
//	public void VerifyUserName()
//	{
//		
//	}
	@AfterMethod
	public void Logout()
	{
		Kite_UserProfilePage username = new Kite_UserProfilePage(driver);
		username.clickLogoutBtn();
	}
	
}
