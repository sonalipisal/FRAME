package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class kiteloginpage1
{
//step=1 Declaration
@FindBy(xpath="//input[@id='userid']")private WebElement UN;
@FindBy(xpath="//input[@id='password']")private WebElement PWD;
@FindBy(xpath="//button[@class='button-orange wide']")private WebElement LoginBtn;
	
	//step-2 Initilization
	
    public kiteloginpage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//step-3 Usage
	
	public void enterUN()
	{
		UN.sendKeys("DV1510");
	}
	public void enterPWD()
	{
		PWD.sendKeys("Year@123");
	}
	public void clickLogin()
	{
		LoginBtn.click();
	}
	
	
}
