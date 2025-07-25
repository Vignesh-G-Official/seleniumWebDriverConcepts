package webDriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class waitMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd=new ChromeDriver();
		
		//WebDriverWait mywait=new WebDriverWait(wd, null);
		
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000)); //Implicit wait if specified time not sufficient throws exception
		
		wd.get("https://demo.nopcommerce.com/");
		wd.manage().window().maximize();
		
		//Xpath with single attribute
		wd.findElement(By.xpath("//input[@placeholder='Search store']")).sendKeys("Mac");
		
		//Thread.sleep(5000);       //Default wait method by java not by selenium webdriver
		
		
		//Xpath with multiple attribute
		wd.findElement(By.xpath("//input[@id='ui-id-1'][@tabindex='0']")).click();

	}

}
