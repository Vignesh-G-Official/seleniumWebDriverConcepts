package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListeners implements ITestListener
{

	public void onStart(ITestContext context) 
	{
	    System.out.println("onStart is implemented");	 
	}
	
	public void onTestStart(ITestResult result) 
	{
		System.out.println("on Test Start is implemented");
	  }
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("on Test Success is implemented");
	  }
	
	public void onTestFailure(ITestResult result) {
		System.out.println("on test failure is implemented");
	  }
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("on test skip is implemented");
	  }
	
	public void onFinish(ITestContext context) {
		System.out.println("on finish is implemented");
	  }
}

