package webTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class paginationTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		driver.findElement(By.name("username")).sendKeys("demo");
		driver.findElement(By.name("password")).sendKeys("demo");
		driver.findElement(By.xpath("//button[contains(@class,'btn')]"));
		
		driver.findElement(By.xpath("//a[contains(@class,'parent')][normalize-space()='Customers']")).click();
		driver.findElement(By.xpath("//ul[contains(@class,'collapse')]//a[normalize-space()='Customers']")).click();
		
		//Find total number of pages
		String text=driver.findElement(By.xpath("//div[contains(@class,'col-sm-6')[contains,text(),'Showing']]")).getText();
		String count=text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1);
		
		int totalPages=Integer.parseInt(count);
		
		//Navigate to all the pages
        for(int p=1; p<=totalPages; p++)
        {
        	if(p>1)
        	{
        		driver.findElement(By.xpath("//ul[@class='pagination']//*[text()='+p+']")).click();
        	}
        	
        	//Reading data from page
        	int totalRows=driver.findElements(By.xpath("//table[contains[@class,'table']//tbody//tr")).size();
        	
        	for(int r=1; r<=totalRows; r++);
        	{
        		String customerName=driver.findElement(By.xpath("//table[contains[@class,'table']//tbody//tr['+r+']//td[2]")).getText();
        		String email=driver.findElement(By.xpath("//table[contains[@class,'table']//tbody//tr['+r+']//td[3]")).getText();
        		
        		System.out.println(customerName+"\t"+email);
        	}
        }
	}

}
