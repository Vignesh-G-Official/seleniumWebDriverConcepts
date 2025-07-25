package annotations;
/*
 * Login
 * Search
 * Adv Search
 * Logout
 */

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class classAnnotation {

	@BeforeClass
	void login()
	{
		System.out.println("Logged in");
	}

	@AfterClass
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
