package Assertion;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft_assert 
{
@Test
public void TC1()
{
	String act="Hi";
	String exp="Hello";
	
	SoftAssert soft=new SoftAssert();
	soft.assertEquals(act, exp,"1st verification is failed both result are diff");
	
//	soft.assertNotEquals(act, exp,"both result are same");
	
	boolean result=false;
	soft.assertTrue(result,"2nd verification failed act result is false");
	
	String val="Sonali";
	soft.assertNotNull(val, "3rd verification failed field is null");
	
	Reporter.log("Verification completed", true);
	
	soft.assertAll();
}

}
