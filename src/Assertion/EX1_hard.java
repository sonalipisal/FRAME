package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EX1_hard 
{ 
	//assertEquals
//    @Test
//    public void TC1()
//    {
//    	String actResult="Hello";
//    	String expResult="Hello";
//    	Assert.assertEquals(actResult, expResult,"Both results are different");//pass-exr both same
   // }
    
//    //assertNotEquals
//    @Test
//    public void TC2()
//    {
//    	String actResult="Hello";
//    	String expResult="Hello";
//    	Assert.assertNotEquals(actResult, expResult,"Both results are same");//fail exp-result diff but result is same
 //   }
    //assertTrue
	@Test
	public void TC3()
	{
		boolean result=true;
		Assert.assertTrue(result,"expected true tc failed");
	}
	//assertFalse
	@Test
	public void TC4()
	{
		boolean result=true;
		Assert.assertFalse(result,"expected false tc failed");
	}
	//NULL
	@Test
    public void TC5()
    {
    	String str="Sonali";
    	Assert.assertNull(str,"assert not 9null)empty tc failed");
    	
    }
	//NOT NULL
	@Test 
	public void TC6()
	{
		String str1=null;
		Assert.assertNotNull(str1,"assert is (null)empty TC failed");
	}
	
    	
    

}
