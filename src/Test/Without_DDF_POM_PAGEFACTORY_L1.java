package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Without_DDF_POM_PAGEFACTORY_L1
{
 //declaration
	
@FindBy(xpath = "//input[@id='userid']")private WebElement UN;
@FindBy(xpath = "//input[@id='password']")private WebElement PWD;
@FindBy(xpath = "//button[@class='button-orange wide']")private WebElement loginBtn;
	
	//initilization
public Without_DDF_POM_PAGEFACTORY_L1(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
	
	//usage
public void enterUN(String username)
{
	UN.sendKeys(username);
}
public void enterPWD(String pass)
{
	PWD.sendKeys(pass);
}
public void login()
{
	loginBtn.click();
}
}
