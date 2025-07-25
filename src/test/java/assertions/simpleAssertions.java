package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class simpleAssertions {

	/*
	@Test
	void testTitle()   //Method without Testng assertions
	{
		String exp_title="Opencart";
		String act_title="Opencart";
		
		if(exp_title.equals(act_title))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
	}
	*/
	
	/*@Test
	void testTitle()      //Method with Testng assertions
	{
		String exp_title="Opencart";
		String act_title="Opencart";
		
		Assert.assertEquals(exp_title, act_title);
	}
	*/
	
	@Test
	void testTitle()   //Method with both condition statement and Testng assertions
	{
		String exp_title="Opencart";
		String act_title="Opencart";
		
		if(exp_title.equals(act_title))
		{
			System.out.println("Test Passed");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Test Failed");
			Assert.assertFalse(false);
		}
		
	}
}
