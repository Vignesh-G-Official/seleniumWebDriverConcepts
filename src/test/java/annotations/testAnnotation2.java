package annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class testAnnotation2 {

	@Test(priority=2)
	void advSearch()
	{
		System.out.println("Advanced Search is done");
	}
	
	@AfterTest
	void at()
	{
		System.out.println("This is after test annotation");
	}
}
