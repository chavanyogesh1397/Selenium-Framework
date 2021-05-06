package Kite_Zerodha;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Kite_Test 
{
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\chromedriver_win32new\\chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		Kite_LoginPage login = new Kite_LoginPage(driver);		
		login.setUsername();
		login.setPassword();
		login.clickLoginbtn();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Thread.sleep(2000);
		Kite_PIN_VerifyPage pin = new Kite_PIN_VerifyPage(driver);
		pin.setPin();
		pin.ClickContinueBtn();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Kite_Homepage home = new Kite_Homepage(driver);
		home.Verify_UserId();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Kite_UserProfilePage pro = new Kite_UserProfilePage(driver);
		pro.clickUserId();
		pro.VerifyUsername();
		pro.clickLogoutBtn();
		
		driver.close();
		
	}
}
