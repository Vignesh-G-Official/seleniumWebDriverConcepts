package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class hardVSsoftAssertions {

	@Test
	void hardAssertion()
	{
		System.out.println("Printing statement before Hard Assertions");
		Assert.assertEquals(1, 1);
		System.out.println("Printing statement after Hard Assertions");  //If assertion fails printing statement after assertion doesn't work
	}
	
	@Test
	void softAssertion()
	{
		System.out.println("Printing statement before Hard Assertions");
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(1, 2);  //When using soft assertions, printing statements after the failed assertion will work.
		System.out.println("Printing statement after Hard Assertions");
		sa.assertAll();   //Mandatory to make soft assertion work
	}
}
