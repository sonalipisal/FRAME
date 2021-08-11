package POM_PRACTICE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login1 
{
//variable declaration
	@FindBy(xpath = "//input[@id='userid']")private WebElement UN;
	@FindBy(xpath = "//input[@id='password']")private WebElement PWD;
	@FindBy(xpath = "//button[@class='button-orange wide']")private WebElement LOGIN;
	
	//INITILIZATION
	public login1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//usage
	
	public void username()
	{
		UN.sendKeys("DV1510");
	}
	public void password()
	{
		PWD.sendKeys("Year@123");
	}
	public void login()
	{
		LOGIN.click();
	}
}
