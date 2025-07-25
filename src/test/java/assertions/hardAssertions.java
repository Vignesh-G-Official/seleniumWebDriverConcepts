package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hardAssertions {

	@Test
	void test()
	{
		//Assert.assertEquals("abc", "abc");
		//Assert.assertEquals(123, 123);
		
		//Assert.assertEquals("abc", 123);
		//Assert.assertEquals("123", 123);
		
		//Assert.assertNotEquals(123, 123);  //Fail
		//Assert.assertNotEquals(123, 345);  //Pass
		
		//Assert.assertTrue(true);   //Pass
		//Assert.assertTrue(false);  //Fail
		
		//Assert.assertTrue(1==1);   //Pass
		//Assert.assertTrue(1==2);  //Fail
		
		//Assert.assertFalse(1==2);  //Pass
		//Assert.assertFalse(1==1);  //True
		
		Assert.fail();
	}
}
