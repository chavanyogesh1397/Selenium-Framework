package BaseCLass_UtilityClass;

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

public class KiteVerifyUidTest extends BaseClass
{
	KiteLoginPage page;
	PinValidationPage pin;
	Homepage home;
	ProfilePage profile;
	int Tid;

	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException
	{
		BaseClass.openBrows();
		page = new KiteLoginPage(driver);
		pin = new PinValidationPage(driver);
		home = new Homepage(driver);
		profile = new ProfilePage(driver);
	}
	
	@BeforeMethod
	public void login() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Thread.sleep(3000);
		page.setUserId(UtilityClass.getTestData(3,6));
		page.setPassword(UtilityClass.getTestData(4,6));
		page.ClickLoginBtn();
		Thread.sleep(3000);
		pin.setPin(UtilityClass.getTestData(6, 6));
		pin.clickPibBtn();
	}
	
	@Test
	public void verifyPin() throws EncryptedDocumentException, IOException
	{
		Tid = 100;
		String Actuid = home.verifyUid();
		String ExpUid = UtilityClass.getTestData(8, 6);
		Assert.assertEquals(Actuid, ExpUid,"Act and Exp result are matched");
		UtilityClass.CaptureScreenshot(driver, Tid);
	}
	
	@AfterMethod
	public void Logout() throws InterruptedException, IOException
	{
		
		profile.clickLogoutBtn();
	}
	
	@AfterClass
	public void closeBrow()
	{
		BaseClass.closeBrowser();
	}
	
	
}
