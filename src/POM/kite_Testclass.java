package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class kite_Testclass 
{
public static void main(String[] args) {
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe\\");
	WebDriver driver=new ChromeDriver(options);
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	driver.get("https://kite.zerodha.com");
	//page1 object &method
	kiteloginpage1 login1=new kiteloginpage1(driver);
	login1.enterUN();
	login1.enterPWD();
	login1.clickLogin();
	
	
	//page2 object &method
	kiteloginpage2 login2=new kiteloginpage2(driver);
	
    login2.enterpin();
    login2.ContBtn();

  //page3 object &method
    kiteHomepage home=new kiteHomepage (driver);
    home.VerifyProfileId();

	
	
}
}
