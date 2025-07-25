package cssSelectorAndXpath;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class xPathSelector {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd=new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		wd.get("https://demo.nopcommerce.com/");
		wd.manage().window().maximize();
		
		//Xpath with single attribute
		wd.findElement(By.xpath("//input[@placeholder='Search store']")).sendKeys("Mac");
		
		//Thread.sleep(5000);
		//Xpath with multiple attribute
		wd.findElement(By.xpath("//input[@id='ui-id-1'][@tabindex='0']")).click();
		
		//Xpath with "And" "OR"
		//wd.findElement(By.xpath("//input[@name='q' and @placeholder='Search store']")).sendKeys("Mac");
		//wd.findElement(By.xpath("//input[@name='q' or @placeholder='Search store']")).sendKeys("Mac");
		
		//Xpath with text()- Inner text   -- Link text is different from this. Link text has href which is both link text and inner text
		//wd.findElement(By.xpath("//*[text()='Search']")).click();
		
		//Display status of text and capture the text
		//boolean textStatus=wd.findElement(By.xpath("//*[text=()='Welcome to our store']")).isDisplayed();
		//System.out.println(textStatus);
		
		//String displayedText=wd.findElement(By.xpath("//*[text=()='Welcome to our store']")).getText();
		//System.out.println(displayedText);
		
		//Xpath with Contains
		//wd.findElement(By.xpath("//*[contains(@placeholder,'store')]")).sendKeys("Mac");
		
		//Xpath with Start with
		//wd.findElement(By.xpath("//*[starts-with(@placeholder,'Searc')]")).sendKeys("Mac");
		
		//Chained Xpath
		wd.findElement(By.xpath("//div[@class='header-links']/ul/li[1]/a")).click();
		
		
		
		
		

	}

}
