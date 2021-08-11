package Assertion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class EX2_fail 
{
	@Test
	 public void TC1()
	 {
		 Reporter.log("Hi",true);
	 }
	@Test
	 public void TC2()
	 {
		 Reporter.log("Hello",true);
	 }
 @Test
 public void TC3()
 {
	 Assert.fail();
 }
}
