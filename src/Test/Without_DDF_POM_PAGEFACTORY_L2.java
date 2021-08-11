package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Without_DDF_POM_PAGEFACTORY_L2 
{
@FindBy(xpath = "//input[@id='pin']")private WebElement PIN;
@FindBy(xpath = "//button[@class='button-orange wide']")private WebElement CONTINUE;


public Without_DDF_POM_PAGEFACTORY_L2(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void enterPin(String p)
{
	PIN.sendKeys(p);
}
public void contbtn()
{
	CONTINUE.click();
}


}
