package basicLocators;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class accessWebPageUsingLocators {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		if(title.equals("nopCommerce demo store. Home page title"))
		{
			System.out.println("Test Pass");
		}
		else {
			System.out.println("Test Fail");
		}
		
		//name
		/*driver.findElement(By.name("q")).sendKeys("Mac");
		boolean logostatus=driver.findElement(By.id("nivo-slider")).isDisplayed();
		System.out.println(logostatus);
		*/
		
		//driver.findElement(By.linkText("Wishlist")).click();
		
		List<WebElement> headerlinks=driver.findElements(By.tagName("li"));
		System.out.println("Total number of links: "+headerlinks.size());
		
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println("Total number of links: "+images.size());
		
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		
		List<WebElement> newlinks=driver.findElements(By.className("nav-item"));
		System.out.println("Total Links: "+newlinks.size());
		
		List<WebElement> newimages=driver.findElements(By.tagName("img"));
		System.out.println("Total Images: "+newimages.size());
		
		driver.findElement(By.linkText("Phones")).click();
		


	}

}
