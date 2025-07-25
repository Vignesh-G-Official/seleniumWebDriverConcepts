package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageScrolling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		
		//1.Scroll to a specific pixel
		//js.executeScript("window.scrollBy(0,1260)", "");
		//System.out.println("Scrolled pixel position: " +js.executeScript("return window.pageYOffset;"));
		
		//2.Scroll until the element is found
		/*
		WebElement button=driver.findElement(By.xpath("//button[@id='vote-poll-1']"));
		
		js.executeScript("arguments[0].scrollIntoView();", button);
		System.out.println("Scrolled pixel position: " +js.executeScript("return window.pageYOffset;"));
		button.click();
		*/
		
		//3.Scroll till end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println("Scrolled pixel position: " +js.executeScript("return window.pageYOffset;"));
		
		//4.Scroll back to top
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println("Scrolled pixel position: " +js.executeScript("return window.pageYOffset;"));
		

	}

}
