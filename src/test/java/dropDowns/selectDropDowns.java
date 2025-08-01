package dropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectDropDowns {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement countryDD=driver.findElement(By.xpath("//select[@id='country']"));
		Select country=new Select(countryDD); 
		
		//Select options from dropdown
		
		//country.selectByVisibleText("Canada");		
		//country.selectByValue("France");		
		//country.selectByIndex(0);
		
		//Capture options from the dropdown
		
		List<WebElement> options=country.getOptions();
		System.out.println("Number of options in Dropdown:" +options.size());
		
		/*
		for(int i=0; i<options.size(); i++)
		{
			System.out.println(options.get(i).getText());
		}
		*/
		
		for(WebElement option:options)
		{
			System.out.println(option.getText());
		}
		

	}

}
