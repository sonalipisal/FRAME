package POM_PRACTICE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage
{
	@FindBy(xpath = "//span[@class='user-id']")private WebElement UserID;

	public homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	   public void VerifyProfileId()
	   {
		  String actID = UserID.getText();
		  String expID="DV1510";
		  
		  if(actID.equals(expID))
		  {
			  System.out.println("Pass");
		  }
		  else
		  {
			  System.out.println("Fail");
		  }
	   }
}
