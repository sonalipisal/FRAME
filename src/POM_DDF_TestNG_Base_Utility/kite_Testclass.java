package POM_DDF_TestNG_Base_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import POM.kiteloginpage1;

public class kite_Testclass 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe\\");
    WebDriver driver=new ChromeDriver(options);
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	driver.get("https://kite.zerodha.com");
	
	FileInputStream file = new FileInputStream("C:\\Users\\admin\\Desktop\\vishal\\software testing\\Selenium Framework\\kite.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	
	kite_loginpage1_excel login1=new kite_loginpage1_excel(driver);
	login1.inpkiteloginpage1username(sh.getRow(0).getCell(0).getStringCellValue());
	login1.inpkiteloginpage1password(sh.getRow(0).getCell(1).getStringCellValue());
	login1.clickkiteloginpageloginbtn();
	
	kite_loginpage2_excel login2=new kite_loginpage2_excel(driver);
	login2.inpkiteloginpage2pin(sh.getRow(0).getCell(2).getStringCellValue());
	login2.clickkiteloginpage2contBtn();
	
	kite_Homepage_excel Home=new kite_Homepage_excel(driver);
	//Home.verif(sh.getRow(0).getCell(3).getStringCellValue());
	Home.gethomePageUserID();
	
}
}
