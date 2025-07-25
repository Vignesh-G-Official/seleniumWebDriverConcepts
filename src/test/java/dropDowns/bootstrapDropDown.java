package dropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootstrapDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		//Thread.sleep(8000);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(@class, 'multiselect')]")).click();       //Opens dropdown options
		
		//1.Select options from dropdown
		//driver.findElement(By.xpath("//input[@value='csharp']")).click();	
		
		//2.Capture all options and find the size
		List<WebElement> dDoptions=driver.findElements(By.xpath("//ul[contains(@class, 'multiselect')]//label"));
		System.out.println("Number of Options:" +dDoptions.size());
		
		//3.Printing options from dropdown
		for(WebElement op:dDoptions)
		{
			System.out.println(op.getText());
		}
		
		//4.Select multiple options from dropdown
		for(WebElement op:dDoptions)
		{
			String option=op.getText();
			
			if(option.equals("Java") || option.equals("MySQL") || option.equals("Python"))
			{
				op.click();
			}
		}

	}

}
