package Multibrawser_compatibility_testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ex1_multi 
{
@Parameters("brawserName")
@Test 
public void TC(String brawserName) throws InterruptedException
{    
	WebDriver driver=null;
	if(brawserName.equals("chrome"))
	{
	 System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe\\");
	 driver=new ChromeDriver();
	}
	else if(brawserName.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe\\");
		driver=new FirefoxDriver();
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://kite.zerodha.com/");
	//driver.manage().window().maximize();
	Thread.sleep(2000);
	
	//enter user id
	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DV1510");
	
	//enter password
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Year@123");
		
	//click login btn
	driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
		
	//enter pin
	driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("959594");
		
	//click continue btn
	driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	
	//verify userid
	
	String actid = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
	
	String expid="DV1510";
	
	
	if(actid.equals(expid))
	{
		System.out.println("Test Case Passeed");
	}
	else
	{
		System.out.println("Test Case failed");
	}
	
	
}


}
