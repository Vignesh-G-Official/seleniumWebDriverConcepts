package pageNavigations;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class navigationAssignments {

	public static void main(String[] args) {
		
		/*Assignment
		https://testautomationpractice.blogspot.com/ I
		1) provide some string search for it
		2) count number of links
		3) click on each link using for loop
		4) get window ID's for every browser window
		5) close specific browser window
		*/
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		List<WebElement> headerLinks=driver.findElements(By.id("#wikipedia-search-result-link"));
		System.out.println("Number of Links: "+headerLinks.size());
		
	}

}
