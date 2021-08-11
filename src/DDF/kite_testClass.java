package DDF;

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

public class kite_testClass 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	
	FileInputStream file = new FileInputStream("C:\\Users\\admin\\Desktop\\vishal\\software testing\\Selenium Framework\\kite.xlsx");
    Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
    
    ChromeOptions opt=new ChromeOptions();
    opt.addArguments("--disable-notifications");

    System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe\\");
    
    WebDriver driver=new ChromeDriver(opt);
    
    driver.get("https://kite.zerodha.com");
    
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    driver.manage().window().maximize();
    
    kite1 login1=new kite1(driver);
    login1.inpkite1username(sh.getRow(0).getCell(0).getStringCellValue());
    login1.inpkite1password(sh.getRow(0).getCell(1).getStringCellValue());
    login1.clickkite1loginbtn();
    
    kite2 login2=new kite2(driver);
    login2.inpkite2pin(sh.getRow(0).getCell(2).getStringCellValue());
    login2.clickkite2continuebtn();
    
    kite_home home=new kite_home(driver);
    home.verifyID(sh.getRow(0).getCell(3).getStringCellValue());
    
}


}

