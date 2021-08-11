package POM_DDF_TestNG;

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
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class newkite_login_testNG
{
	kite_loginpage1_excel login1;
	kite_loginpage2_excel login2;
	kite_Homepage_excel Home;
	Sheet sh;
	 WebDriver driver;
	@BeforeClass
	public void openbrwswer() throws EncryptedDocumentException, IOException
	{
		Reporter.log("open brwser");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe\\");
	    driver=new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com");
		
		FileInputStream file = new FileInputStream("C:\\Users\\admin\\Desktop\\vishal\\software testing\\Selenium Framework\\kite.xlsx");
		 sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		 login1=new kite_loginpage1_excel(driver);
		 login2=new kite_loginpage2_excel(driver);
		 Home=new kite_Homepage_excel(driver);
	}
	
	
   @BeforeMethod
   public void loginapplication()
   {  
		Reporter.log("login app");
		login1.inpkiteloginpage1username(sh.getRow(0).getCell(0).getStringCellValue());
		login1.inpkiteloginpage1password(sh.getRow(0).getCell(1).getStringCellValue());
		login1.clickkiteloginpageloginbtn();
		
		login2.inpkiteloginpage2pin(sh.getRow(0).getCell(2).getStringCellValue());
		login2.clickkiteloginpage2contBtn();
		}
	
	
	@Test
	public void verifyuserID()
	{
		int TCID=100;
		Reporter.log("Running verifyUserIdTest Scripts");
		//Home.verifyID(sh.getRow(0).getCell(3).getStringCellValue());
		
		String expUserID=sh.getRow(0).getCell(3).getStringCellValue();
		String actUserID=Home.gethomePageUserID();
		
		Assert.assertEquals(actUserID, actUserID,"actUserID &  actUserID both are different");
	}
   @AfterMethod
   public void logoutapplication()
   {
	   Reporter.log("logout app");
	   
   }
   @AfterClass
	public void closebrwswer()
	{
		Reporter.log("close brwser");
		driver.close();
	}
}