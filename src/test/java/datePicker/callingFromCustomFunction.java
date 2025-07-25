package datePicker;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class callingFromCustomFunction {
    
	static void selectFutureDate(WebDriver driver, String month, String year, String date) {

    	while(true)
		{
			String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(month.equals(currentMonth) && year.equals(currentYear))
			{
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();   //Future date
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();     //previous date button
		}
		
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
		for(WebElement dt:allDates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}
	}
	
		static void selectPreviousDate(WebDriver driver, String month, String year, String date) {

	    	while(true)
			{
				String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
				String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
				
				if(month.equals(currentMonth) && year.equals(currentYear))
				{
					break;
				}
				
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();   //Future date
				//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();     //previous date button
			}
			
			List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
			for(WebElement dt:allDates)
			{
				if(dt.getText().equals(date))
				{
					dt.click();
					break;
				}
			}
    }
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		
		//Method 2 - Using loop to select the data in calendar
		driver.findElement(By.xpath("//input[@class='hasDatepicker']")).click();  //open date picker
		
		//String month="October";
		//String year="2010";
		//String date="10";
		selectFutureDate(driver, "April", "2029", "19");
		//selectPreviousDate(driver, "April", "2019", "19");
		
		
	}


}
