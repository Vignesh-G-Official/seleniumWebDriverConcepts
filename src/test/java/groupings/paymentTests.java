package groupings;

import org.testng.annotations.Test;

public class paymentTests {

	@Test(priority=1, groups= {"sanity","regression","functional"})
	void paymentinRupees()
	{
		System.out.println("Payment done in Rupess");
	}
	
	@Test(priority=2, groups={"sanity","regression","functional"})
	void paymentinDollars()
	{
		System.out.println("Payment done in Dollars");
	}
}
