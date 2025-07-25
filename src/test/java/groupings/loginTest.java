package groupings;

import org.testng.annotations.Test;

public class loginTest {

	@Test(priority=1, groups= {"sanity"})
	void loginByEmail()
	{
		System.out.println("Logged in by Email");
	}
	
	@Test(priority=2, groups= {"sanity"})
	void loginByFacebook()
	{
		System.out.println("Logged by Facebook");
	}
	
	@Test(priority=3, groups= {"regression"})
	void loginByTwitter()
	{
		System.out.println("Logged by Twitter");
	}
}
