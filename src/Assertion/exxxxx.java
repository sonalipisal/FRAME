package Assertion;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exxxxx
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
	   System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe\\");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://kite.zerodha.com/");
	   
		FileInputStream file = new FileInputStream("C:\\selenium\\kite.xlsx\\");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");

		String un = sh.getRow(0).getCell(0).getStringCellValue();
		String pwd = sh.getRow(0).getCell(1).getStringCellValue();
		String pin = sh.getRow(0).getCell(2).getStringCellValue();
		
		System.out.println(un);
		System.out.println(pwd);
		System.out.println(pin);
		
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(un);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
		Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
		
		
		
		
		
	}
}
