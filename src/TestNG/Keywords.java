package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keywords
{
	//1)keywords_invocationcount
	@Test(invocationCount = 2)
	public void TC1()
	{
	 Reporter.log("Running TC1",true);
	 }
	@Test(invocationCount = 3)
	public void TC2()
	{
	 Reporter.log("Running TC2",true);
	 }
	//2)keywords_priority
	
	@Test(priority = 1)
	public void TC3()
	{
	 Reporter.log("Running TC3",true);
	 }
	
	//3)keywords_enabled
	@Test(enabled = false)
	public void TC4()
	{
	 Reporter.log("Running TC4",true);
	 }
	   
}
