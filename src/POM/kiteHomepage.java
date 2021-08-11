package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteHomepage 
{
	//step-1 declaration
@FindBy(xpath = "//span[@class='user-id']")private WebElement PrfileID;

    //step-2 Initilization
 public kiteHomepage (WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }

    //step-3 Usage
 
   public void VerifyProfileId()
   {
	  String actID = PrfileID.getText();
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


