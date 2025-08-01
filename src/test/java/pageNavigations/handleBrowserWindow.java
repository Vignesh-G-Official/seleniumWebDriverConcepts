package pageNavigations;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class handleBrowserWindow {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space () = 'OrangeHRM, Inc']")).click();
		Set<String> windowIDs=driver.getWindowHandles();
		
		//Appoach1
		/*
		List<String> windowList=new ArrayList<String>(windowIDs);
		
		String parentID=windowList.get(0);
		String childID=windowList.get(1);
		
		//switch to child window
		driver.switchTo(). window (childID);
		System.out.println(driver.getTitle());
		
		//switch to parent window
		driver.switchTo().window (parentID);
		System.out.println(driver.getTitle());
		*/
		
		//Approach2
		for(String winId:windowIDs)
		{
		String title=driver.switchTo().window (winId).getTitle();
		
		if(title.equals("OrangeHRM"))
		{
		System.out.println(driver.getCurrentUrl());
		//some validation on the parent window
		}
		}

	}

}
