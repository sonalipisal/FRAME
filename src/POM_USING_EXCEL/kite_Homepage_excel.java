package POM_USING_EXCEL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kite_Homepage_excel
{
@FindBy(xpath = "//span[@class='user-id']")private WebElement ProfileID;

public kite_Homepage_excel(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void verifyID(String expID)
{
	String actid = ProfileID.getText();
	String expid="DV1510";
     if(actid.equals(expid))
	{
		System.out.println("pass");
	}
     else
     {
    	 System.out.println("fail");
     }
}
}
