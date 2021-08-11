package DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kite2
{
	//step 1declaration
@FindBy(xpath = "//input[@id='pin'] ")private WebElement PIN;
@FindBy(xpath = "//button[@class='button-orange wide'] ")private WebElement CONBTN;

//step2 Initilization
public kite2(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

//step3 Usage
public void inpkite2pin(String pinno)
{
	PIN.sendKeys(pinno);
}

public void clickkite2continuebtn()
{
	CONBTN.click();
}

}
