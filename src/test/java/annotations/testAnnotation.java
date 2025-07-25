package annotations;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testAnnotation {
	
	@Test(priority=1)
	void search()
	{
		System.out.println("Search is done");
	}
	
	@BeforeTest
	void bt()
	{
		System.out.println("This is before test annotation");
	}
}
