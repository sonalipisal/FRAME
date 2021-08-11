package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class ex_annotations 
{
	@BeforeClass
	public void open_brawser()
	{
	 Reporter.log("opened brawser",true);
	 }
	@BeforeMethod
	public void login_app()
	{
	 Reporter.log("Login into application",true);
	 }
@Test
public void TC1()
{
 Reporter.log("Running TC1",true);
 }
@Test
public void TC2()
{
 Reporter.log("Running TC1",true);
 }
      @AfterMethod
      public void logout_app()
  	{
    	  Reporter.log("Logout the application",true);
  	 }
      @AfterClass
      public void closed_brawser()
  	{
  	 Reporter.log("closed brawser",true);
  	 }
}

