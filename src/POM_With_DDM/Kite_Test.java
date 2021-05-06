package POM_With_DDM;

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

public class Kite_Test 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\chromedriver_win32new\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
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
		home.clickUserId();
		home.verifName(Excsheet.getRow(9).getCell(6).getStringCellValue());
		home.clickLogoutBtn();
	
	}
}
