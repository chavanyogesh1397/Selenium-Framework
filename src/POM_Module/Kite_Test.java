package POM_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite_Test 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\chromedriver_win32new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//Creating obj for Login page
		Kite_LoginPage login1 = new Kite_LoginPage(driver);
		login1.EnterUn();
		login1.EnterPwd();
		login1.LoginButton();
		Thread.sleep(2000);
		//Creating obj of PINPage class
		PIN_Page pin = new PIN_Page(driver);
		pin.EnterPIN();
		pin.Contbn();
		//Creating ob of HomePage class
		Kite_Homepage home = new Kite_Homepage(driver);
		home.UserIdVerified();
		
	
	}
}
