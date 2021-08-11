package Assertion;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example_DependsOnMethods 
{
	@Test
	public void TC1()
	{
	 Reporter.log("Running TC1",true);
	 }
	@Test
	public void TC2()
	{
	 Reporter.log("Running TC2",true);
	 }
	
	
	@Test(dependsOnMethods = "TC1")
	public void TC3()
	{
	 Reporter.log("Running TC3",true);
	 }
}
