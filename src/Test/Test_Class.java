package Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test_Class 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
{
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	
	FileInputStream file=new FileInputStream("C:\\selenium\\kite.xlsx\\");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe\\");
	
	WebDriver driver=new ChromeDriver(options);
	
	driver.get("https://kite.zerodha.com/");
	
	driver.manage().window().maximize();
	
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	Thread.sleep(60000);	
	
	Without_DDF_POM_PAGEFACTORY_L1 login1=new Without_DDF_POM_PAGEFACTORY_L1(driver);
	login1.enterUN(sh.getRow(0).getCell(0).getStringCellValue());
	login1.enterPWD(sh.getRow(0).getCell(1).getStringCellValue());
	login1.login();
	
	Without_DDF_POM_PAGEFACTORY_L2 login2=new Without_DDF_POM_PAGEFACTORY_L2(driver);
	login2.enterPin(sh.getRow(0).getCell(2).getStringCellValue());
	login2.contbtn();
	
	Without_DDF_POM_PAGEFACTORY_L3 login3=new Without_DDF_POM_PAGEFACTORY_L3(driver);
	login3.verifyuserID(sh.getRow(0).getCell(3).getStringCellValue());
	
	
}
}
