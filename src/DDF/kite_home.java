package DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kite_home 
{
@FindBy(xpath = "//span[@class='user-id']")private WebElement ProfileID;

public kite_home(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void verifyID(String expId)
{
	String ActID = ProfileID.getText();
	String expID="DV1510";
	
	if(ActID.equals(expID))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
}

}
