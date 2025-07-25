package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptExecutorDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//ChromeDriver driver=new ChromeDriver();    //We don't need use type casting while creating javascript variable 
		                                             //when creating object from chrome driver
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement inputbox=driver.findElement(By.xpath("//input[@id='name']"));
		
		// passing the text into inputbox - alternate of sendKeys()  //This can be used when there is element intercepted exceptions
		JavascriptExecutor js=(JavascriptExecutor) driver; //Javascript Executor js-driver;
		js.executeScript("arguments[0].setAttribute('value', 'John')", inputbox);
		
		//Clicking element - alternative for using .click() method
		WebElement radiobtn=driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()",radiobtn);

	}

}
