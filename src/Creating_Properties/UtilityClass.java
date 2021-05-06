package Creating_Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	public static String getTestData(int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\yogesh\\eclipse-workspace\\Selenium FrameWork\\Test data\\Zerodha.xlsx");
		Sheet sht = WorkbookFactory.create(file).getSheet("Login");
		String data = sht.getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	
	public static void CaptureScreenshot(WebDriver driver,int Tid) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\yogesh\\eclipse-workspace\\Selenium FrameWork\\Screenshots\\"+Tid+"verifypin.jpeg");
		FileHandler.copy(source, dest);
	}
	
	public static String getPropertiesData(String key) throws IOException
	{
		Properties pro = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Confidential.properties");
		pro.load(file);
		String value = pro.getProperty(key);
		return value;
	}
}
