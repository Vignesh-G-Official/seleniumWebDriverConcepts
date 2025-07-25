package chromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headlessTestRun {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();  //creating object for chromeoptions
		options.addArguments("--headless=new");	//Setting headless from chromeoptions object
		WebDriver driver=new ChromeDriver(options);  //calling options in the driver object otherwise headless whouldn't work
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		
		if(title.equals("OrangeHRM"))
		{
			System.out.println("Test Pass");
			
		}
		else {
			System.out.println("Test Fail");
		}
		
		driver.quit();

	}

}
