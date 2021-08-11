package DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class with_DDF {
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe\\");
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	driver.get("https://kite.zerodha.com");
	
	FileInputStream File=new FileInputStream("C:\\Users\\admin\\Desktop\\vishal\\software testing\\Selenium Framework\\kite.xlsx");
	Sheet sh = WorkbookFactory.create(File).getSheet("Sheet1");
	
	//enter user id
	String userid = sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(userid);
		
		//enter password
		String pwd = sh.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
			
		//click login btn
		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
			
		//enter pin
		String pin = sh.getRow(0).getCell(2).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
			
		//click continue btn
		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
		
		//verify userid
		
		String actuserid = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		String expuserid = sh.getRow(0).getCell(3).getStringCellValue();
		
		
		if(actuserid.equals(expuserid))
		{
			System.out.println("Test Case Passeed");
		}
		else
		{
			System.out.println("Test Case failed");
		}
}	
	     
}
