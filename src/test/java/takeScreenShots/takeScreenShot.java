package takeScreenShots;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class takeScreenShot {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//1. Take full page screenshot
		/*
		TakesScreenshot js=(TakesScreenshot)driver;
		File sourcefile=js.getScreenshotAs(OutputType.FILE);  //Calling getScreenshotAs from javascript interface
		//File targetfile=new File("E:\\Projects\\Selenium_Projects\\seleniumWebDriver\\Screenshots\\fullpageSS.png"); //Hardcoded file path
		File targetfile=new File(System.getProperty("user.dir")+"\\Screenshots\\fullpageSS.png"); //dynamic file path for different project location
		sourcefile.renameTo(targetfile); //copying source file in target file 
		*/
		
		//2. Capture screenshot of the specific location
		/*
		WebElement newFeatures=driver.findElement(By.xpath("//div[@class='news-items']"));
		File sourcefile=newFeatures.getScreenshotAs(OutputType.FILE);      //Calling getScreenshotAs from WebElement
		File targetfile=new File(System.getProperty("user.dir")+"\\Screenshots\\news.png");
		sourcefile.renameTo(targetfile);
		*/
		
		//3. Capturing specific web element - same as 2
		WebElement newFeatures=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File sourcefile=newFeatures.getScreenshotAs(OutputType.FILE);      //Calling getScreenshotAs from WebElement
		File targetfile=new File(System.getProperty("user.dir")+"\\Screenshots\\logo.png");
		sourcefile.renameTo(targetfile);
		
		driver.quit();
		
	}

}
