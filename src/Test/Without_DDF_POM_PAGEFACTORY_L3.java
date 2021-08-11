package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Without_DDF_POM_PAGEFACTORY_L3
{
@FindBy(xpath ="//span[@class='user-id']" )private WebElement USERID;

public Without_DDF_POM_PAGEFACTORY_L3(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void verifyuserID(String pid)
{
	String actID = USERID.getText();

	
	if(actID.equals(pid))
	{
		System.out.println("passed");
	}
	else
	{
		System.out.println("failed");
	}
}
}
