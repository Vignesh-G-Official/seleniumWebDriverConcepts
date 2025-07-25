package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class allannotation {

	@Test(priority=1)
	void search()
	{
		System.out.println("Test is done");
	}
	
	@BeforeMethod
	void bm()
	{
		System.out.println("Before method is done");
	}
	
	@AfterMethod
	void am()
	{
		System.out.println("After Method is done");
	}
	
	@BeforeClass
	void bc()
	{
		System.out.println("Before Class is done");
	}
	
	@AfterClass
	void ac()
	{
		System.out.println("After class is done");
	}
	
	@BeforeTest
	void bt()
	{
		System.out.println("Before Test is done");
	}
	
	@AfterTest
	void at()
	{
		System.out.println("After Test is done");
	}
	
	@BeforeSuite
	void bs()
	{
		System.out.println("Before Suite is done");
	}
	
	@AfterSuite
	void as()
	{
		System.out.println("After Suite is done");
	}
	
	
}
