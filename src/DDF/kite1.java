package DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kite1 
{
	//step 1declaration
	
@FindBy(xpath = "//input[@id='userid']")private WebElement UN;
@FindBy(xpath = "//input[@id='password']")private WebElement PWD;
@FindBy(xpath = "//button[@class='button-orange wide']")private WebElement LOGIN;

	//step 2  Initilization
public kite1 (WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

	//step 3 Usage

public void inpkite1username(String user)
{
	UN.sendKeys(user);
}
public void inpkite1password(String pass)
{
	PWD.sendKeys(pass);
}
public void clickkite1loginbtn()
{
	LOGIN.click();
}

}
