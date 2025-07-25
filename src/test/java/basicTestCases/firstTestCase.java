package basicTestCases;

import org.testng.annotations.Test;

public class firstTestCase {
	@Test(priority=1)
	void openApp()
	{
		System.out.println("App opened...");
	}
	
	@Test(priority=2)
	void login()
	{
		System.out.println("Logged in to the app...");
	}
	
	@Test(priority=3)
	void logout()
	{
		System.out.println("Logged out of the app..");
	}
}
