package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Without_DDF
{
public static void main(String[] args)
{
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe\\");
	
	WebDriver driver=new ChromeDriver(options);
	
	driver.get("https://kite.zerodha.com/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
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
