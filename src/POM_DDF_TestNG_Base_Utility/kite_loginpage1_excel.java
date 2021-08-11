package POM_DDF_TestNG_Base_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kite_loginpage1_excel
{
@FindBy(xpath = "//input[@id='userid']")private WebElement UN;
@FindBy(xpath = "//input[@id='password']")private WebElement PWD;
@FindBy(xpath = "//button[@class='button-orange wide']")private WebElement LoginBTN;

//Step-2 Initilization
public kite_loginpage1_excel(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
//step-3 Usage
public void inpkiteloginpage1username(String username)
{
	UN.sendKeys(username);
}
public void inpkiteloginpage1password(String passwrd)
{
	PWD.sendKeys(passwrd);
}
public void clickkiteloginpageloginbtn()
{
	LoginBTN.click();
}

}
