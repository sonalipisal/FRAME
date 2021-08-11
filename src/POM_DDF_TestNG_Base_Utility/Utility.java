package POM_DDF_TestNG_Base_Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility
{
	//@Author name: sonali
		//This method is use get inputs from excel sheet
		//need to pass 2 parameters ie. 1. rowIndex, 2. colIndex
		public static String getTestData(int rowIndex, int colIndex) throws EncryptedDocumentException, IOException 
		{
			FileInputStream file = new FileInputStream("C:\\Users\\admin\\Desktop\\vishal\\software testing\\Selenium Framework\\kite.xlsx");
			 org.apache.poi.ss.usermodel.Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
			String value = sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
			
			return value;
		}
		
		
		public static void captureScreenshot(WebDriver driver,int TCID) throws IOException  
		{
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest =new File("C:\\Users\\admin\\eclipse-workspace\\FRAME\\test-output\\TestCaseID"+TCID+".jpg");		
			FileHandler.copy(src, dest);
		}
		public static String ReadData(String sonali) throws IOException
		{
			FileInputStream file = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\selenium\\properties.properties");
			Properties property = new Properties();
			property.load(file);
			String value = property.getProperty(sonali);
			
			return value;
			
		}
}
