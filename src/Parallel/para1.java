package Parallel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class para1
{
@Test
public void TC1() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe\\" );
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.javatpoint.com/");
    Thread.sleep(3000);
    driver.close();
}
}
