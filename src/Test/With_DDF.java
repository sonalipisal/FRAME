package Test;

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
import org.openqa.selenium.chrome.ChromeOptions;

public class With_DDF
{
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	
	FileInputStream file=new FileInputStream("C:\\selenium\\kite.xlsx\\");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe\\");
	
	WebDriver driver=new ChromeDriver(options);
	
	driver.get("https://kite.zerodha.com/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	String UN = sh.getRow(0).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(UN);
	
	String PWD = sh.getRow(0).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PWD);
	
	driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	
	//enter pin
	String PIN = sh.getRow(0).getCell(2).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(PIN);
		
	//click continue btn
	driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	
	//verify userid
	
	String actid = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
    String expid="DV1510";
    
    if(actid.equals(expid))
    {
    	System.out.println("Verify UserID Correct");
    }
    else
    {
    	System.out.println("Verify UserID Incorrect");
    }
	
	
	
	
	
	
	
}
}
