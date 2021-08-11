package POM_PRACTICE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestClass 
{
public static void main(String[] args) {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe\\");
	WebDriver driver=new ChromeDriver(options);
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	driver.get("https://kite.zerodha.com");
	
	
	login1 l1 = new login1(driver);
	l1.username();
	l1.password();
	l1.login();
	
	login2 l2=new login2(driver);
	l2.pin();
	l2.continu();
	
	
	homepage home=new homepage(driver);
	home.VerifyProfileId();
}

}
