package groupings;

import org.testng.annotations.Test;

public class singupTests {

	@Test(priority=1, groups= {"sanity"})
	void signupByEmail()
	{
		System.out.println("Signed up by Email");
	}
	
	@Test(priority=2, groups= {"regression"})
	void signedupByFacebook()
	{
		System.out.println("Signed up by Facebook");
	}
	
	@Test(priority=2, groups={"sanity"})
	void signedupByTwitter()
	{
		System.out.println("Signed up by Twitter");
	}
}
