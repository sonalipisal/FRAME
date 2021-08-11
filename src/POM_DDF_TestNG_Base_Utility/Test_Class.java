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
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Test_Class                                                                                                                   extends BaseClass
{
	kite_loginpage1_excel login1;
	kite_loginpage2_excel login2;
	kite_Homepage_excel Home;
	

	@BeforeClass
	public void openbrwswer() throws EncryptedDocumentException, IOException
	{
		Reporter.log("open brwser");
		initializeBrowser();
		login1=new kite_loginpage1_excel(driver);
		 login2=new kite_loginpage2_excel(driver);
		 Home=new kite_Homepage_excel(driver);
	}
	
	
   @BeforeMethod
   public void loginapplication() throws EncryptedDocumentException, IOException
   {  
		Reporter.log("login app");
		login1.inpkiteloginpage1username(Utility.getTestData(0, 0));
		login1.inpkiteloginpage1password(Utility.getTestData(0, 1));
		login1.clickkiteloginpageloginbtn();
		
		login2.inpkiteloginpage2pin(Utility.getTestData(0, 2));
		login2.clickkiteloginpage2contBtn();
		}
	
	
	@Test
	public void verifyuserID() throws EncryptedDocumentException, IOException
	{
		int TCID=100;
		Reporter.log("Running verifyUserIdTest Scripts");
		//Home.verifyID(sh.getRow(0).getCell(3).getStringCellValue());
		
		String expUserID=Utility.getTestData(0, 3);
		String actUserID=Home.gethomePageUserID();
		
		Assert.assertEquals(actUserID, actUserID,"actUserID &  actUserID both are different");
	}
   @AfterMethod
   public void logoutapplication()
   {
	   Reporter.log("logout app");
//	   
   }
   @AfterClass
	public void closebrwswer()
	{
		Reporter.log("close brwser");
		driver.close();
	}
}