package POM_DDF_TestNG_Base_Utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class BaseClass 
{ 
	WebDriver driver;
	
	public void initializeBrowser() throws IOException
	{
	Reporter.log("open brwser");
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe\\");
    driver=new ChromeDriver(options);
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//driver.manage().window().maximize();
	
	driver.get(Utility.ReadData("URL"));
	
	}
}
