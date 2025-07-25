package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentReportManager implements ITestListener{
	
	public ExtentSparkReporter sparkReporter; //UI of the report
	public ExtentReports extent;   //Populate common info on the report
	public ExtentTest test;      // Creating test case entries in the report and update status of the test methods
	
	public void onStart(ITestContext context) 
	{
	    sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReport.html"); //Specifies report location inside the project directory
	    
	    sparkReporter.config().setDocumentTitle("Automation Report");
	    sparkReporter.config().setReportName("Functional Testing");
	    sparkReporter.config().setTheme(Theme.DARK);
	    
	    extent=new ExtentReports();
	    extent.attachReporter(sparkReporter);
	    
	    extent.setSystemInfo("Computer Name", "LocalHost");
	    extent.setSystemInfo("Environment", "QA");
	    extent.setSystemInfo("Tester", "Vignesh");
	    extent.setSystemInfo("OS","Windows");
	    extent.setSystemInfo("Browser", "Chrome");
	}
	
	public void onTestSuccess(ITestResult result) {
		
		test = extent.createTest(result.getName());    //Create a new entry in the report. Result gets the information from test case. getName method gets the passed method name from test case.
		test.log(Status.PASS, "Test case Passed is:" +result.getName());  //Updates status p/f/s
		
	}
	
	public void onTestFailure(ITestResult result) {
		
		test= extent.createTest(result.getName());
		test.log(Status.FAIL, "Test case Failed is:" +result.getName());
		test.log(Status.FAIL, "Test case failed cause is" +result.getThrowable());
	}
	
	public void  onTestSkipped(ITestResult result){
		test= extent.createTest(result.getName());
		test.log(Status.SKIP, "Test case skipped is:" +result.getName());
	}
	
	public void onFinish(ITestResult result) {
		extent.flush();
	}
	

}
