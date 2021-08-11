package Parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class para2 
{
	@Test
	public void TC1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe\\" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
	    Thread.sleep(3000);
	    driver.close();
}
}
