package basicTestScript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class accessChromeBrowser {

	public static void main(String[] args) {
		
		//Launching browser (Chrome)
		//ChromeDriver cd=new ChromeDriver();   //Assigning object to same class variable
		
		WebDriver driver=new ChromeDriver();  //Assigning object to parent class variable so in future we can store for any time of browser
		
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
