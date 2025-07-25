package dropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddenDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[contains(@class, 'oxd-button')]")).click();
		
		//Click on PM
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
		
		driver.findElement(By.xpath("//body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='oxd-table-filter']/div[@class='oxd-table-filter-area']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[6]/div[1]/div[2]/div[1]/div[1]")).click();
		
		//Thread.sleep(8000);
		//Select single options
		//driver.findElement(By.xpath("//*[text()='Tosca']")).click();
		
		List<WebElement> dOptions=driver.findElements(By.xpath("//div[contains(@class, 'oxd-select-option')]//span"));
		System.out.println("Number of options:" +dOptions.size());
		
		for(WebElement op:dOptions)
		{
			System.out.println(op.getText());
		}
		
		driver.findElement(By.xpath("//body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='oxd-table-filter']/div[@class='oxd-table-filter-area']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[3]/div[1]/div[2]/div[1]/div[1]")).click();
		List<WebElement> ESoptions=driver.findElements(By.xpath("//div[contains(@class, 'oxd-select-option')]//span"));
		System.out.println("Number of Emp:" +ESoptions.size());
		
		for(WebElement ESop:ESoptions)
		{
			System.out.println(ESop.getText());
		}
		
		driver.findElement(By.xpath("//*[text()='Freelance']")).click();

	}

}
