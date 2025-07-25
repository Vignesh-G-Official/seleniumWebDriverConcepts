package dropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestedDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Accept all']")).click();
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("selenium");
		
		List <WebElement> cyOptions=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='presentation']"));
		System.out.println("Total Cypress:" +cyOptions.size());
		
		for(WebElement op:cyOptions)
		{
			System.out.println(op.getText());
		}

	}

}
