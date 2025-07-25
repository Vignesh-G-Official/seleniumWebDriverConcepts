package mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClickActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		try {
			WebElement acceptCookies=driver.findElement(By.xpath("//div[contains(@class,'sn-b-def  sn-blue')]"));
			acceptCookies.click();
		}
		catch(Exception e) {
			System.out.println("No cookies");
		}
		
		driver.switchTo().frame("iframeResult");
		
		WebElement field1=driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement field2=driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		field1.clear();
		field1.sendKeys("Welcome");
		
		Actions act=new Actions(driver);
		act.moveToElement(button).doubleClick().perform();
		
		String copiedText=field2.getAttribute("value");
		
		System.out.println("Copied Text: "+ copiedText);
		
		if(copiedText.equals("Welcome"))
		{
			System.out.println("Text Copied Properly");
		}
		else {
			System.out.println("Text not copied properly");
		}
		
	}

}
