package annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * Login
 * search
 * logout
 * login
 * Adv Search
 * logout
 */

public class methodAnnotation {
	
	@BeforeMethod
	void login()
	{
		System.out.println("Logged in");
	}

	@AfterMethod
	void logout()
	{
		System.out.println("Logged out");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("Search is done");
	}
	
	@Test(priority=2)
	void advSearch()
	{
		System.out.println("Advanced Search is done");
	}
}
