package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCases
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
	//2)keywords_priority
	
	@Test
	public void TC3()
	{
	 Reporter.log("Running TC3",true);
	 }
	
	//3)keywords_enabled
	@Test
	public void TC4()
	{
	 Reporter.log("Running TC4",true);
	 }
}
