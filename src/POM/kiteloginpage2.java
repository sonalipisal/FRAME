package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteloginpage2 
{
	//step=1 Declaration
	@FindBy(xpath="//input[@id='pin']")private WebElement PIN;
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement ContinueBtn;
	
	//step=2 Initilization
	kiteloginpage2 (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//step=3 Usage
	public void enterpin()
	{
		PIN.sendKeys("959594");
	}
	public void ContBtn()
	{
		ContinueBtn.click();
	}
	
}
