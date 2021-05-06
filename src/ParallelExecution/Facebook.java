package ParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Facebook 
{
	WebDriver driver;
	@Parameters("browserName")
	@Test
	public void module1(String browserName)
	{
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\chromedriver_win32new\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.google.com/");
		}
		
//		else if(browserName.equals("firefox"))
//		{
//			System.setProperty("webdriver.gecko.driver", "E:\\Software Testing\\Selenium\\selenium\\geckdriver\\geckodriver.exe");
//			driver= new FirefoxDriver();
//			driver.get("https://www.google.com/");
//		}
//		
//		else if(browserName.equals("IE"))
//		{
//			System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\selenium\\chromedriver.exe");
//			driver = new ChromeDriver();
//			driver.get("https://www.facebook.com/");
//		}
		
	}
}
