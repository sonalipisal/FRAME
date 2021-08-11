package POM_PRACTICE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login2
{

	//declaration
	@FindBy(xpath = "//input[@id='pin']")private WebElement PIN;
	@FindBy(xpath = "//button[@class='button-orange wide']")private WebElement CBTN;
	
	//initilization
	
	public login2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//usage
	public void pin()
	{
		PIN.sendKeys("959594");
	}
	public void continu()
	{
		CBTN.click();
	}
}
