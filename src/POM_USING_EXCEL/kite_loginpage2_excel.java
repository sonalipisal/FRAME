package POM_USING_EXCEL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kite_loginpage2_excel
{
@FindBy(xpath = "//input[@id='pin']")private WebElement PIN;
@FindBy(xpath = "//button[@class='button-orange wide']")private WebElement ContinueBtn;

public kite_loginpage2_excel(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void inpkiteloginpage2pin(String pinval)
{
	PIN.sendKeys(pinval);
}
public void clickkiteloginpage2contBtn()
{
	ContinueBtn.click();
}
}
