package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class EX1_URL 
{
@Test
public void TC1()
{
	System.setProperty("webdriver.chrome.driver",
			"C:\\selenium\\chromedriver.exe\\");
	WebDriver driver=new ChromeDriver();
	driver.get("https://testng.org/doc/eclipse.html");
	
	Reporter.log("sonali pisal",true);
	Reporter.log("pune",true);
	
}
}
