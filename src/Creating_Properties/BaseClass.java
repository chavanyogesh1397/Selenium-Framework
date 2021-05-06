package Creating_Properties;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass 
{
	static WebDriver driver;
	public static void openBrows() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\chromedriver_win32new\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(UtilityClass.getPropertiesData("URL"));
		driver.manage().timeouts().implicitlyWait(7000, TimeUnit.SECONDS);
	}
	
	public static void closeBrowser()
	{
		driver.close();
	}
}
