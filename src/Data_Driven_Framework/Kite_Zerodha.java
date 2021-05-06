package Data_Driven_Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite_Zerodha 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//opening Excel sheet
		FileInputStream file = new FileInputStream("E:\\Software Testing\\Selenium\\Frameworks\\Excel data\\Zerodha.xlsx");
		Sheet sheet1 = WorkbookFactory.create(file).getSheet("Login");
		
		//Get url from excel sheet
		String url = sheet1.getRow(2).getCell(6).getStringCellValue();
		
		//Opening URL
		driver.manage().window().maximize();
		driver.get(url);
		
		//Set Timing using implicitlyWait
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//Entering user name
		String User_id = sheet1.getRow(3).getCell(6).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(User_id);
		
		//Entering user name
		String Password = sheet1.getRow(4).getCell(6).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
		
		//Click on Login button
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		
		//Entering PIN
		String PIN = sheet1.getRow(6).getCell(6).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(PIN);
		
		//Click on Continue
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
		
		//validating correct user ID
		String Exp_usid = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		if(User_id.equals(Exp_usid))
		{
			System.out.println("User id validation succesfully");
		}
		else
		{
			System.out.println("User id validation Failed");
		}
	
	}
}
